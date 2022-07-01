import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest53 {

    public static boolean debug = false;

    @Test
    public void test26501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26501");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory16);
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setProxySelector(proxySelector18);
        java.net.Proxy proxy20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setProxy(proxy20);
        java.net.CookieHandler cookieHandler22 = okHttpClient21.getCookieHandler();
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection24 = okHttpClient21.open(uRL23);
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
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(cookieHandler22);
    }

    @Test
    public void test26502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26502");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient10.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setHostnameVerifier(hostnameVerifier15);
        java.net.ProxySelector proxySelector17 = okHttpClient10.getProxySelector();
        java.net.Proxy proxy18 = okHttpClient10.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test26503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26503");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setAuthenticator(okAuthenticator15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory17);
        java.net.ResponseCache responseCache19 = okHttpClient14.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test26504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26504");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = okHttpClient18.getSslSocketFactory();
        java.net.CookieHandler cookieHandler26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient18.setCookieHandler(cookieHandler26);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory28);
        java.net.ResponseCache responseCache30 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient31 = okHttpClient29.setResponseCache(responseCache30);
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
        org.junit.Assert.assertNull(sSLSocketFactory25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient31);
    }

    @Test
    public void test26505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26505");
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
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        java.net.ProxySelector proxySelector14 = okHttpClient13.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient13.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setHostnameVerifier(hostnameVerifier16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setSSLSocketFactory(sSLSocketFactory18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = okHttpClient19.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(hostnameVerifier20);
    }

    @Test
    public void test26506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26506");
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
        java.net.CookieHandler cookieHandler12 = okHttpClient8.getCookieHandler();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setProxy(proxy13);
        java.net.ProxySelector proxySelector15 = okHttpClient14.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setAuthenticator(okAuthenticator16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setSSLSocketFactory(sSLSocketFactory18);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setProxySelector(proxySelector20);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(cookieHandler12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test26507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26507");
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
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache13 = okHttpClient10.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient10.getConnectionPool();
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setCookieHandler(cookieHandler15);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test26508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26508");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setConnectionPool(connectionPool5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setHostnameVerifier(hostnameVerifier11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient8.open(uRL13);
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test26509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26509");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = okHttpClient0.getProxySelector();
        java.net.ResponseCache responseCache5 = okHttpClient0.getResponseCache();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector9 = okHttpClient0.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxySelector4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test26510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26510");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setConnectionPool(connectionPool17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient12.setProxySelector(proxySelector19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setResponseCache(responseCache21);
        java.net.ResponseCache responseCache23 = okHttpClient20.getResponseCache();
        java.net.CookieHandler cookieHandler24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient20.setCookieHandler(cookieHandler24);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(responseCache23);
        org.junit.Assert.assertNotNull(okHttpClient25);
    }

    @Test
    public void test26511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26511");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setCookieHandler(cookieHandler15);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test26512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26512");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setAuthenticator(okAuthenticator9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient10.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient10.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test26513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26513");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setHostnameVerifier(hostnameVerifier12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test26514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26514");
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
        java.net.ResponseCache responseCache13 = okHttpClient10.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setHostnameVerifier(hostnameVerifier16);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test26515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26515");
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
        java.net.CookieHandler cookieHandler13 = okHttpClient10.getCookieHandler();
        java.net.ResponseCache responseCache14 = okHttpClient10.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setResponseCache(responseCache17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory19);
        java.net.Proxy proxy21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setProxy(proxy21);
        com.squareup.okhttp.ConnectionPool connectionPool23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setConnectionPool(connectionPool23);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = okHttpClient24.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(sSLSocketFactory25);
    }

    @Test
    public void test26516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26516");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setHostnameVerifier(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test26517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26517");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        java.net.ResponseCache responseCache16 = okHttpClient13.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient13.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
        org.junit.Assert.assertNull(okAuthenticator17);
    }

    @Test
    public void test26518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26518");
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
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxySelector(proxySelector13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxy(proxy15);
        java.net.ResponseCache responseCache17 = okHttpClient14.getResponseCache();
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setProxySelector(proxySelector18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test26519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26519");
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
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient3.setResponseCache(responseCache11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient3.setResponseCache(responseCache13);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient3.setResponseCache(responseCache15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient3.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory18);
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setCookieHandler(cookieHandler20);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test26520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26520");
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
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setFollowProtocolRedirects(false);
        boolean boolean17 = okHttpClient16.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass18 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test26521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26521");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient8.getAuthenticator();
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setProxySelector(proxySelector12);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxySelector(proxySelector14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setResponseCache(responseCache16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = okHttpClient15.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(sSLSocketFactory18);
    }

    @Test
    public void test26522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26522");
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
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient10.setProxySelector(proxySelector19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient10.setResponseCache(responseCache21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setResponseCache(responseCache23);
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
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test26523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26523");
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
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache24 = okHttpClient23.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient23.setConnectionPool(connectionPool25);
        java.lang.Class<?> wildcardClass27 = okHttpClient26.getClass();
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
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(responseCache24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test26524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26524");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setHostnameVerifier(hostnameVerifier5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient8.getConnectionPool();
        java.net.ProxySelector proxySelector10 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setResponseCache(responseCache13);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(connectionPool9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test26525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26525");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setConnectionPool(connectionPool9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient8.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient8.getSslSocketFactory();
        java.net.Proxy proxy13 = okHttpClient8.getProxy();
        java.net.ProxySelector proxySelector14 = okHttpClient8.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNull(proxySelector14);
        org.junit.Assert.assertNull(hostnameVerifier15);
    }

    @Test
    public void test26526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26526");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient9.setProxy(proxy13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient14.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setHostnameVerifier(hostnameVerifier16);
        java.net.Proxy proxy18 = okHttpClient17.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test26527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26527");
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
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient7.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setConnectionPool(connectionPool17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setConnectionPool(connectionPool19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient14.setResponseCache(responseCache21);
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient14.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNull(connectionPool12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test26528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26528");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setCookieHandler(cookieHandler11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
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
    public void test26529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26529");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ResponseCache responseCache5 = okHttpClient2.getResponseCache();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(responseCache5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test26530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26530");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxy(proxy6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient7.getSslSocketFactory();
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient7.setConnectionPool(connectionPool11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient7.setCookieHandler(cookieHandler13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient7.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient7.getConnectionPool();
        java.net.ResponseCache responseCache18 = okHttpClient7.getResponseCache();
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient7.setCookieHandler(cookieHandler19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient7.setResponseCache(responseCache21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(sSLSocketFactory8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNull(connectionPool17);
        org.junit.Assert.assertNull(responseCache18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test26531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26531");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ResponseCache responseCache7 = okHttpClient6.getResponseCache();
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setResponseCache(responseCache8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setProxySelector(proxySelector12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient13.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
    }

    @Test
    public void test26532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26532");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test26533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26533");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setConnectionPool(connectionPool8);
        java.net.Proxy proxy10 = okHttpClient9.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test26534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26534");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setAuthenticator(okAuthenticator13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient6.setProxySelector(proxySelector15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
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
    public void test26535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26535");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient6.getResponseCache();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setCookieHandler(cookieHandler10);
        java.net.CookieHandler cookieHandler12 = okHttpClient11.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setConnectionPool(connectionPool13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setConnectionPool(connectionPool15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(cookieHandler12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test26536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26536");
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
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient10.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient10.setConnectionPool(connectionPool21);
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient10.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient10.setProxySelector(proxySelector25);
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
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test26537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26537");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient0.getSslSocketFactory();
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test26538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26538");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setAuthenticator(okAuthenticator9);
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxySelector(proxySelector11);
        java.net.CookieHandler cookieHandler13 = okHttpClient10.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(sSLSocketFactory8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNull(hostnameVerifier14);
    }

    @Test
    public void test26539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26539");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setAuthenticator(okAuthenticator10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setConnectionPool(connectionPool13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        java.net.CookieHandler cookieHandler17 = okHttpClient14.getCookieHandler();
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(cookieHandler17);
    }

    @Test
    public void test26540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26540");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setCookieHandler(cookieHandler11);
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setProxy(proxy13);
        java.net.CookieHandler cookieHandler15 = okHttpClient14.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setHostnameVerifier(hostnameVerifier16);
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        java.net.ResponseCache responseCache20 = okHttpClient19.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(responseCache20);
    }

    @Test
    public void test26541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26541");
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
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setConnectionPool(connectionPool11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient10.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory14);
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setCookieHandler(cookieHandler16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setHostnameVerifier(hostnameVerifier18);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test26542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26542");
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
        boolean boolean16 = okHttpClient10.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient10.getConnectionPool();
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient10.setProxySelector(proxySelector18);
        java.net.CookieHandler cookieHandler20 = okHttpClient19.getCookieHandler();
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection22 = okHttpClient19.open(uRL21);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(connectionPool17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(cookieHandler20);
    }

    @Test
    public void test26543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26543");
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
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setProxy(proxy19);
        java.net.ProxySelector proxySelector21 = okHttpClient20.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient20.setSSLSocketFactory(sSLSocketFactory22);
        boolean boolean24 = okHttpClient23.getFollowProtocolRedirects();
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
        org.junit.Assert.assertNull(proxySelector21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test26544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26544");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test26545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26545");
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
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setFollowProtocolRedirects(false);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient4.open(uRL15);
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
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test26546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26546");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setAuthenticator(okAuthenticator7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxySelector(proxySelector9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient5.getConnectionPool();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setResponseCache(responseCache12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory14);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test26547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26547");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setResponseCache(responseCache10);
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector16 = okHttpClient15.getProxySelector();
        java.net.ProxySelector proxySelector17 = okHttpClient15.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNull(proxySelector17);
    }

    @Test
    public void test26548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26548");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setProxySelector(proxySelector7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setResponseCache(responseCache9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test26549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26549");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient14.getHostnameVerifier();
        boolean boolean17 = okHttpClient14.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient14.setHostnameVerifier(hostnameVerifier18);
        java.net.CookieHandler cookieHandler20 = okHttpClient19.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient19.setAuthenticator(okAuthenticator21);
        javax.net.ssl.HostnameVerifier hostnameVerifier23 = okHttpClient22.getHostnameVerifier();
        java.net.ProxySelector proxySelector24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient22.setProxySelector(proxySelector24);
        java.net.ResponseCache responseCache26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient25.setResponseCache(responseCache26);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(connectionPool12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(okAuthenticator15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(cookieHandler20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(hostnameVerifier23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test26550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26550");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient6.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setConnectionPool(connectionPool10);
        java.net.ProxySelector proxySelector12 = okHttpClient11.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setAuthenticator(okAuthenticator13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setHostnameVerifier(hostnameVerifier15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setResponseCache(responseCache17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setHostnameVerifier(hostnameVerifier19);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test26551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26551");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
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
    public void test26552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26552");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        java.net.CookieHandler cookieHandler16 = okHttpClient11.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(cookieHandler16);
    }

    @Test
    public void test26553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26553");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setHostnameVerifier(hostnameVerifier17);
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setResponseCache(responseCache19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setResponseCache(responseCache21);
        java.net.ProxySelector proxySelector23 = okHttpClient18.getProxySelector();
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
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(proxySelector23);
    }

    @Test
    public void test26554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26554");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient25.setAuthenticator(okAuthenticator26);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = okHttpClient25.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier29 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient25.setHostnameVerifier(hostnameVerifier29);
        java.net.CookieHandler cookieHandler31 = okHttpClient30.getCookieHandler();
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
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNull(sSLSocketFactory28);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNull(cookieHandler31);
    }
}

