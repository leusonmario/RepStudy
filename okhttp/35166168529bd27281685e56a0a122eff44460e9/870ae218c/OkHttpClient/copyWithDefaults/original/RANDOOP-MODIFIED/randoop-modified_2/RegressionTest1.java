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
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        java.net.CookieHandler cookieHandler15 = okHttpClient10.getCookieHandler();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient10.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setHostnameVerifier(hostnameVerifier5);
        java.net.Proxy proxy7 = okHttpClient3.getProxy();
        java.lang.Class<?> wildcardClass8 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setAuthenticator(okAuthenticator6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient3.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setCookieHandler(cookieHandler10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient15.getConnectionPool();
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setProxySelector(proxySelector17);
        java.lang.Class<?> wildcardClass19 = okHttpClient15.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = okHttpClient3.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNull(responseCache9);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setProxySelector(proxySelector23);
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection26 = okHttpClient18.open(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient0.setHostnameVerifier(hostnameVerifier10);
        java.net.CookieHandler cookieHandler12 = okHttpClient0.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(cookieHandler12);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient11.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient11.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setAuthenticator(okAuthenticator16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setHostnameVerifier(hostnameVerifier18);
        java.net.ProxySelector proxySelector20 = okHttpClient19.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(proxySelector20);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        java.lang.Class<?> wildcardClass11 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient0.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxySelector(proxySelector7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setHostnameVerifier(hostnameVerifier11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient7.getSslSocketFactory();
        java.lang.Class<?> wildcardClass14 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxy(proxy11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxySelector(proxySelector13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setConnectionPool(connectionPool15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        java.lang.Class<?> wildcardClass18 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setConnectionPool(connectionPool11);
        java.net.ProxySelector proxySelector13 = okHttpClient10.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient6.getHostnameVerifier();
        java.net.ResponseCache responseCache11 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setResponseCache(responseCache13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setAuthenticator(okAuthenticator15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.ProxySelector proxySelector19 = okHttpClient18.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient11.getHostnameVerifier();
        boolean boolean15 = okHttpClient11.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient11.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient11.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory10);
        java.lang.Class<?> wildcardClass12 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient6.getHostnameVerifier();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setProxy(proxy14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient6.setResponseCache(responseCache16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(connectionPool18);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        java.lang.Class<?> wildcardClass13 = okHttpClient6.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setCookieHandler(cookieHandler7);
        java.lang.Class<?> wildcardClass9 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setProxySelector(proxySelector9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setResponseCache(responseCache13);
        java.net.Proxy proxy15 = okHttpClient14.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient15.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient15.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient15.getSslSocketFactory();
        java.net.ResponseCache responseCache19 = okHttpClient15.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNull(connectionPool17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = okHttpClient3.getProxySelector();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient3.setCookieHandler(cookieHandler12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient13.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        java.net.ResponseCache responseCache10 = okHttpClient3.getResponseCache();
        java.net.ResponseCache responseCache11 = okHttpClient3.getResponseCache();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient3.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient10.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient11.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = sSLSocketFactory14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient6.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(connectionPool8);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        java.net.ResponseCache responseCache16 = okHttpClient13.getResponseCache();
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setResponseCache(responseCache17);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient13.open(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setProxySelector(proxySelector9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient6.getConnectionPool();
        java.lang.Class<?> wildcardClass14 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(connectionPool13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setConnectionPool(connectionPool6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        boolean boolean10 = okHttpClient2.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient11.getHostnameVerifier();
        java.net.CookieHandler cookieHandler13 = okHttpClient11.getCookieHandler();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setCookieHandler(cookieHandler14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = okHttpClient11.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(okAuthenticator18);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = okHttpClient8.getCookieHandler();
        java.net.CookieHandler cookieHandler10 = okHttpClient8.getCookieHandler();
        java.net.Proxy proxy11 = okHttpClient8.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient8.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setProxySelector(proxySelector23);
        java.net.Proxy proxy25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient18.setProxy(proxy25);
        java.lang.Class<?> wildcardClass27 = okHttpClient26.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = okHttpClient9.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient9.getAuthenticator();
        java.net.ResponseCache responseCache12 = okHttpClient9.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(responseCache12);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient2.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setProxySelector(proxySelector15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = okHttpClient16.getProxy();
        java.net.Proxy proxy20 = okHttpClient16.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNull(proxy20);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setConnectionPool(connectionPool8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setAuthenticator(okAuthenticator10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setResponseCache(responseCache16);
        java.net.Proxy proxy18 = okHttpClient15.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.ProxySelector proxySelector5 = okHttpClient4.getProxySelector();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxy(proxy7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setAuthenticator(okAuthenticator14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setConnectionPool(connectionPool16);
        java.lang.Class<?> wildcardClass18 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient10.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setResponseCache(responseCache15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient6.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setConnectionPool(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setProxySelector(proxySelector13);
        java.net.ProxySelector proxySelector15 = okHttpClient14.getProxySelector();
        java.net.CookieHandler cookieHandler16 = okHttpClient14.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
        org.junit.Assert.assertNull(cookieHandler16);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector5 = okHttpClient0.getProxySelector();
        boolean boolean6 = okHttpClient0.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setProxySelector(proxySelector15);
        java.net.ProxySelector proxySelector17 = okHttpClient6.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache10 = okHttpClient3.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient12.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        boolean boolean15 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache16 = okHttpClient10.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setConnectionPool(connectionPool19);
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection22 = okHttpClient20.open(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient13.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory15);
        java.net.Proxy proxy17 = okHttpClient13.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache10 = okHttpClient3.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setAuthenticator(okAuthenticator11);
        java.lang.Class<?> wildcardClass13 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        java.net.CookieHandler cookieHandler7 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient9.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(cookieHandler7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ResponseCache responseCache8 = okHttpClient4.getResponseCache();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = okHttpClient5.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient5.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient14.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(okAuthenticator15);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = okHttpClient0.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient0.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient0.getAuthenticator();
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient0.setProxy(proxy15);
        java.lang.Class<?> wildcardClass17 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = okHttpClient4.getProxy();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxySelector(proxySelector7);
        java.lang.Class<?> wildcardClass9 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient7.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = connectionPool11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient0.getSslSocketFactory();
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        boolean boolean11 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setProxySelector(proxySelector12);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setSSLSocketFactory(sSLSocketFactory23);
        com.squareup.okhttp.ConnectionPool connectionPool25 = okHttpClient22.getConnectionPool();
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection27 = okHttpClient22.open(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(connectionPool25);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setConnectionPool(connectionPool10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setCookieHandler(cookieHandler12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setResponseCache(responseCache14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setResponseCache(responseCache16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient17.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.Proxy proxy13 = okHttpClient12.getProxy();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient12.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setAuthenticator(okAuthenticator9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxy(proxy11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = okHttpClient0.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.ProxySelector proxySelector13 = okHttpClient10.getProxySelector();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setProxySelector(proxySelector14);
        java.net.Proxy proxy16 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient10.getHostnameVerifier();
        java.lang.Class<?> wildcardClass18 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setAuthenticator(okAuthenticator9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient8.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setAuthenticator(okAuthenticator7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler10 = okHttpClient9.getCookieHandler();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient9.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient2.getHostnameVerifier();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setResponseCache(responseCache6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient2.getSslSocketFactory();
        boolean boolean9 = okHttpClient2.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector10 = okHttpClient2.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(hostnameVerifier5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(proxySelector10);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        java.net.ResponseCache responseCache16 = okHttpClient13.getResponseCache();
        java.net.CookieHandler cookieHandler17 = okHttpClient13.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNull(cookieHandler17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setAuthenticator(okAuthenticator9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxy(proxy11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient14.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setHostnameVerifier(hostnameVerifier18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setConnectionPool(connectionPool8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient5.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient5.getAuthenticator();
        java.lang.Class<?> wildcardClass12 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = okHttpClient18.getSslSocketFactory();
        java.net.ProxySelector proxySelector24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient18.setProxySelector(proxySelector24);
        java.net.Proxy proxy26 = okHttpClient18.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(proxy26);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxy(proxy11);
        java.net.ResponseCache responseCache13 = okHttpClient9.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient9.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNull(connectionPool14);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setCookieHandler(cookieHandler17);
        java.net.Proxy proxy19 = okHttpClient16.getProxy();
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient16.open(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setHostnameVerifier(hostnameVerifier16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient13.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(connectionPool18);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient8.getSslSocketFactory();
        java.net.CookieHandler cookieHandler11 = okHttpClient8.getCookieHandler();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient8.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        java.net.CookieHandler cookieHandler15 = okHttpClient12.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setAuthenticator(okAuthenticator9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxySelector(proxySelector11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setProxySelector(proxySelector9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient10.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient10.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setConnectionPool(connectionPool3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        java.net.Proxy proxy9 = okHttpClient6.getProxy();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setConnectionPool(connectionPool14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient8.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient8.setProxySelector(proxySelector18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setAuthenticator(okAuthenticator7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient6.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient6.getAuthenticator();
        boolean boolean11 = okHttpClient6.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient7.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(true);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient7.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        java.lang.Class<?> wildcardClass17 = okHttpClient14.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient8.getHostnameVerifier();
        java.lang.Class<?> wildcardClass13 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        java.net.ProxySelector proxySelector10 = okHttpClient9.getProxySelector();
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setAuthenticator(okAuthenticator6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.lang.Class<?> wildcardClass9 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        boolean boolean7 = okHttpClient3.getFollowProtocolRedirects();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient3.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler19 = okHttpClient18.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = okHttpClient18.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = okHttpClient18.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = okAuthenticator21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(cookieHandler19);
        org.junit.Assert.assertNull(hostnameVerifier20);
        org.junit.Assert.assertNull(okAuthenticator21);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass12 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler9 = okHttpClient0.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
        org.junit.Assert.assertNull(cookieHandler9);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        java.lang.Class<?> wildcardClass14 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setProxySelector(proxySelector15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setProxy(proxy19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setConnectionPool(connectionPool21);
        java.net.CookieHandler cookieHandler23 = okHttpClient20.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(cookieHandler23);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient0.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxySelector(proxySelector7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = okHttpClient8.getCookieHandler();
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setProxy(proxy12);
        java.lang.Class<?> wildcardClass14 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory12);
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setProxySelector(proxySelector15);
        java.lang.Class<?> wildcardClass17 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector19 = okHttpClient16.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setHostnameVerifier(hostnameVerifier20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setSSLSocketFactory(sSLSocketFactory22);
        com.squareup.okhttp.ConnectionPool connectionPool24 = okHttpClient21.getConnectionPool();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection26 = okHttpClient21.open(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(connectionPool24);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient8.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient10.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setHostnameVerifier(hostnameVerifier11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient7.getSslSocketFactory();
        boolean boolean14 = okHttpClient7.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxySelector(proxySelector13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient14.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(connectionPool15);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setConnectionPool(connectionPool8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setAuthenticator(okAuthenticator10);
        java.net.ProxySelector proxySelector12 = okHttpClient4.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient4.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient4.setConnectionPool(connectionPool14);
        java.net.ProxySelector proxySelector16 = okHttpClient15.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = proxySelector16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNull(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient11.getConnectionPool();
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setResponseCache(responseCache13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient14.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient14.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(connectionPool12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(okAuthenticator15);
        org.junit.Assert.assertNull(okAuthenticator16);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setProxySelector(proxySelector2);
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setCookieHandler(cookieHandler4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setAuthenticator(okAuthenticator6);
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        java.net.Proxy proxy11 = okHttpClient6.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setConnectionPool(connectionPool12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setConnectionPool(connectionPool11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient6.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler11 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setConnectionPool(connectionPool12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient4.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setHostnameVerifier(hostnameVerifier10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        boolean boolean14 = okHttpClient11.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache15 = okHttpClient11.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory16);
        java.net.ResponseCache responseCache18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setResponseCache(responseCache18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = okHttpClient11.getHostnameVerifier();
        boolean boolean21 = okHttpClient11.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(hostnameVerifier20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        boolean boolean9 = okHttpClient4.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient4.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient14.getAuthenticator();
        java.lang.Class<?> wildcardClass16 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(okAuthenticator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient2.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setHostnameVerifier(hostnameVerifier12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient4.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient15.getConnectionPool();
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setResponseCache(responseCache17);
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient15.setProxy(proxy19);
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection22 = okHttpClient15.open(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setCookieHandler(cookieHandler11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient12.getHostnameVerifier();
        java.lang.Class<?> wildcardClass14 = okHttpClient12.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection6 = okHttpClient4.open(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        java.net.ProxySelector proxySelector8 = okHttpClient3.getProxySelector();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient10.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setConnectionPool(connectionPool10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass15 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setAuthenticator(okAuthenticator15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        boolean boolean19 = okHttpClient18.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setConnectionPool(connectionPool8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient6.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setResponseCache(responseCache12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setFollowProtocolRedirects(true);
        boolean boolean16 = okHttpClient8.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass17 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        boolean boolean12 = okHttpClient10.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        java.net.ResponseCache responseCache15 = okHttpClient14.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient14.getConnectionPool();
        boolean boolean17 = okHttpClient14.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient14.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.Proxy proxy12 = okHttpClient10.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setCookieHandler(cookieHandler15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient18.open(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.Proxy proxy12 = okHttpClient10.getProxy();
        java.net.Proxy proxy13 = okHttpClient10.getProxy();
        java.net.CookieHandler cookieHandler14 = okHttpClient10.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNull(cookieHandler14);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setResponseCache(responseCache15);
        java.lang.Class<?> wildcardClass17 = okHttpClient16.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler11 = okHttpClient7.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setConnectionPool(connectionPool13);
        java.net.ResponseCache responseCache15 = okHttpClient14.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.CookieHandler cookieHandler9 = okHttpClient8.getCookieHandler();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setProxySelector(proxySelector10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient8.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.CookieHandler cookieHandler9 = okHttpClient8.getCookieHandler();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        java.net.ResponseCache responseCache12 = okHttpClient8.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setCookieHandler(cookieHandler6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient9.getSslSocketFactory();
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setResponseCache(responseCache11);
        java.lang.Class<?> wildcardClass13 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient7.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = connectionPool11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler11 = okHttpClient7.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setConnectionPool(connectionPool12);
        java.lang.Class<?> wildcardClass14 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ResponseCache responseCache8 = okHttpClient7.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        boolean boolean15 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setProxySelector(proxySelector16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setAuthenticator(okAuthenticator18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setResponseCache(responseCache20);
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection23 = okHttpClient21.open(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setProxySelector(proxySelector12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient10.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        java.net.CookieHandler cookieHandler12 = okHttpClient6.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient6.getSslSocketFactory();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setProxySelector(proxySelector14);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient15.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(cookieHandler12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setHostnameVerifier(hostnameVerifier16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setConnectionPool(connectionPool18);
        java.net.ProxySelector proxySelector20 = okHttpClient15.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(proxySelector20);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        java.net.ProxySelector proxySelector17 = okHttpClient12.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setConnectionPool(connectionPool6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setAuthenticator(okAuthenticator6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient3.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory11);
        java.net.ProxySelector proxySelector13 = okHttpClient3.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setResponseCache(responseCache9);
        java.net.ResponseCache responseCache11 = okHttpClient7.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setProxySelector(proxySelector2);
        boolean boolean4 = okHttpClient3.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxySelector(proxySelector11);
        java.lang.Class<?> wildcardClass13 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setCookieHandler(cookieHandler8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient3.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient8.getHostnameVerifier();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient8.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setConnectionPool(connectionPool10);
        java.lang.Class<?> wildcardClass12 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setHostnameVerifier(hostnameVerifier7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient3.getSslSocketFactory();
        java.net.CookieHandler cookieHandler12 = okHttpClient3.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(cookieHandler12);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ProxySelector proxySelector6 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setAuthenticator(okAuthenticator7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient0.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient2.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        java.net.ResponseCache responseCache16 = okHttpClient13.getResponseCache();
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setResponseCache(responseCache17);
        java.lang.Class<?> wildcardClass19 = okHttpClient18.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.net.ResponseCache responseCache4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setResponseCache(responseCache4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setResponseCache(responseCache6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        java.net.Proxy proxy10 = okHttpClient9.getProxy();
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient15.getSslSocketFactory();
        java.net.ResponseCache responseCache18 = okHttpClient15.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNull(responseCache18);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setFollowProtocolRedirects(false);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient11.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        boolean boolean10 = okHttpClient8.getFollowProtocolRedirects();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient8.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient2.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setResponseCache(responseCache8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setResponseCache(responseCache10);
        java.net.Proxy proxy12 = okHttpClient7.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setCookieHandler(cookieHandler14);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient11.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        boolean boolean15 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache16 = okHttpClient10.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setConnectionPool(connectionPool19);
        java.lang.Class<?> wildcardClass21 = okHttpClient18.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setAuthenticator(okAuthenticator7);
        java.lang.Class<?> wildcardClass9 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.Proxy proxy13 = okHttpClient12.getProxy();
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxy(proxy14);
        java.net.ProxySelector proxySelector16 = okHttpClient12.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setAuthenticator(okAuthenticator17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient18.getAuthenticator();
        java.net.CookieHandler cookieHandler20 = okHttpClient18.getCookieHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = cookieHandler20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
        org.junit.Assert.assertNull(cookieHandler20);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
        java.net.CookieHandler cookieHandler15 = okHttpClient13.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNull(cookieHandler15);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector19 = okHttpClient16.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setHostnameVerifier(hostnameVerifier20);
        java.net.CookieHandler cookieHandler22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setCookieHandler(cookieHandler22);
        java.lang.Class<?> wildcardClass24 = okHttpClient23.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient11.getAuthenticator();
        java.net.CookieHandler cookieHandler14 = okHttpClient11.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(cookieHandler14);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory8);
        java.net.ProxySelector proxySelector10 = okHttpClient9.getProxySelector();
        java.lang.Class<?> wildcardClass11 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient0.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxySelector(proxySelector7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setResponseCache(responseCache9);
        java.lang.Class<?> wildcardClass11 = okHttpClient0.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setProxy(proxy10);
        java.lang.Class<?> wildcardClass12 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient3.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        java.net.ResponseCache responseCache18 = okHttpClient16.getResponseCache();
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setCookieHandler(cookieHandler19);
        java.lang.Class<?> wildcardClass21 = okHttpClient20.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNull(responseCache18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient6.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setProxySelector(proxySelector9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient6.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setCookieHandler(cookieHandler13);
        java.net.CookieHandler cookieHandler15 = okHttpClient7.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient7.getHostnameVerifier();
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient7.setCookieHandler(cookieHandler17);
        boolean boolean19 = okHttpClient18.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient7.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setAuthenticator(okAuthenticator13);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient7.setHostnameVerifier(hostnameVerifier16);
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxySelector(proxySelector18);
        java.lang.Class<?> wildcardClass20 = okHttpClient17.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient12.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient12.getSslSocketFactory();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient12.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        java.net.ProxySelector proxySelector9 = okHttpClient7.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler11 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setConnectionPool(connectionPool12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient4.setFollowProtocolRedirects(false);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient15.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector19 = okHttpClient16.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setHostnameVerifier(hostnameVerifier20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setSSLSocketFactory(sSLSocketFactory22);
        java.net.CookieHandler cookieHandler24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setCookieHandler(cookieHandler24);
        java.lang.Class<?> wildcardClass26 = okHttpClient21.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool4 = okHttpClient2.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(connectionPool4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setConnectionPool(connectionPool9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setConnectionPool(connectionPool11);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxySelector(proxySelector13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setConnectionPool(connectionPool15);
        java.lang.Class<?> wildcardClass17 = okHttpClient12.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setAuthenticator(okAuthenticator9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxy(proxy11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        boolean boolean17 = okHttpClient14.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient3.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(hostnameVerifier6);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient0.getCookieHandler();
        java.net.ProxySelector proxySelector6 = okHttpClient0.getProxySelector();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient0.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxySelector6);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setProxySelector(proxySelector12);
        java.net.ProxySelector proxySelector14 = okHttpClient10.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = okHttpClient18.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(connectionPool19);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient7.getHostnameVerifier();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient7.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass14 = okHttpClient13.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        boolean boolean15 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setProxySelector(proxySelector16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setAuthenticator(okAuthenticator18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setResponseCache(responseCache20);
        java.net.ResponseCache responseCache22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setResponseCache(responseCache22);
        boolean boolean24 = okHttpClient23.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.Proxy proxy12 = okHttpClient10.getProxy();
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = okHttpClient18.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = okHttpClient18.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNull(hostnameVerifier20);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient10.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setResponseCache(responseCache13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setAuthenticator(okAuthenticator15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setCookieHandler(cookieHandler19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient16.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(connectionPool21);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient7.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient7.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.CookieHandler cookieHandler11 = okHttpClient6.getCookieHandler();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setProxySelector(proxySelector12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient6.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient7.setHostnameVerifier(hostnameVerifier16);
        java.net.Proxy proxy18 = okHttpClient17.getProxy();
        java.net.Proxy proxy19 = okHttpClient17.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(proxy18);
        org.junit.Assert.assertNull(proxy19);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setHostnameVerifier(hostnameVerifier8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.Proxy proxy14 = okHttpClient11.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient11.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxy14);
        org.junit.Assert.assertNull(connectionPool15);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxySelector(proxySelector11);
        java.net.ResponseCache responseCache13 = okHttpClient8.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass19 = okHttpClient18.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient6.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient16.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setProxySelector(proxySelector23);
        java.lang.Class<?> wildcardClass25 = okHttpClient24.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setAuthenticator(okAuthenticator8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient9.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setProxySelector(proxySelector23);
        com.squareup.okhttp.OkAuthenticator okAuthenticator25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setAuthenticator(okAuthenticator25);
        javax.net.ssl.HostnameVerifier hostnameVerifier27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient24.setHostnameVerifier(hostnameVerifier27);
        java.lang.Class<?> wildcardClass29 = okHttpClient24.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setResponseCache(responseCache23);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setSSLSocketFactory(sSLSocketFactory25);
        java.lang.Class<?> wildcardClass27 = okHttpClient26.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setCookieHandler(cookieHandler18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory20);
        java.net.ProxySelector proxySelector22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient16.setProxySelector(proxySelector22);
        java.net.ResponseCache responseCache24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient16.setResponseCache(responseCache24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = okHttpClient16.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = okHttpClient16.getSslSocketFactory();
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection29 = okHttpClient16.open(uRL28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(hostnameVerifier26);
        org.junit.Assert.assertNull(sSLSocketFactory27);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setHostnameVerifier(hostnameVerifier10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        boolean boolean14 = okHttpClient11.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass15 = okHttpClient11.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setAuthenticator(okAuthenticator7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient6.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = okHttpClient0.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient0.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setResponseCache(responseCache6);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient3.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setConnectionPool(connectionPool10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxySelector(proxySelector14);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        java.net.ProxySelector proxySelector8 = okHttpClient3.getProxySelector();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setCookieHandler(cookieHandler9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient3.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = responseCache14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        boolean boolean14 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setProxySelector(proxySelector15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient8.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = hostnameVerifier17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setHostnameVerifier(hostnameVerifier12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass16 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.Proxy proxy4 = okHttpClient0.getProxy();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setResponseCache(responseCache7);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient8.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        boolean boolean13 = okHttpClient12.getFollowProtocolRedirects();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient12.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient10.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setProxy(proxy11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient5.setFollowProtocolRedirects(true);
        boolean boolean15 = okHttpClient5.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient5.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient17.getHostnameVerifier();
        java.net.CookieHandler cookieHandler19 = okHttpClient17.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNull(cookieHandler19);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory13);
        java.lang.Class<?> wildcardClass15 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient10.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        java.net.ProxySelector proxySelector12 = okHttpClient11.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient11.getAuthenticator();
        java.lang.Class<?> wildcardClass14 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setCookieHandler(cookieHandler13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setHostnameVerifier(hostnameVerifier12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setResponseCache(responseCache16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient17.open(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        boolean boolean15 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setProxySelector(proxySelector16);
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        java.net.Proxy proxy12 = okHttpClient6.getProxy();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        java.net.CookieHandler cookieHandler19 = okHttpClient18.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory20);
        java.lang.Class<?> wildcardClass22 = okHttpClient21.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(cookieHandler19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient6.getHostnameVerifier();
        java.net.ResponseCache responseCache8 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        java.net.ResponseCache responseCache12 = okHttpClient10.getResponseCache();
        boolean boolean13 = okHttpClient10.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient10.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setAuthenticator(okAuthenticator15);
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient8.setProxySelector(proxySelector17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(hostnameVerifier19);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector13 = okHttpClient12.getProxySelector();
        java.net.ResponseCache responseCache14 = okHttpClient12.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setAuthenticator(okAuthenticator15);
        java.lang.Class<?> wildcardClass17 = okHttpClient12.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setCookieHandler(cookieHandler13);
        java.net.CookieHandler cookieHandler15 = okHttpClient7.getCookieHandler();
        java.net.ProxySelector proxySelector16 = okHttpClient7.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient7.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setAuthenticator(okAuthenticator19);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.Proxy proxy4 = okHttpClient0.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = proxy4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = okHttpClient4.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setConnectionPool(connectionPool7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient4.getConnectionPool();
        java.net.Proxy proxy10 = okHttpClient4.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient7.getHostnameVerifier();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient7.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setProxy(proxy16);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient11.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setCookieHandler(cookieHandler11);
        java.net.ProxySelector proxySelector13 = okHttpClient9.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = okHttpClient0.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient10.getAuthenticator();
        boolean boolean14 = okHttpClient10.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setResponseCache(responseCache12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory14);
        java.net.CookieHandler cookieHandler16 = okHttpClient15.getCookieHandler();
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setProxy(proxy17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient15.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(cookieHandler16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(hostnameVerifier19);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient0.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(connectionPool8);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient11.getHostnameVerifier();
        java.net.ResponseCache responseCache15 = okHttpClient11.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setHostnameVerifier(hostnameVerifier16);
        java.lang.Class<?> wildcardClass18 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxy(proxy8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setProxySelector(proxySelector10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setProxy(proxy12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient15.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(okAuthenticator16);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        java.lang.Class<?> wildcardClass12 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        java.lang.Class<?> wildcardClass18 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setSSLSocketFactory(sSLSocketFactory8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxySelector(proxySelector10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient11.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(connectionPool12);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setConnectionPool(connectionPool7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.getConnectionPool();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient8.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setCookieHandler(cookieHandler8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient9.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = okHttpClient3.getProxySelector();
        boolean boolean12 = okHttpClient3.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy15 = okHttpClient14.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setHostnameVerifier(hostnameVerifier9);
        boolean boolean11 = okHttpClient8.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        boolean boolean3 = okHttpClient2.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass4 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient10.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.ProxySelector proxySelector5 = okHttpClient4.getProxySelector();
        java.net.ProxySelector proxySelector6 = okHttpClient4.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient4.getConnectionPool();
        java.net.ResponseCache responseCache8 = okHttpClient4.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setHostnameVerifier(hostnameVerifier9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient4.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache8 = okHttpClient3.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setAuthenticator(okAuthenticator9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setProxySelector(proxySelector11);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setConnectionPool(connectionPool11);
        java.lang.Class<?> wildcardClass13 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setConnectionPool(connectionPool9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxy(proxy13);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.ResponseCache responseCache7 = okHttpClient3.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient3.getHostnameVerifier();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setProxy(proxy9);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient3.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setAuthenticator(okAuthenticator14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setConnectionPool(connectionPool16);
        java.net.ResponseCache responseCache18 = okHttpClient13.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient13.setConnectionPool(connectionPool19);
        java.net.CookieHandler cookieHandler21 = okHttpClient13.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(responseCache18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(cookieHandler21);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setProxySelector(proxySelector12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setConnectionPool(connectionPool5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setConnectionPool(connectionPool7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient10.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient6.getAuthenticator();
        java.net.ResponseCache responseCache8 = okHttpClient6.getResponseCache();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setProxySelector(proxySelector23);
        java.net.Proxy proxy25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient18.setProxy(proxy25);
        java.net.ProxySelector proxySelector27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient26.setProxySelector(proxySelector27);
        java.net.ResponseCache responseCache29 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient26.setResponseCache(responseCache29);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient30);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.net.ProxySelector proxySelector15 = okHttpClient12.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        java.net.Proxy proxy10 = okHttpClient6.getProxy();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setCookieHandler(cookieHandler11);
        java.net.ProxySelector proxySelector13 = okHttpClient12.getProxySelector();
        java.net.CookieHandler cookieHandler14 = okHttpClient12.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNull(cookieHandler14);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setResponseCache(responseCache13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient4.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient4.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient4.getHostnameVerifier();
        java.lang.Class<?> wildcardClass18 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setResponseCache(responseCache6);
        java.net.ResponseCache responseCache8 = okHttpClient3.getResponseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = responseCache8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setHostnameVerifier(hostnameVerifier10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setHostnameVerifier(hostnameVerifier13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setHostnameVerifier(hostnameVerifier15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient16.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient11.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        java.net.CookieHandler cookieHandler14 = okHttpClient13.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setConnectionPool(connectionPool15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = okHttpClient18.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(okAuthenticator21);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = okHttpClient8.getCookieHandler();
        java.net.CookieHandler cookieHandler10 = okHttpClient8.getCookieHandler();
        java.net.Proxy proxy11 = okHttpClient8.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient13.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        java.lang.Class<?> wildcardClass12 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setProxy(proxy11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient5.setProxySelector(proxySelector13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient14.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setAuthenticator(okAuthenticator8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient9.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient12.getAuthenticator();
        java.net.Proxy proxy14 = okHttpClient12.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        java.net.Proxy proxy2 = okHttpClient0.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient0.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = okHttpClient0.getHostnameVerifier();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setHostnameVerifier(hostnameVerifier9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNull(hostnameVerifier4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient2.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setAuthenticator(okAuthenticator16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient17.open(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setProxy(proxy8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient9.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setConnectionPool(connectionPool8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient5.getSslSocketFactory();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setProxySelector(proxySelector11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient12.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setHostnameVerifier(hostnameVerifier16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setAuthenticator(okAuthenticator18);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setProxySelector(proxySelector20);
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection23 = okHttpClient21.open(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setResponseCache(responseCache15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient14.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setAuthenticator(okAuthenticator7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = hostnameVerifier9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setCookieHandler(cookieHandler16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory18);
        java.lang.Class<?> wildcardClass20 = okHttpClient13.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache10 = okHttpClient3.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient3.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient8.getHostnameVerifier();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setProxySelector(proxySelector10);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient0.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxySelector(proxySelector7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.getConnectionPool();
        java.lang.Class<?> wildcardClass10 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient14.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setCookieHandler(cookieHandler18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory20);
        java.net.ProxySelector proxySelector22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient16.setProxySelector(proxySelector22);
        java.net.ResponseCache responseCache24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient16.setResponseCache(responseCache24);
        java.lang.Class<?> wildcardClass26 = okHttpClient25.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ResponseCache responseCache8 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient5.getConnectionPool();
        java.net.ProxySelector proxySelector10 = okHttpClient5.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setConnectionPool(connectionPool11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.net.Proxy proxy15 = okHttpClient12.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNull(connectionPool9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.Proxy proxy12 = okHttpClient10.getProxy();
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient18.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setProxySelector(proxySelector13);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient15.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient18.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = okHttpClient3.getProxySelector();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient3.setCookieHandler(cookieHandler12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient15.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = okHttpClient0.getProxySelector();
        java.net.ResponseCache responseCache5 = okHttpClient0.getResponseCache();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient0.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient0.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxySelector4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient3.getConnectionPool();
        java.net.Proxy proxy8 = okHttpClient3.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient10.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        java.lang.Class<?> wildcardClass11 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setResponseCache(responseCache13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass17 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient6.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient6.getConnectionPool();
        java.net.CookieHandler cookieHandler13 = okHttpClient6.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setHostnameVerifier(hostnameVerifier14);
        java.lang.Class<?> wildcardClass16 = okHttpClient15.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(connectionPool12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setResponseCache(responseCache15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setAuthenticator(okAuthenticator17);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient18.open(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = okHttpClient18.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(proxySelector23);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setCookieHandler(cookieHandler15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setProxy(proxy17);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient6.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache11 = okHttpClient6.getResponseCache();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        java.net.ResponseCache responseCache16 = okHttpClient13.getResponseCache();
        java.net.ResponseCache responseCache17 = okHttpClient13.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNull(responseCache17);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        java.net.ProxySelector proxySelector9 = okHttpClient6.getProxySelector();
        java.net.ProxySelector proxySelector10 = okHttpClient6.getProxySelector();
        java.net.ResponseCache responseCache11 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setAuthenticator(okAuthenticator11);
        java.net.ResponseCache responseCache13 = okHttpClient12.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setProxy(proxy11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setConnectionPool(connectionPool9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient6.getHostnameVerifier();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setProxy(proxy14);
        java.net.Proxy proxy16 = okHttpClient6.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        java.net.ProxySelector proxySelector8 = okHttpClient3.getProxySelector();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = proxy11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setCookieHandler(cookieHandler14);
        java.lang.Class<?> wildcardClass16 = okHttpClient15.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setConnectionPool(connectionPool8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient9.getConnectionPool();
        boolean boolean13 = okHttpClient9.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(connectionPool12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        java.net.CookieHandler cookieHandler8 = okHttpClient2.getCookieHandler();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = okHttpClient2.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector12 = okHttpClient9.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient6.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNull(connectionPool10);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient9.getHostnameVerifier();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient9.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        java.net.CookieHandler cookieHandler10 = okHttpClient8.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxySelector(proxySelector17);
        java.net.ProxySelector proxySelector19 = okHttpClient18.getProxySelector();
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setResponseCache(responseCache20);
        com.squareup.okhttp.ConnectionPool connectionPool22 = okHttpClient21.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(connectionPool22);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient2.getHostnameVerifier();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setResponseCache(responseCache6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient2.getSslSocketFactory();
        boolean boolean9 = okHttpClient2.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass10 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(hostnameVerifier5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient9.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setProxySelector(proxySelector19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setResponseCache(responseCache21);
        java.lang.Class<?> wildcardClass23 = okHttpClient20.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient11.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient11.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient8.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient8.getConnectionPool();
        java.net.ProxySelector proxySelector16 = okHttpClient8.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNull(proxySelector16);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient7.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setResponseCache(responseCache8);
        java.net.ResponseCache responseCache10 = okHttpClient5.getResponseCache();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient5.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setHostnameVerifier(hostnameVerifier14);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient13.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setConnectionPool(connectionPool8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient5.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setCookieHandler(cookieHandler6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient7.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler11 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setConnectionPool(connectionPool12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient4.getHostnameVerifier();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient4.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setResponseCache(responseCache23);
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient22.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient26.setResponseCache(responseCache27);
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient28.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool31 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient32 = okHttpClient28.setConnectionPool(connectionPool31);
        javax.net.ssl.HostnameVerifier hostnameVerifier33 = okHttpClient28.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool34 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient35 = okHttpClient28.setConnectionPool(connectionPool34);
        java.net.URL uRL36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection37 = okHttpClient35.open(uRL36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNull(hostnameVerifier33);
        org.junit.Assert.assertNotNull(okHttpClient35);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxy(proxy11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        java.net.CookieHandler cookieHandler15 = okHttpClient14.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient14.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setCookieHandler(cookieHandler11);
        java.lang.Class<?> wildcardClass13 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        java.net.ProxySelector proxySelector12 = okHttpClient11.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        java.net.ResponseCache responseCache8 = okHttpClient2.getResponseCache();
        java.net.ProxySelector proxySelector9 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient2.getAuthenticator();
        java.net.Proxy proxy11 = okHttpClient2.getProxy();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setResponseCache(responseCache12);
        java.net.Proxy proxy14 = okHttpClient2.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient5.getConnectionPool();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setResponseCache(responseCache10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(connectionPool9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setHostnameVerifier(hostnameVerifier7);
        java.net.ProxySelector proxySelector9 = okHttpClient3.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = proxySelector9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient0.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxySelector(proxySelector7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setResponseCache(responseCache9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient0.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setProxySelector(proxySelector9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxySelector(proxySelector11);
        java.net.ProxySelector proxySelector13 = okHttpClient10.getProxySelector();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient10.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass13 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        boolean boolean10 = okHttpClient6.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        java.lang.Class<?> wildcardClass13 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setAuthenticator(okAuthenticator10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setResponseCache(responseCache14);
        java.lang.Class<?> wildcardClass16 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient14.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setHostnameVerifier(hostnameVerifier6);
        java.lang.Class<?> wildcardClass8 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setConnectionPool(connectionPool8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setAuthenticator(okAuthenticator10);
        java.net.ProxySelector proxySelector12 = okHttpClient4.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient4.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient4.setFollowProtocolRedirects(false);
        java.net.Proxy proxy16 = okHttpClient4.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNull(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient9.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler11 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setConnectionPool(connectionPool12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient4.setHostnameVerifier(hostnameVerifier16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient4.open(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setProxySelector(proxySelector11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        java.net.Proxy proxy15 = okHttpClient12.getProxy();
        java.net.ProxySelector proxySelector16 = okHttpClient12.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
        org.junit.Assert.assertNull(proxySelector16);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient0.getSslSocketFactory();
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.lang.Class<?> wildcardClass11 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setConnectionPool(connectionPool12);
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        java.net.ResponseCache responseCache10 = okHttpClient3.getResponseCache();
        java.net.ResponseCache responseCache11 = okHttpClient3.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient3.getSslSocketFactory();
        boolean boolean13 = okHttpClient3.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector14 = okHttpClient3.getProxySelector();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient3.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = okHttpClient8.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setResponseCache(responseCache8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setResponseCache(responseCache10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        java.net.Proxy proxy12 = okHttpClient6.getProxy();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setConnectionPool(connectionPool19);
        java.net.Proxy proxy21 = okHttpClient18.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(proxy21);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        java.net.Proxy proxy12 = okHttpClient6.getProxy();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient16.open(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient11.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler9 = okHttpClient6.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient6.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setConnectionPool(connectionPool8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient5.getSslSocketFactory();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient5.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setAuthenticator(okAuthenticator10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient2.getAuthenticator();
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setResponseCache(responseCache13);
        boolean boolean15 = okHttpClient14.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient14.getAuthenticator();
        java.net.CookieHandler cookieHandler17 = okHttpClient14.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory18);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient14.open(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNull(cookieHandler17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        java.net.CookieHandler cookieHandler8 = okHttpClient2.getCookieHandler();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setConnectionPool(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setProxySelector(proxySelector23);
        java.net.Proxy proxy25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient18.setProxy(proxy25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory27);
        java.net.CookieHandler cookieHandler29 = okHttpClient18.getCookieHandler();
        boolean boolean30 = okHttpClient18.getFollowProtocolRedirects();
        java.net.URL uRL31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection32 = okHttpClient18.open(uRL31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNull(cookieHandler29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        java.net.ResponseCache responseCache14 = okHttpClient11.getResponseCache();
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setCookieHandler(cookieHandler15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        java.net.ProxySelector proxySelector18 = okHttpClient16.getProxySelector();
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setResponseCache(responseCache19);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNull(proxySelector18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        boolean boolean15 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setProxySelector(proxySelector16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setAuthenticator(okAuthenticator18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setResponseCache(responseCache20);
        java.net.Proxy proxy22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setProxy(proxy22);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = okHttpClient23.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(sSLSocketFactory24);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setAuthenticator(okAuthenticator10);
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = okHttpClient18.getSslSocketFactory();
        java.lang.Class<?> wildcardClass24 = okHttpClient18.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        boolean boolean4 = okHttpClient3.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient3.getConnectionPool();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = proxySelector8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setHostnameVerifier(hostnameVerifier17);
        java.net.ResponseCache responseCache19 = okHttpClient18.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setHostnameVerifier(hostnameVerifier8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setAuthenticator(okAuthenticator12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient13.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setFollowProtocolRedirects(false);
        java.net.Proxy proxy17 = okHttpClient13.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = proxy17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        boolean boolean12 = okHttpClient10.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        java.net.ResponseCache responseCache15 = okHttpClient14.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient14.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setHostnameVerifier(hostnameVerifier17);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass21 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.Proxy proxy6 = okHttpClient2.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(proxy6);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient13.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = okHttpClient18.getSslSocketFactory();
        java.net.ProxySelector proxySelector24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient18.setProxySelector(proxySelector24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient25.setHostnameVerifier(hostnameVerifier26);
        java.net.Proxy proxy28 = okHttpClient27.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNull(proxy28);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setCookieHandler(cookieHandler23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient18.setCookieHandler(cookieHandler25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory27);
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection30 = okHttpClient18.open(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient9.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient9.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setProxySelector(proxySelector19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setResponseCache(responseCache21);
        com.squareup.okhttp.OkAuthenticator okAuthenticator23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setAuthenticator(okAuthenticator23);
        javax.net.ssl.HostnameVerifier hostnameVerifier25 = okHttpClient22.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(hostnameVerifier25);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setHostnameVerifier(hostnameVerifier7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setHostnameVerifier(hostnameVerifier9);
        java.net.Proxy proxy11 = okHttpClient8.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setResponseCache(responseCache9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient10.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setResponseCache(responseCache6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setProxySelector(proxySelector7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = okHttpClient10.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.ProxySelector proxySelector5 = okHttpClient4.getProxySelector();
        java.net.ProxySelector proxySelector6 = okHttpClient4.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient4.getConnectionPool();
        java.net.ResponseCache responseCache8 = okHttpClient4.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setHostnameVerifier(hostnameVerifier9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setProxySelector(proxySelector11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient12.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setResponseCache(responseCache17);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient12.open(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxySelector(proxySelector17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        java.net.ResponseCache responseCache18 = okHttpClient16.getResponseCache();
        boolean boolean19 = okHttpClient16.getFollowProtocolRedirects();
        java.net.Proxy proxy20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setProxy(proxy20);
        javax.net.ssl.HostnameVerifier hostnameVerifier22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setHostnameVerifier(hostnameVerifier22);
        javax.net.ssl.HostnameVerifier hostnameVerifier24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setHostnameVerifier(hostnameVerifier24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = okHttpClient21.getHostnameVerifier();
        java.net.CookieHandler cookieHandler27 = okHttpClient21.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNull(responseCache18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(hostnameVerifier26);
        org.junit.Assert.assertNull(cookieHandler27);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient9.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient2.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        java.net.CookieHandler cookieHandler11 = okHttpClient7.getCookieHandler();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient13.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setResponseCache(responseCache13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient16.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory18);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient19.open(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setFollowProtocolRedirects(false);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.Proxy proxy4 = okHttpClient0.getProxy();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient11.getHostnameVerifier();
        java.net.ResponseCache responseCache15 = okHttpClient11.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setHostnameVerifier(hostnameVerifier16);
        java.net.ProxySelector proxySelector18 = okHttpClient17.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(proxySelector18);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxySelector(proxySelector14);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient11.open(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setProxy(proxy9);
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient7.setHostnameVerifier(hostnameVerifier16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = okHttpClient17.getAuthenticator();
        java.net.CookieHandler cookieHandler19 = okHttpClient17.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(okAuthenticator18);
        org.junit.Assert.assertNull(cookieHandler19);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setResponseCache(responseCache8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.Proxy proxy11 = okHttpClient9.getProxy();
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setProxy(proxy12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient13.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient10.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        java.net.ResponseCache responseCache9 = okHttpClient7.getResponseCache();
        java.net.Proxy proxy10 = okHttpClient7.getProxy();
        java.net.ResponseCache responseCache11 = okHttpClient7.getResponseCache();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setProxySelector(proxySelector12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.CookieHandler cookieHandler11 = okHttpClient6.getCookieHandler();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient13.getSslSocketFactory();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient13.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = okHttpClient8.getCookieHandler();
        java.net.CookieHandler cookieHandler10 = okHttpClient8.getCookieHandler();
        java.net.Proxy proxy11 = okHttpClient8.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = proxy11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = okHttpClient0.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.ProxySelector proxySelector13 = okHttpClient10.getProxySelector();
        boolean boolean14 = okHttpClient10.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setCookieHandler(cookieHandler15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory17);
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setProxy(proxy19);
        java.lang.Class<?> wildcardClass21 = okHttpClient18.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setResponseCache(responseCache14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setHostnameVerifier(hostnameVerifier16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient15.open(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setAuthenticator(okAuthenticator8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setProxySelector(proxySelector10);
        java.lang.Class<?> wildcardClass12 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setCookieHandler(cookieHandler12);
        java.net.CookieHandler cookieHandler14 = okHttpClient13.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        java.net.ResponseCache responseCache9 = okHttpClient7.getResponseCache();
        boolean boolean10 = okHttpClient7.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setHostnameVerifier(hostnameVerifier11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient12.getHostnameVerifier();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient12.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setAuthenticator(okAuthenticator12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setFollowProtocolRedirects(true);
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setCookieHandler(cookieHandler12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient10.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient10.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNull(okAuthenticator15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setHostnameVerifier(hostnameVerifier11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxy(proxy13);
        boolean boolean15 = okHttpClient12.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setResponseCache(responseCache16);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = okHttpClient5.getProxySelector();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = okHttpClient5.getProxy();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        java.net.CookieHandler cookieHandler16 = okHttpClient15.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient15.getHostnameVerifier();
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setProxy(proxy18);
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = okHttpClient19.getAuthenticator();
        java.net.CookieHandler cookieHandler21 = okHttpClient19.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(cookieHandler16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(okAuthenticator20);
        org.junit.Assert.assertNull(cookieHandler21);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        java.net.ResponseCache responseCache9 = okHttpClient7.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient7.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient7.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient10.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setResponseCache(responseCache23);
        com.squareup.okhttp.ConnectionPool connectionPool25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient22.setConnectionPool(connectionPool25);
        java.net.ResponseCache responseCache27 = okHttpClient26.getResponseCache();
        boolean boolean28 = okHttpClient26.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient26.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory31 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient32 = okHttpClient26.setSSLSocketFactory(sSLSocketFactory31);
        com.squareup.okhttp.OkAuthenticator okAuthenticator33 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient34 = okHttpClient26.setAuthenticator(okAuthenticator33);
        com.squareup.okhttp.OkAuthenticator okAuthenticator35 = okHttpClient26.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNull(responseCache27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNull(okAuthenticator35);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.net.Proxy proxy9 = okHttpClient5.getProxy();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setCookieHandler(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setResponseCache(responseCache13);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler11 = okHttpClient3.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setAuthenticator(okAuthenticator10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient3.setConnectionPool(connectionPool12);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setConnectionPool(connectionPool9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient7.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient7.setSSLSocketFactory(sSLSocketFactory16);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setCookieHandler(cookieHandler18);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        java.net.ProxySelector proxySelector14 = okHttpClient12.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        java.net.ResponseCache responseCache10 = okHttpClient7.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.lang.Class<?> wildcardClass7 = okHttpClient0.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setConnectionPool(connectionPool5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setAuthenticator(okAuthenticator12);
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient13.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setConnectionPool(connectionPool7);
        java.lang.Class<?> wildcardClass9 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        java.net.ResponseCache responseCache10 = okHttpClient6.getResponseCache();
        java.net.Proxy proxy11 = okHttpClient6.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setAuthenticator(okAuthenticator7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient6.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient6.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setConnectionPool(connectionPool12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setAuthenticator(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        boolean boolean13 = okHttpClient7.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient7.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache16 = okHttpClient15.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setAuthenticator(okAuthenticator15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient14.getConnectionPool();
        java.net.CookieHandler cookieHandler18 = okHttpClient14.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(connectionPool17);
        org.junit.Assert.assertNull(cookieHandler18);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        java.net.ProxySelector proxySelector12 = okHttpClient8.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(proxySelector12);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        java.net.CookieHandler cookieHandler7 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(cookieHandler7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        java.lang.Class<?> wildcardClass6 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setHostnameVerifier(hostnameVerifier11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        java.net.ProxySelector proxySelector15 = okHttpClient14.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient12.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setConnectionPool(connectionPool16);
        java.lang.Class<?> wildcardClass18 = okHttpClient15.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ProxySelector proxySelector9 = okHttpClient6.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = okHttpClient0.getHostnameVerifier();
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection6 = okHttpClient0.open(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(hostnameVerifier4);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient10.setAuthenticator(okAuthenticator19);
        java.lang.Class<?> wildcardClass21 = okHttpClient20.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setProxySelector(proxySelector2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient7.getSslSocketFactory();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient2.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setHostnameVerifier(hostnameVerifier18);
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = okHttpClient19.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(okAuthenticator20);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient16.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = okHttpClient19.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = hostnameVerifier20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(hostnameVerifier20);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient13.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setHostnameVerifier(hostnameVerifier11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient9.setResponseCache(responseCache13);
        java.net.Proxy proxy15 = okHttpClient14.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNull(responseCache7);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setCookieHandler(cookieHandler3);
        java.lang.Class<?> wildcardClass5 = okHttpClient0.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxy(proxy4);
        java.lang.Class<?> wildcardClass6 = okHttpClient0.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient11.getHostnameVerifier();
        java.net.ResponseCache responseCache15 = okHttpClient11.getResponseCache();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setProxySelector(proxySelector16);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient17.open(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setAuthenticator(okAuthenticator16);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setCookieHandler(cookieHandler19);
        java.net.CookieHandler cookieHandler21 = okHttpClient18.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient18.setAuthenticator(okAuthenticator22);
        com.squareup.okhttp.ConnectionPool connectionPool24 = okHttpClient23.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(cookieHandler21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(connectionPool24);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler10 = okHttpClient9.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient9.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setProxySelector(proxySelector6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory8);
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setAuthenticator(okAuthenticator15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        java.lang.Class<?> wildcardClass19 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = okHttpClient0.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient0.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(hostnameVerifier4);
        org.junit.Assert.assertNull(okAuthenticator5);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = proxySelector9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setAuthenticator(okAuthenticator7);
        java.lang.Class<?> wildcardClass9 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        java.net.Proxy proxy17 = okHttpClient16.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient12.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory16);
        java.lang.Class<?> wildcardClass18 = okHttpClient13.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient15.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient15.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setProxy(proxy11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxySelector(proxySelector13);
        java.lang.Class<?> wildcardClass15 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setCookieHandler(cookieHandler12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setProxy(proxy14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient10.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setAuthenticator(okAuthenticator14);
        boolean boolean16 = okHttpClient13.getFollowProtocolRedirects();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient13.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setProxySelector(proxySelector10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient11.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        java.net.CookieHandler cookieHandler10 = okHttpClient8.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setConnectionPool(connectionPool11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setConnectionPool(connectionPool15);
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxySelector(proxySelector17);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setConnectionPool(connectionPool3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient4.getHostnameVerifier();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient4.open(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient3.getConnectionPool();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setResponseCache(responseCache9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient14.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient6.getSslSocketFactory();
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        java.net.Proxy proxy13 = okHttpClient6.getProxy();
        java.lang.Class<?> wildcardClass14 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setCookieHandler(cookieHandler12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient10.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setAuthenticator(okAuthenticator17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(hostnameVerifier19);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient9.getSslSocketFactory();
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxy(proxy11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        java.lang.Class<?> wildcardClass15 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient7.getConnectionPool();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setProxySelector(proxySelector11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setCookieHandler(cookieHandler13);
        java.net.CookieHandler cookieHandler15 = okHttpClient7.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient7.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient7.setConnectionPool(connectionPool17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setCookieHandler(cookieHandler19);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxy(proxy11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setCookieHandler(cookieHandler13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient8.open(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setCookieHandler(cookieHandler9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient12.getConnectionPool();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxySelector(proxySelector14);
        java.lang.Class<?> wildcardClass16 = okHttpClient15.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(connectionPool13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setProxySelector(proxySelector12);
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient11.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient11.getHostnameVerifier();
        boolean boolean18 = okHttpClient11.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache19 = okHttpClient11.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        boolean boolean12 = okHttpClient10.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setConnectionPool(connectionPool15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.lang.Class<?> wildcardClass19 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setAuthenticator(okAuthenticator11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient4.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = okHttpClient4.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient4.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setConnectionPool(connectionPool10);
        java.net.ResponseCache responseCache12 = okHttpClient4.getResponseCache();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient4.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient5.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        java.lang.Class<?> wildcardClass17 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient11.getHostnameVerifier();
        java.net.ResponseCache responseCache15 = okHttpClient11.getResponseCache();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setProxySelector(proxySelector16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient11.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool19 = okHttpClient11.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = okHttpClient11.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNull(connectionPool19);
        org.junit.Assert.assertNull(sSLSocketFactory20);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        java.net.CookieHandler cookieHandler11 = okHttpClient10.getCookieHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = cookieHandler11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setResponseCache(responseCache8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setResponseCache(responseCache10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient11.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = okHttpClient11.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = proxySelector15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
    }
}

