import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

    public static boolean debug = false;

    @Test
    public void test25001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25001");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient8.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setCookieHandler(cookieHandler18);
        java.net.ResponseCache responseCache20 = okHttpClient17.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient17.getConnectionPool();
        java.net.CookieHandler cookieHandler22 = okHttpClient17.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient17.setAuthenticator(okAuthenticator23);
        boolean boolean25 = okHttpClient24.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = okHttpClient24.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient24.setHostnameVerifier(hostnameVerifier27);
        java.util.List<java.lang.String> strList29 = okHttpClient24.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = okHttpClient24.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(responseCache20);
        org.junit.Assert.assertNull(connectionPool21);
        org.junit.Assert.assertNull(cookieHandler22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(hostnameVerifier26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNotNull(okHttpClient31);
    }

    @Test
    public void test25002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25002");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setAuthenticator(okAuthenticator8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setResponseCache(responseCache10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setHostnameVerifier(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test25003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25003");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setHostnameVerifier(hostnameVerifier9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setCookieHandler(cookieHandler15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setProxy(proxy17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient10.setProxySelector(proxySelector19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setConnectionPool(connectionPool21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25004");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        java.util.List<java.lang.String> strList12 = okHttpClient10.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setHostnameVerifier(hostnameVerifier13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setAuthenticator(okAuthenticator15);
        java.net.ProxySelector proxySelector17 = okHttpClient16.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setHostnameVerifier(hostnameVerifier18);
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setCookieHandler(cookieHandler20);
        java.net.ProxySelector proxySelector22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setProxySelector(proxySelector22);
        java.util.List<java.lang.String> strList24 = okHttpClient21.getTransports();
        java.net.ProxySelector proxySelector25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient21.setProxySelector(proxySelector25);
        com.squareup.okhttp.OkAuthenticator okAuthenticator27 = okHttpClient21.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNull(okAuthenticator27);
    }

    @Test
    public void test25005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25005");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.Proxy proxy9 = okHttpClient5.getProxy();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxy(proxy10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory18);
        java.net.ProxySelector proxySelector20 = okHttpClient15.getProxySelector();
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient15.setResponseCache(responseCache21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(proxySelector20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25006");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setResponseCache(responseCache8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setAuthenticator(okAuthenticator10);
        java.net.ResponseCache responseCache12 = okHttpClient11.getResponseCache();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setConnectionPool(connectionPool15);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setCookieHandler(cookieHandler17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient14.getSslSocketFactory();
        java.net.ProxySelector proxySelector20 = okHttpClient14.getProxySelector();
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient14.setResponseCache(responseCache21);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = okHttpClient14.getSslSocketFactory();
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient14.setTransports((java.util.List<java.lang.String>) strList27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [, hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
        org.junit.Assert.assertNull(proxySelector20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test25007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25007");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector11 = okHttpClient2.getProxySelector();
        boolean boolean12 = okHttpClient2.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler13 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setProxySelector(proxySelector15);
        java.net.ResponseCache responseCache17 = okHttpClient16.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(responseCache17);
    }

    @Test
    public void test25008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25008");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setAuthenticator(okAuthenticator12);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxySelector(proxySelector14);
        java.net.ProxySelector proxySelector16 = okHttpClient13.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
    }

    @Test
    public void test25009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25009");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        java.net.ResponseCache responseCache10 = okHttpClient9.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(true);
        java.util.List<java.lang.String> strList17 = okHttpClient16.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(strList17);
    }

    @Test
    public void test25010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25010");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setAuthenticator(okAuthenticator9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory14);
        java.util.List<java.lang.String> strList16 = okHttpClient15.getTransports();
        java.util.List<java.lang.String> strList17 = okHttpClient15.getTransports();
        java.net.CookieHandler cookieHandler18 = okHttpClient15.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(strList16);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNull(cookieHandler18);
    }

    @Test
    public void test25011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25011");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector17 = okHttpClient11.getProxySelector();
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setCookieHandler(cookieHandler18);
        java.net.Proxy proxy20 = okHttpClient11.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient11.setConnectionPool(connectionPool21);
        java.net.Proxy proxy23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient11.setProxy(proxy23);
        java.net.Proxy proxy25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setProxy(proxy25);
        java.lang.Class<?> wildcardClass27 = okHttpClient26.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test25012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25012");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory3);
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setProxySelector(proxySelector5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient0.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient9.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient9.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = okAuthenticator11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test25013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25013");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.util.List<java.lang.String> strList5 = okHttpClient0.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setHostnameVerifier(hostnameVerifier6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setHostnameVerifier(hostnameVerifier8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient9.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(strList5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test25014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25014");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.util.List<java.lang.String> strList7 = okHttpClient6.getTransports();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setResponseCache(responseCache9);
        boolean boolean11 = okHttpClient6.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setResponseCache(responseCache14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient6.setProxy(proxy16);
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test25015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25015");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.Proxy proxy6 = okHttpClient5.getProxy();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setCookieHandler(cookieHandler7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setHostnameVerifier(hostnameVerifier9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        boolean boolean15 = okHttpClient12.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25016");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        java.net.ProxySelector proxySelector13 = okHttpClient12.getProxySelector();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxySelector(proxySelector14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test25017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25017");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient2.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
    }

    @Test
    public void test25018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25018");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector11 = okHttpClient2.getProxySelector();
        boolean boolean12 = okHttpClient2.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler13 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setProxySelector(proxySelector15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.CookieHandler cookieHandler19 = okHttpClient18.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setHostnameVerifier(hostnameVerifier20);
        java.net.ProxySelector proxySelector22 = okHttpClient18.getProxySelector();
        java.net.CookieHandler cookieHandler23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setCookieHandler(cookieHandler23);
        java.net.ProxySelector proxySelector25 = okHttpClient24.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient24.setConnectionPool(connectionPool26);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(cookieHandler19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(proxySelector22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(proxySelector25);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test25019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25019");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxySelector(proxySelector7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setAuthenticator(okAuthenticator11);
        java.net.ProxySelector proxySelector13 = okHttpClient8.getProxySelector();
        java.util.List<java.lang.String> strList14 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setAuthenticator(okAuthenticator15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient16.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(connectionPool17);
    }

    @Test
    public void test25020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25020");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setProxySelector(proxySelector10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setResponseCache(responseCache12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setAuthenticator(okAuthenticator14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient15.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient15.setConnectionPool(connectionPool19);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test25021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25021");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ResponseCache responseCache6 = okHttpClient2.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setProxy(proxy10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setAuthenticator(okAuthenticator12);
        java.net.CookieHandler cookieHandler14 = okHttpClient13.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setAuthenticator(okAuthenticator15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25022");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector7 = okHttpClient5.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient5.getSslSocketFactory();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setResponseCache(responseCache10);
        java.net.ResponseCache responseCache12 = okHttpClient11.getResponseCache();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setConnectionPool(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(okAuthenticator6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test25023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25023");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setProxy(proxy15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient16.getSslSocketFactory();
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setProxySelector(proxySelector20);
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient16.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test25024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25024");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient2.getHostnameVerifier();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setProxy(proxy9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxy(proxy11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setAuthenticator(okAuthenticator13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        boolean boolean17 = okHttpClient14.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient14.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setHostnameVerifier(hostnameVerifier19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setResponseCache(responseCache21);
        java.net.Proxy proxy23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient20.setProxy(proxy23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setCookieHandler(cookieHandler25);
        java.net.CookieHandler cookieHandler27 = okHttpClient24.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNull(cookieHandler27);
    }

    @Test
    public void test25025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25025");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.Proxy proxy2 = okHttpClient0.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient0.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient5.getCookieHandler();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25026");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setResponseCache(responseCache13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList17 = okHttpClient14.getTransports();
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setProxy(proxy18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setHostnameVerifier(hostnameVerifier20);
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient19.setAuthenticator(okAuthenticator24);
        java.net.CookieHandler cookieHandler26 = okHttpClient25.getCookieHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = cookieHandler26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(cookieHandler26);
    }

    @Test
    public void test25027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25027");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = okHttpClient5.getResponseCache();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient13.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
    }

    @Test
    public void test25028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25028");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient2.getAuthenticator();
        java.net.CookieHandler cookieHandler12 = okHttpClient2.getCookieHandler();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setProxy(proxy13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = okHttpClient16.getConnectionPool();
        java.net.CookieHandler cookieHandler20 = okHttpClient16.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(cookieHandler12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(connectionPool19);
        org.junit.Assert.assertNull(cookieHandler20);
    }

    @Test
    public void test25029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25029");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector7 = okHttpClient5.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setProxy(proxy16);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(okAuthenticator6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test25030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25030");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setConnectionPool(connectionPool15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        java.net.CookieHandler cookieHandler18 = okHttpClient16.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setHostnameVerifier(hostnameVerifier19);
        java.net.ProxySelector proxySelector21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setProxySelector(proxySelector21);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient20.setProxySelector(proxySelector23);
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient26.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache29 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient26.setResponseCache(responseCache29);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNull(cookieHandler18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient30);
    }

    @Test
    public void test25031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25031");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient5.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient5.getAuthenticator();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient5.setCookieHandler(cookieHandler14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setHostnameVerifier(hostnameVerifier16);
        boolean boolean18 = okHttpClient15.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25032");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ResponseCache responseCache9 = okHttpClient4.getResponseCache();
        boolean boolean10 = okHttpClient4.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setAuthenticator(okAuthenticator11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setAuthenticator(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25033");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        boolean boolean13 = okHttpClient12.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setResponseCache(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test25034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25034");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = okHttpClient18.getProxy();
        java.util.List<java.lang.String> strList20 = okHttpClient18.getTransports();
        java.net.CookieHandler cookieHandler21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setCookieHandler(cookieHandler21);
        com.squareup.okhttp.OkAuthenticator okAuthenticator23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setAuthenticator(okAuthenticator23);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test25035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25035");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient8.getHostnameVerifier();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxySelector(proxySelector11);
        java.util.List<java.lang.String> strList13 = okHttpClient8.getTransports();
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setConnectionPool(connectionPool14);
        java.net.CookieHandler cookieHandler16 = okHttpClient8.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient8.setAuthenticator(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(cookieHandler16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25036");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        java.net.Proxy proxy14 = okHttpClient13.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = okHttpClient13.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory20);
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection23 = okHttpClient21.open(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxy14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test25037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25037");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setConnectionPool(connectionPool12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient15.getHostnameVerifier();
        java.net.ResponseCache responseCache19 = okHttpClient15.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test25038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25038");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient14.getAuthenticator();
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setProxy(proxy18);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setProxySelector(proxySelector20);
        java.net.CookieHandler cookieHandler22 = okHttpClient21.getCookieHandler();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient21.setTransports((java.util.List<java.lang.String>) strList25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(cookieHandler22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test25039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25039");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setAuthenticator(okAuthenticator10);
        boolean boolean12 = okHttpClient5.getFollowProtocolRedirects();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient5.setProxy(proxy13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient14.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test25040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25040");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient7.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setConnectionPool(connectionPool10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient13.getAuthenticator();
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setProxy(proxy17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient13.setCookieHandler(cookieHandler19);
        java.lang.Class<?> wildcardClass21 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25041");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxySelector(proxySelector11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setAuthenticator(okAuthenticator19);
        java.net.ProxySelector proxySelector21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setProxySelector(proxySelector21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setResponseCache(responseCache23);
        java.net.Proxy proxy25 = okHttpClient18.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(proxy25);
    }

    @Test
    public void test25042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25042");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.CookieHandler cookieHandler11 = okHttpClient2.getCookieHandler();
        java.util.List<java.lang.String> strList12 = okHttpClient2.getTransports();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setProxy(proxy13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setAuthenticator(okAuthenticator15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory19);
        java.net.CookieHandler cookieHandler21 = okHttpClient20.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(cookieHandler21);
    }

    @Test
    public void test25043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25043");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxy(proxy13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setProxy(proxy15);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setCookieHandler(cookieHandler17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient16.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = okHttpClient16.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(okAuthenticator22);
    }

    @Test
    public void test25044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25044");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setProxy(proxy13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        java.net.ProxySelector proxySelector19 = okHttpClient16.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setConnectionPool(connectionPool20);
        java.net.Proxy proxy22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient16.setProxy(proxy22);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test25045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25045");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setConnectionPool(connectionPool10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test25046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25046");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache9 = okHttpClient2.getResponseCache();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setProxy(proxy10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient11.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient11.getAuthenticator();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setCookieHandler(cookieHandler14);
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test25047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25047");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.ConnectionPool connectionPool1 = okHttpClient0.getConnectionPool();
        java.net.Proxy proxy2 = okHttpClient0.getProxy();
        java.util.List<java.lang.String> strList3 = okHttpClient0.getTransports();
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setCookieHandler(cookieHandler4);
        java.net.CookieHandler cookieHandler6 = okHttpClient5.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setHostnameVerifier(hostnameVerifier7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient10.getSslSocketFactory();
        org.junit.Assert.assertNull(connectionPool1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
    }

    @Test
    public void test25048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25048");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setConnectionPool(connectionPool13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient2.getSslSocketFactory();
        java.net.ProxySelector proxySelector16 = okHttpClient2.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient2.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient2.setConnectionPool(connectionPool18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setSSLSocketFactory(sSLSocketFactory20);
        java.net.ProxySelector proxySelector22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setProxySelector(proxySelector22);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient19.setSSLSocketFactory(sSLSocketFactory24);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
    }

    @Test
    public void test25049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25049");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setAuthenticator(okAuthenticator9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test25050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25050");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxy(proxy13);
        java.net.CookieHandler cookieHandler15 = okHttpClient14.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setConnectionPool(connectionPool16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setHostnameVerifier(hostnameVerifier18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory20);
        java.net.Proxy proxy22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient14.setProxy(proxy22);
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler26 = okHttpClient23.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient23.setAuthenticator(okAuthenticator27);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(cookieHandler26);
        org.junit.Assert.assertNotNull(okHttpClient28);
    }

    @Test
    public void test25051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25051");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory12);
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        java.util.List<java.lang.String> strList15 = okHttpClient13.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setSSLSocketFactory(sSLSocketFactory18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = okHttpClient17.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(sSLSocketFactory20);
    }

    @Test
    public void test25052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25052");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setFollowProtocolRedirects(true);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setHostnameVerifier(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25053");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.Proxy proxy6 = okHttpClient5.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setAuthenticator(okAuthenticator7);
        java.net.Proxy proxy9 = okHttpClient5.getProxy();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxySelector(proxySelector10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient5.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient5.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = sSLSocketFactory13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
    }

    @Test
    public void test25054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25054");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setCookieHandler(cookieHandler9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setAuthenticator(okAuthenticator13);
        java.net.Proxy proxy15 = okHttpClient14.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
    }

    @Test
    public void test25055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25055");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.Proxy proxy13 = okHttpClient12.getProxy();
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setHostnameVerifier(hostnameVerifier16);
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test25056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25056");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        boolean boolean8 = okHttpClient7.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setResponseCache(responseCache13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setConnectionPool(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test25057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25057");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient13.getConnectionPool();
        boolean boolean15 = okHttpClient13.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25058");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient11.setCookieHandler(cookieHandler19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient11.setResponseCache(responseCache21);
        com.squareup.okhttp.ConnectionPool connectionPool23 = okHttpClient11.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool24 = okHttpClient11.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier25 = okHttpClient11.getHostnameVerifier();
        java.net.ProxySelector proxySelector26 = okHttpClient11.getProxySelector();
        java.util.List<java.lang.String> strList27 = okHttpClient11.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(connectionPool23);
        org.junit.Assert.assertNull(connectionPool24);
        org.junit.Assert.assertNull(hostnameVerifier25);
        org.junit.Assert.assertNull(proxySelector26);
        org.junit.Assert.assertNull(strList27);
    }

    @Test
    public void test25059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25059");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.util.List<java.lang.String> strList3 = okHttpClient2.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.CookieHandler cookieHandler6 = okHttpClient5.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient10.getHostnameVerifier();
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setProxy(proxy15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setAuthenticator(okAuthenticator17);
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient10.setResponseCache(responseCache19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient10.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(strList3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(connectionPool21);
    }

    @Test
    public void test25060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25060");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        boolean boolean3 = okHttpClient0.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient7.getHostnameVerifier();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient10.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(connectionPool15);
    }

    @Test
    public void test25061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25061");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector17 = okHttpClient11.getProxySelector();
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setCookieHandler(cookieHandler18);
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setAuthenticator(okAuthenticator20);
        java.net.ProxySelector proxySelector22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setProxySelector(proxySelector22);
        java.util.List<java.lang.String> strList24 = okHttpClient19.getTransports();
        java.net.ProxySelector proxySelector25 = okHttpClient19.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient19.setAuthenticator(okAuthenticator26);
        java.util.List<java.lang.String> strList28 = okHttpClient27.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(strList24);
        org.junit.Assert.assertNull(proxySelector25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNull(strList28);
    }

    @Test
    public void test25062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25062");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setConnectionPool(connectionPool19);
        java.net.CookieHandler cookieHandler21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setCookieHandler(cookieHandler21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25063");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setProxy(proxy11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient5.setAuthenticator(okAuthenticator15);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setCookieHandler(cookieHandler17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setHostnameVerifier(hostnameVerifier19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient20.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(connectionPool21);
    }

    @Test
    public void test25064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25064");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
        java.util.List<java.lang.String> strList10 = okHttpClient5.getTransports();
        java.net.Proxy proxy11 = okHttpClient5.getProxy();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setCookieHandler(cookieHandler12);
        java.net.ProxySelector proxySelector14 = okHttpClient13.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient13.getConnectionPool();
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setProxy(proxy16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setResponseCache(responseCache20);
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = okHttpClient25.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(sSLSocketFactory26);
    }

    @Test
    public void test25065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25065");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        boolean boolean14 = okHttpClient12.getFollowProtocolRedirects();
        java.net.Proxy proxy15 = okHttpClient12.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient12.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = okAuthenticator16.getClass();
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
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(proxy15);
        org.junit.Assert.assertNull(okAuthenticator16);
    }

    @Test
    public void test25066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25066");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.util.List<java.lang.String> strList7 = okHttpClient6.getTransports();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setResponseCache(responseCache9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setConnectionPool(connectionPool11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        java.net.ResponseCache responseCache17 = okHttpClient16.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient16.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(strList7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test25067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25067");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setResponseCache(responseCache10);
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setResponseCache(responseCache12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient13.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setAuthenticator(okAuthenticator15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25068");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setResponseCache(responseCache8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory12);
        java.util.List<java.lang.String> strList14 = okHttpClient13.getTransports();
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient13.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(connectionPool15);
    }

    @Test
    public void test25069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25069");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient16.getAuthenticator();
        java.net.Proxy proxy20 = okHttpClient16.getProxy();
        java.net.CookieHandler cookieHandler21 = okHttpClient16.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNull(cookieHandler21);
    }

    @Test
    public void test25070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25070");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = okHttpClient2.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setConnectionPool(connectionPool11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        java.net.ProxySelector proxySelector17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxySelector(proxySelector17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setHostnameVerifier(hostnameVerifier19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setAuthenticator(okAuthenticator21);
        java.net.ProxySelector proxySelector23 = okHttpClient20.getProxySelector();
        boolean boolean24 = okHttpClient20.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(proxySelector23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test25071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25071");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setConnectionPool(connectionPool12);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxySelector(proxySelector14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setResponseCache(responseCache16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient15.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool19 = okHttpClient15.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient15.setConnectionPool(connectionPool20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setAuthenticator(okAuthenticator22);
        com.squareup.okhttp.ConnectionPool connectionPool24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setConnectionPool(connectionPool24);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNull(connectionPool19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
    }

    @Test
    public void test25072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25072");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setCookieHandler(cookieHandler19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setAuthenticator(okAuthenticator21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25073");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxySelector(proxySelector14);
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setProxySelector(proxySelector16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient17.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient17.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool20 = okHttpClient17.getConnectionPool();
        java.net.Proxy proxy21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient17.setProxy(proxy21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(connectionPool18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
        org.junit.Assert.assertNull(connectionPool20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25074");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector19 = okHttpClient16.getProxySelector();
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setCookieHandler(cookieHandler20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = okHttpClient21.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient21.setHostnameVerifier(hostnameVerifier23);
        javax.net.ssl.HostnameVerifier hostnameVerifier25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setHostnameVerifier(hostnameVerifier25);
        java.net.CookieHandler cookieHandler27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient24.setCookieHandler(cookieHandler27);
        com.squareup.okhttp.ConnectionPool connectionPool29 = okHttpClient24.getConnectionPool();
        java.net.URL uRL30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection31 = okHttpClient24.open(uRL30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(sSLSocketFactory22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNull(connectionPool29);
    }

    @Test
    public void test25075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25075");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.util.List<java.lang.String> strList13 = okHttpClient12.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setHostnameVerifier(hostnameVerifier16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient17.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(connectionPool18);
    }

    @Test
    public void test25076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25076");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setResponseCache(responseCache8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setProxy(proxy12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient15.getHostnameVerifier();
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setResponseCache(responseCache17);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test25077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25077");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setProxy(proxy6);
        boolean boolean8 = okHttpClient7.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setSSLSocketFactory(sSLSocketFactory9);
        java.net.Proxy proxy11 = okHttpClient7.getProxy();
        boolean boolean12 = okHttpClient7.getFollowProtocolRedirects();
        java.util.List<java.lang.String> strList13 = okHttpClient7.getTransports();
        java.lang.Class<?> wildcardClass14 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test25078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25078");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxy(proxy13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient12.getSslSocketFactory();
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient12.setCookieHandler(cookieHandler18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test25079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25079");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient8.getConnectionPool();
        boolean boolean15 = okHttpClient8.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient8.setAuthenticator(okAuthenticator16);
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setConnectionPool(connectionPool20);
        java.net.Proxy proxy22 = okHttpClient17.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(proxy22);
    }

    @Test
    public void test25080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25080");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        boolean boolean12 = okHttpClient10.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test25081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25081");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        java.util.List<java.lang.String> strList8 = okHttpClient2.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25082");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient11.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setAuthenticator(okAuthenticator13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setCookieHandler(cookieHandler19);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test25083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25083");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setConnectionPool(connectionPool10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        java.net.ProxySelector proxySelector16 = okHttpClient13.getProxySelector();
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setProxy(proxy17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient18.getAuthenticator();
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setResponseCache(responseCache20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = okHttpClient18.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(sSLSocketFactory22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test25084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25084");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient14.getHostnameVerifier();
        boolean boolean16 = okHttpClient14.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setProxy(proxy19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setAuthenticator(okAuthenticator21);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = okHttpClient18.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator24 = okHttpClient18.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(sSLSocketFactory23);
        org.junit.Assert.assertNull(okAuthenticator24);
    }

    @Test
    public void test25085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25085");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxySelector(proxySelector11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory17);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setSSLSocketFactory(sSLSocketFactory21);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient20.setProxySelector(proxySelector23);
        com.squareup.okhttp.OkAuthenticator okAuthenticator25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient20.setAuthenticator(okAuthenticator25);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test25086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25086");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.ConnectionPool connectionPool1 = okHttpClient0.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setAuthenticator(okAuthenticator2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setAuthenticator(okAuthenticator17);
        org.junit.Assert.assertNull(connectionPool1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25087");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setCookieHandler(cookieHandler10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient13.getSslSocketFactory();
        java.util.List<java.lang.String> strList17 = okHttpClient13.getTransports();
        java.net.Proxy proxy18 = okHttpClient13.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNull(strList17);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test25088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25088");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        java.util.List<java.lang.String> strList11 = okHttpClient9.getTransports();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setConnectionPool(connectionPool12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setCookieHandler(cookieHandler14);
        boolean boolean16 = okHttpClient15.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setConnectionPool(connectionPool17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory19);
        java.net.CookieHandler cookieHandler21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setCookieHandler(cookieHandler21);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory23 = okHttpClient18.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(sSLSocketFactory23);
    }

    @Test
    public void test25089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25089");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxySelector(proxySelector11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test25090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25090");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25091");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.util.List<java.lang.String> strList12 = okHttpClient11.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler15 = okHttpClient14.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setAuthenticator(okAuthenticator16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = okHttpClient14.getAuthenticator();
        java.util.List<java.lang.String> strList19 = okHttpClient14.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient14.setAuthenticator(okAuthenticator20);
        javax.net.ssl.HostnameVerifier hostnameVerifier22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setHostnameVerifier(hostnameVerifier22);
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient21.setAuthenticator(okAuthenticator26);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(okAuthenticator18);
        org.junit.Assert.assertNull(strList19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test25092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25092");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setResponseCache(responseCache5);
        java.net.ResponseCache responseCache7 = okHttpClient6.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(true);
        java.net.Proxy proxy11 = okHttpClient6.getProxy();
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setProxy(proxy12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient6.setAuthenticator(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test25093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25093");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        boolean boolean10 = okHttpClient8.getFollowProtocolRedirects();
        java.util.List<java.lang.String> strList11 = okHttpClient8.getTransports();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setResponseCache(responseCache12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        java.net.ResponseCache responseCache16 = okHttpClient13.getResponseCache();
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setProxy(proxy17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient18.getAuthenticator();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient18.setTransports((java.util.List<java.lang.String>) strList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!, hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(okAuthenticator19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test25094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25094");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        java.util.List<java.lang.String> strList10 = okHttpClient9.getTransports();
        java.util.List<java.lang.String> strList11 = okHttpClient9.getTransports();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setConnectionPool(connectionPool12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setCookieHandler(cookieHandler16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setHostnameVerifier(hostnameVerifier18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory20);
        java.net.ResponseCache responseCache22 = okHttpClient15.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(responseCache22);
    }

    @Test
    public void test25095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25095");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
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
    public void test25096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25096");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setCookieHandler(cookieHandler17);
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
    public void test25097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25097");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setConnectionPool(connectionPool14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setHostnameVerifier(hostnameVerifier16);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setCookieHandler(cookieHandler18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient13.setHostnameVerifier(hostnameVerifier20);
        java.net.ResponseCache responseCache22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient13.setResponseCache(responseCache22);
        java.net.ProxySelector proxySelector24 = okHttpClient23.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(proxySelector24);
    }

    @Test
    public void test25098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25098");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setAuthenticator(okAuthenticator7);
        java.net.CookieHandler cookieHandler9 = okHttpClient8.getCookieHandler();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setAuthenticator(okAuthenticator12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient13.getConnectionPool();
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setCookieHandler(cookieHandler15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient13.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
    }

    @Test
    public void test25099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25099");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setAuthenticator(okAuthenticator9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient5.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        boolean boolean15 = okHttpClient14.getFollowProtocolRedirects();
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setProxy(proxy16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient14.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
    }

    @Test
    public void test25100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25100");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient8.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setHostnameVerifier(hostnameVerifier18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setHostnameVerifier(hostnameVerifier20);
        java.util.List<java.lang.String> strList22 = okHttpClient19.getTransports();
        javax.net.ssl.HostnameVerifier hostnameVerifier23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient19.setHostnameVerifier(hostnameVerifier23);
        java.net.Proxy proxy25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setProxy(proxy25);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(strList22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test25101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25101");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        java.util.List<java.lang.String> strList11 = okHttpClient9.getTransports();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setConnectionPool(connectionPool12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient15.getAuthenticator();
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setResponseCache(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25102");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        java.net.ProxySelector proxySelector11 = okHttpClient8.getProxySelector();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setProxySelector(proxySelector12);
        java.net.ResponseCache responseCache14 = okHttpClient8.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient8.getConnectionPool();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient8.setProxySelector(proxySelector16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient17.getHostnameVerifier();
        java.net.ResponseCache responseCache19 = okHttpClient17.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test25103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25103");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.Proxy proxy10 = okHttpClient8.getProxy();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setAuthenticator(okAuthenticator13);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25104");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkAuthenticator okAuthenticator1 = okHttpClient0.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setHostnameVerifier(hostnameVerifier4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        boolean boolean8 = okHttpClient5.getFollowProtocolRedirects();
        boolean boolean9 = okHttpClient5.getFollowProtocolRedirects();
        java.util.List<java.lang.String> strList10 = okHttpClient5.getTransports();
        java.net.ProxySelector proxySelector11 = okHttpClient5.getProxySelector();
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setProxy(proxy12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient5.setProxy(proxy14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient5.setResponseCache(responseCache16);
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList20 = okHttpClient17.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = okHttpClient17.getAuthenticator();
        java.net.ResponseCache responseCache22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient17.setResponseCache(responseCache22);
        org.junit.Assert.assertNull(okAuthenticator1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(okAuthenticator21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test25105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25105");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.ConnectionPool connectionPool1 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(proxySelector4);
        boolean boolean6 = okHttpClient3.getFollowProtocolRedirects();
        java.util.List<java.lang.String> strList7 = okHttpClient3.getTransports();
        org.junit.Assert.assertNull(connectionPool1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test25106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25106");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test25107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25107");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        java.util.List<java.lang.String> strList15 = okHttpClient11.getTransports();
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setCookieHandler(cookieHandler16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient17.getSslSocketFactory();
        java.net.CookieHandler cookieHandler19 = okHttpClient17.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
        org.junit.Assert.assertNull(cookieHandler19);
    }

    @Test
    public void test25108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25108");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        java.util.List<java.lang.String> strList10 = okHttpClient9.getTransports();
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxy(proxy11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setProxy(proxy13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient12.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient12.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient12.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient12.setConnectionPool(connectionPool18);
        java.util.List<java.lang.String> strList20 = okHttpClient19.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = okHttpClient19.getAuthenticator();
        java.net.Proxy proxy22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setProxy(proxy22);
        com.squareup.okhttp.ConnectionPool connectionPool24 = okHttpClient19.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient19.setAuthenticator(okAuthenticator25);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = okHttpClient19.getSslSocketFactory();
        java.net.ResponseCache responseCache28 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient19.setResponseCache(responseCache28);
        boolean boolean30 = okHttpClient19.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNull(okAuthenticator21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(connectionPool24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNull(sSLSocketFactory27);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test25109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25109");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setConnectionPool(connectionPool13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient4.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient4.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test25110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25110");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setProxy(proxy16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setConnectionPool(connectionPool18);
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient11.setProxySelector(proxySelector22);
        java.net.ResponseCache responseCache24 = okHttpClient11.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(responseCache24);
    }

    @Test
    public void test25111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25111");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = okHttpClient18.getProxy();
        java.util.List<java.lang.String> strList20 = okHttpClient18.getTransports();
        java.net.CookieHandler cookieHandler21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setCookieHandler(cookieHandler21);
        javax.net.ssl.HostnameVerifier hostnameVerifier23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setHostnameVerifier(hostnameVerifier23);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test25112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25112");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        java.util.List<java.lang.String> strList8 = okHttpClient2.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxySelector(proxySelector11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.Proxy proxy19 = okHttpClient18.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setConnectionPool(connectionPool20);
        java.net.CookieHandler cookieHandler22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient18.setCookieHandler(cookieHandler22);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test25113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25113");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setProxy(proxy11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setConnectionPool(connectionPool13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        java.net.ResponseCache responseCache17 = okHttpClient16.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setConnectionPool(connectionPool18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setSSLSocketFactory(sSLSocketFactory20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = okHttpClient16.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(sSLSocketFactory22);
    }

    @Test
    public void test25114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25114");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setProxySelector(proxySelector14);
        java.net.ProxySelector proxySelector16 = okHttpClient15.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient15.setHostnameVerifier(hostnameVerifier17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setCookieHandler(cookieHandler19);
        javax.net.ssl.HostnameVerifier hostnameVerifier21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setHostnameVerifier(hostnameVerifier21);
        java.net.Proxy proxy23 = okHttpClient22.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(proxy23);
    }

    @Test
    public void test25115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25115");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setCookieHandler(cookieHandler13);
        java.util.List<java.lang.String> strList15 = okHttpClient10.getTransports();
        java.net.ResponseCache responseCache16 = okHttpClient10.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient10.getAuthenticator();
        java.net.ProxySelector proxySelector18 = okHttpClient10.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient10.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(strList15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNull(proxySelector18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
    }

    @Test
    public void test25116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25116");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25117");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.ConnectionPool connectionPool1 = okHttpClient0.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setAuthenticator(okAuthenticator2);
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setCookieHandler(cookieHandler4);
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setConnectionPool(connectionPool8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxySelector(proxySelector14);
        java.net.ProxySelector proxySelector16 = okHttpClient15.getProxySelector();
        java.net.CookieHandler cookieHandler17 = okHttpClient15.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setHostnameVerifier(hostnameVerifier18);
        org.junit.Assert.assertNull(connectionPool1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNull(cookieHandler17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test25118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25118");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setResponseCache(responseCache19);
        java.net.ResponseCache responseCache21 = okHttpClient20.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(responseCache21);
    }

    @Test
    public void test25119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25119");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        java.net.ResponseCache responseCache7 = okHttpClient2.getResponseCache();
        java.util.List<java.lang.String> strList8 = okHttpClient2.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxySelector(proxySelector11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = okHttpClient14.getProxySelector();
        boolean boolean16 = okHttpClient14.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(strList8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25120");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient12.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient12.getConnectionPool();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setProxySelector(proxySelector15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        java.net.ProxySelector proxySelector19 = okHttpClient18.getProxySelector();
        java.net.ResponseCache responseCache20 = okHttpClient18.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxySelector19);
        org.junit.Assert.assertNull(responseCache20);
    }

    @Test
    public void test25121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25121");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxySelector(proxySelector11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setProxySelector(proxySelector13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setCookieHandler(cookieHandler15);
        java.net.ProxySelector proxySelector17 = okHttpClient2.getProxySelector();
        boolean boolean18 = okHttpClient2.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler19 = okHttpClient2.getCookieHandler();
        java.net.Proxy proxy20 = okHttpClient2.getProxy();
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient2.setResponseCache(responseCache21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(cookieHandler19);
        org.junit.Assert.assertNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25122");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setAuthenticator(okAuthenticator9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setHostnameVerifier(hostnameVerifier12);
        java.util.List<java.lang.String> strList14 = okHttpClient10.getTransports();
        java.net.ResponseCache responseCache15 = okHttpClient10.getResponseCache();
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient10.setResponseCache(responseCache16);
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setProxySelector(proxySelector20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient17.setAuthenticator(okAuthenticator22);
        java.net.Proxy proxy24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setProxy(proxy24);
        java.net.ResponseCache responseCache26 = okHttpClient23.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(strList14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(responseCache26);
    }

    @Test
    public void test25123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25123");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setHostnameVerifier(hostnameVerifier10);
        java.util.List<java.lang.String> strList12 = okHttpClient11.getTransports();
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setCookieHandler(cookieHandler13);
        boolean boolean15 = okHttpClient11.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory16);
        java.net.ProxySelector proxySelector18 = okHttpClient17.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient17.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(proxySelector18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test25124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25124");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setAuthenticator(okAuthenticator17);
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setResponseCache(responseCache19);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setSSLSocketFactory(sSLSocketFactory21);
        java.net.Proxy proxy23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient20.setProxy(proxy23);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient20.setSSLSocketFactory(sSLSocketFactory25);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test25125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25125");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient8.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setHostnameVerifier(hostnameVerifier18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setHostnameVerifier(hostnameVerifier20);
        javax.net.ssl.HostnameVerifier hostnameVerifier22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setHostnameVerifier(hostnameVerifier22);
        javax.net.ssl.HostnameVerifier hostnameVerifier24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setHostnameVerifier(hostnameVerifier24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient21.setHostnameVerifier(hostnameVerifier26);
        java.util.List<java.lang.String> strList28 = okHttpClient27.getTransports();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient27.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache31 = okHttpClient30.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory32 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient33 = okHttpClient30.setSSLSocketFactory(sSLSocketFactory32);
        java.lang.Class<?> wildcardClass34 = okHttpClient33.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNull(strList28);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNull(responseCache31);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test25126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25126");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient5.getAuthenticator();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
        java.util.List<java.lang.String> strList10 = okHttpClient5.getTransports();
        java.net.Proxy proxy11 = okHttpClient5.getProxy();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setCookieHandler(cookieHandler12);
        java.net.ProxySelector proxySelector14 = okHttpClient13.getProxySelector();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setProxySelector(proxySelector15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setConnectionPool(connectionPool18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setResponseCache(responseCache20);
        java.net.Proxy proxy22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient16.setProxy(proxy22);
        java.util.List<java.lang.String> strList24 = okHttpClient23.getTransports();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(strList24);
    }

    @Test
    public void test25127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25127");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.Proxy proxy19 = okHttpClient18.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool20 = okHttpClient18.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setConnectionPool(connectionPool21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setResponseCache(responseCache23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setCookieHandler(cookieHandler25);
        javax.net.ssl.HostnameVerifier hostnameVerifier27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient24.setHostnameVerifier(hostnameVerifier27);
        java.net.Proxy proxy29 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient28.setProxy(proxy29);
        com.squareup.okhttp.OkHttpClient okHttpClient32 = okHttpClient30.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(proxy19);
        org.junit.Assert.assertNull(connectionPool20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient32);
    }

    @Test
    public void test25128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25128");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache13 = okHttpClient12.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setAuthenticator(okAuthenticator14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setHostnameVerifier(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test25129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25129");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient18.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setHostnameVerifier(hostnameVerifier20);
        javax.net.ssl.HostnameVerifier hostnameVerifier22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient18.setHostnameVerifier(hostnameVerifier22);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test25130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25130");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        boolean boolean13 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache14 = okHttpClient10.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setHostnameVerifier(hostnameVerifier15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test25131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25131");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxySelector(proxySelector4);
        java.net.CookieHandler cookieHandler6 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setFollowProtocolRedirects(false);
        java.util.List<java.lang.String> strList9 = okHttpClient8.getTransports();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setConnectionPool(connectionPool12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        java.net.Proxy proxy16 = okHttpClient11.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient11.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient11.setProxySelector(proxySelector20);
        com.squareup.okhttp.ConnectionPool connectionPool22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setConnectionPool(connectionPool22);
        java.net.ProxySelector proxySelector24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setProxySelector(proxySelector24);
        com.squareup.okhttp.OkAuthenticator okAuthenticator26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient21.setAuthenticator(okAuthenticator26);
        com.squareup.okhttp.OkAuthenticator okAuthenticator28 = okHttpClient21.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxy16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNull(okAuthenticator28);
    }

    @Test
    public void test25132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25132");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        boolean boolean3 = okHttpClient0.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient9.getHostnameVerifier();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setCookieHandler(cookieHandler11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
    }

    @Test
    public void test25133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25133");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient8.getSslSocketFactory();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient8.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setHostnameVerifier(hostnameVerifier13);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setResponseCache(responseCache15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setProxy(proxy17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25134");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        java.net.Proxy proxy3 = okHttpClient2.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool4 = okHttpClient2.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxy3);
        org.junit.Assert.assertNull(connectionPool4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test25135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25135");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkAuthenticator okAuthenticator1 = okHttpClient0.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setCookieHandler(cookieHandler4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setConnectionPool(connectionPool6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setSSLSocketFactory(sSLSocketFactory8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxy(proxy10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient13.getConnectionPool();
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setResponseCache(responseCache17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient13.setConnectionPool(connectionPool19);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient13.setTransports((java.util.List<java.lang.String>) strList24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: transports doesn't contain http/1.1: [hi!, hi!]");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(okAuthenticator1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test25136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25136");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkAuthenticator okAuthenticator1 = okHttpClient0.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        com.squareup.okhttp.ConnectionPool connectionPool4 = okHttpClient3.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setHostnameVerifier(hostnameVerifier7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setHostnameVerifier(hostnameVerifier9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setConnectionPool(connectionPool12);
        java.net.ProxySelector proxySelector14 = okHttpClient13.getProxySelector();
        org.junit.Assert.assertNull(okAuthenticator1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(connectionPool4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test25137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25137");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        boolean boolean8 = okHttpClient7.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setResponseCache(responseCache9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setCookieHandler(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test25138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25138");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setCookieHandler(cookieHandler5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setCookieHandler(cookieHandler17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test25139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25139");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        java.net.Proxy proxy10 = okHttpClient8.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        java.net.ResponseCache responseCache12 = okHttpClient8.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setCookieHandler(cookieHandler15);
        java.net.CookieHandler cookieHandler17 = okHttpClient16.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(cookieHandler17);
    }

    @Test
    public void test25140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25140");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.Proxy proxy9 = okHttpClient5.getProxy();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxy(proxy10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setConnectionPool(connectionPool16);
        java.lang.Class<?> wildcardClass18 = okHttpClient15.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25141");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        java.net.ProxySelector proxySelector3 = okHttpClient2.getProxySelector();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.getAuthenticator();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxySelector(proxySelector11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setProxy(proxy19);
        java.net.Proxy proxy21 = okHttpClient18.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient18.setAuthenticator(okAuthenticator22);
        java.net.CookieHandler cookieHandler24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setCookieHandler(cookieHandler24);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(proxySelector3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(proxy21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
    }

    @Test
    public void test25142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25142");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient12.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setHostnameVerifier(hostnameVerifier16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setConnectionPool(connectionPool18);
        java.util.List<java.lang.String> strList20 = okHttpClient17.getTransports();
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient17.setAuthenticator(okAuthenticator21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(okAuthenticator6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(strList20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test25143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25143");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory1);
        com.squareup.okhttp.ConnectionPool connectionPool3 = okHttpClient2.getConnectionPool();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = okHttpClient2.getAuthenticator();
        boolean boolean7 = okHttpClient2.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setProxy(proxy8);
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setProxySelector(proxySelector10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(connectionPool3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(okAuthenticator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }
}

