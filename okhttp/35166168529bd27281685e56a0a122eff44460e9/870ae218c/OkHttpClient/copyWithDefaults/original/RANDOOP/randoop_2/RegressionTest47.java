import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test23501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23501");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient13.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setAuthenticator(okAuthenticator17);
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setCookieHandler(cookieHandler19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient20.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(connectionPool21);
    }

    @Test
    public void test23502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23502");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setCookieHandler(cookieHandler16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setSSLSocketFactory(sSLSocketFactory18);
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setAuthenticator(okAuthenticator20);
        java.net.Proxy proxy22 = okHttpClient21.getProxy();
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient21.setResponseCache(responseCache23);
        java.net.CookieHandler cookieHandler25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient21.setCookieHandler(cookieHandler25);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(proxy22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test23503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23503");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setResponseCache(responseCache10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient11.getAuthenticator();
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setCookieHandler(cookieHandler15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient11.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test23504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23504");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setAuthenticator(okAuthenticator10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        boolean boolean14 = okHttpClient11.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setAuthenticator(okAuthenticator15);
        boolean boolean17 = okHttpClient16.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = okHttpClient16.getAuthenticator();
        java.net.ResponseCache responseCache19 = okHttpClient16.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient16.setAuthenticator(okAuthenticator20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setAuthenticator(okAuthenticator22);
        javax.net.ssl.HostnameVerifier hostnameVerifier24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setHostnameVerifier(hostnameVerifier24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient25.setHostnameVerifier(hostnameVerifier26);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory28 = okHttpClient27.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(okAuthenticator18);
        org.junit.Assert.assertNull(responseCache19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNull(sSLSocketFactory28);
    }

    @Test
    public void test23505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23505");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        java.net.ResponseCache responseCache13 = okHttpClient9.getResponseCache();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient9.setAuthenticator(okAuthenticator16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setAuthenticator(okAuthenticator18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setHostnameVerifier(hostnameVerifier20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient17.setAuthenticator(okAuthenticator22);
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache26 = okHttpClient23.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator27 = okHttpClient23.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator28 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient23.setAuthenticator(okAuthenticator28);
        com.squareup.okhttp.ConnectionPool connectionPool30 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient31 = okHttpClient23.setConnectionPool(connectionPool30);
        com.squareup.okhttp.OkHttpClient okHttpClient33 = okHttpClient23.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(responseCache26);
        org.junit.Assert.assertNull(okAuthenticator27);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(okHttpClient33);
    }

    @Test
    public void test23506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23506");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient2.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient2.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient2.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient2.setProxy(proxy15);
        java.net.Proxy proxy17 = okHttpClient2.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test23507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23507");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler13 = okHttpClient11.getCookieHandler();
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setResponseCache(responseCache18);
        java.net.ProxySelector proxySelector20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setProxySelector(proxySelector20);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test23508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23508");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = okHttpClient2.getProxySelector();
        boolean boolean7 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setAuthenticator(okAuthenticator8);
        java.net.Proxy proxy10 = okHttpClient2.getProxy();
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setProxy(proxy11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient12.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient12.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setHostnameVerifier(hostnameVerifier15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient16.open(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test23509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23509");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient13.getSslSocketFactory();
        boolean boolean17 = okHttpClient13.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setProxySelector(proxySelector18);
        java.net.CookieHandler cookieHandler20 = okHttpClient13.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient13.setConnectionPool(connectionPool21);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(cookieHandler20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test23510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23510");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setResponseCache(responseCache10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        java.net.ProxySelector proxySelector13 = okHttpClient11.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setProxySelector(proxySelector16);
        java.net.ResponseCache responseCache18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setResponseCache(responseCache18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setResponseCache(responseCache20);
        java.net.CookieHandler cookieHandler22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient17.setCookieHandler(cookieHandler22);
        com.squareup.okhttp.ConnectionPool connectionPool24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient17.setConnectionPool(connectionPool24);
        java.net.CookieHandler cookieHandler26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient17.setCookieHandler(cookieHandler26);
        java.net.ResponseCache responseCache28 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient17.setResponseCache(responseCache28);
        java.net.ProxySelector proxySelector30 = okHttpClient17.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNull(proxySelector30);
    }

    @Test
    public void test23511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23511");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        java.net.ResponseCache responseCache13 = okHttpClient9.getResponseCache();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient9.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient9.setResponseCache(responseCache18);
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = okHttpClient19.getAuthenticator();
        java.net.ProxySelector proxySelector21 = okHttpClient19.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setConnectionPool(connectionPool22);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(okAuthenticator20);
        org.junit.Assert.assertNull(proxySelector21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test23512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23512");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setHostnameVerifier(hostnameVerifier8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setResponseCache(responseCache10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient11.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient11.getSslSocketFactory();
        java.net.CookieHandler cookieHandler18 = okHttpClient11.getCookieHandler();
        java.net.CookieHandler cookieHandler19 = okHttpClient11.getCookieHandler();
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient11.setResponseCache(responseCache20);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNull(cookieHandler18);
        org.junit.Assert.assertNull(cookieHandler19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test23513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23513");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient4.getAuthenticator();
        java.net.CookieHandler cookieHandler9 = okHttpClient4.getCookieHandler();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setCookieHandler(cookieHandler10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient13.getHostnameVerifier();
        java.net.ResponseCache responseCache17 = okHttpClient13.getResponseCache();
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setProxy(proxy18);
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setAuthenticator(okAuthenticator20);
        java.net.ResponseCache responseCache22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setResponseCache(responseCache22);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient19.setSSLSocketFactory(sSLSocketFactory24);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
    }

    @Test
    public void test23514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23514");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setCookieHandler(cookieHandler6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setAuthenticator(okAuthenticator11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setHostnameVerifier(hostnameVerifier13);
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setFollowProtocolRedirects(false);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setProxy(proxy17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient12.setProxySelector(proxySelector19);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient12.setFollowProtocolRedirects(true);
        java.net.Proxy proxy23 = okHttpClient12.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient12.setHostnameVerifier(hostnameVerifier26);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
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
        org.junit.Assert.assertNull(proxy23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test23515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23515");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setProxy(proxy4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setSSLSocketFactory(sSLSocketFactory8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setSSLSocketFactory(sSLSocketFactory10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient7.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(connectionPool12);
    }

    @Test
    public void test23516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23516");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setAuthenticator(okAuthenticator11);
        java.net.Proxy proxy13 = okHttpClient2.getProxy();
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient2.setResponseCache(responseCache14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setProxy(proxy16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setConnectionPool(connectionPool18);
        java.net.Proxy proxy20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient15.setProxy(proxy20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = okHttpClient15.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(okAuthenticator22);
    }

    @Test
    public void test23517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23517");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setConnectionPool(connectionPool8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setConnectionPool(connectionPool10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient9.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient9.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient9.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(okAuthenticator14);
    }

    @Test
    public void test23518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23518");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxySelector(proxySelector14);
        boolean boolean16 = okHttpClient11.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache17 = okHttpClient11.getResponseCache();
        java.net.ResponseCache responseCache18 = okHttpClient11.getResponseCache();
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient11.setResponseCache(responseCache19);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setHostnameVerifier(hostnameVerifier23);
        java.net.Proxy proxy25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setProxy(proxy25);
        java.net.CookieHandler cookieHandler27 = okHttpClient24.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator28 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient24.setAuthenticator(okAuthenticator28);
        java.net.ResponseCache responseCache30 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient31 = okHttpClient29.setResponseCache(responseCache30);
        boolean boolean32 = okHttpClient31.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNull(responseCache18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNull(cookieHandler27);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test23519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23519");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        java.net.Proxy proxy8 = okHttpClient4.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setConnectionPool(connectionPool13);
        java.net.ResponseCache responseCache15 = okHttpClient10.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient10.getConnectionPool();
        boolean boolean17 = okHttpClient10.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23520");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient4.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        java.net.Proxy proxy11 = okHttpClient4.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient4.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient4.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient16.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
    }

    @Test
    public void test23521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23521");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setHostnameVerifier(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test23522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23522");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        boolean boolean8 = okHttpClient4.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setConnectionPool(connectionPool12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient13.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient13.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNull(hostnameVerifier15);
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test23523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23523");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory4);
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setHostnameVerifier(hostnameVerifier8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory11);
        java.net.CookieHandler cookieHandler13 = okHttpClient9.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
    }

    @Test
    public void test23524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23524");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setCookieHandler(cookieHandler15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setConnectionPool(connectionPool17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = okHttpClient18.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setAuthenticator(okAuthenticator22);
        com.squareup.okhttp.OkAuthenticator okAuthenticator24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient21.setAuthenticator(okAuthenticator24);
        java.lang.Class<?> wildcardClass26 = okHttpClient25.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(connectionPool19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test23525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23525");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setAuthenticator(okAuthenticator8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setProxy(proxy15);
        java.net.ResponseCache responseCache17 = okHttpClient16.getResponseCache();
        java.net.ProxySelector proxySelector18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setProxySelector(proxySelector18);
        com.squareup.okhttp.ConnectionPool connectionPool20 = okHttpClient19.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient19.setSSLSocketFactory(sSLSocketFactory21);
        java.net.ProxySelector proxySelector23 = okHttpClient22.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator24 = okHttpClient22.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(connectionPool20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(proxySelector23);
        org.junit.Assert.assertNull(okAuthenticator24);
    }

    @Test
    public void test23526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23526");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setConnectionPool(connectionPool5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setHostnameVerifier(hostnameVerifier7);
        java.net.ProxySelector proxySelector9 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient0.setConnectionPool(connectionPool10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setAuthenticator(okAuthenticator12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test23527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23527");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setConnectionPool(connectionPool14);
        java.net.CookieHandler cookieHandler16 = okHttpClient11.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setAuthenticator(okAuthenticator17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient18.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(cookieHandler16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
    }

    @Test
    public void test23528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23528");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setCookieHandler(cookieHandler6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        java.net.ProxySelector proxySelector14 = okHttpClient11.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test23529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23529");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient15.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = okHttpClient15.getAuthenticator();
        java.net.Proxy proxy18 = okHttpClient15.getProxy();
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient15.setCookieHandler(cookieHandler19);
        java.net.CookieHandler cookieHandler21 = okHttpClient15.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNull(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(cookieHandler21);
    }

    @Test
    public void test23530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23530");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        boolean boolean8 = okHttpClient4.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setConnectionPool(connectionPool11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient12.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient12.setAuthenticator(okAuthenticator18);
        java.net.ResponseCache responseCache20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient12.setResponseCache(responseCache20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setAuthenticator(okAuthenticator22);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test23531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23531");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient11.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setAuthenticator(okAuthenticator15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setProxy(proxy17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory19);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test23532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23532");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setHostnameVerifier(hostnameVerifier11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setProxy(proxy17);
        java.lang.Class<?> wildcardClass19 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23533");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setAuthenticator(okAuthenticator12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient4.getSslSocketFactory();
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient4.setProxySelector(proxySelector15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test23534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23534");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setHostnameVerifier(hostnameVerifier8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setConnectionPool(connectionPool12);
        java.net.ResponseCache responseCache14 = okHttpClient9.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = okHttpClient9.getAuthenticator();
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient9.setResponseCache(responseCache16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = okHttpClient9.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNull(okAuthenticator15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(okAuthenticator18);
    }

    @Test
    public void test23535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23535");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        java.net.ResponseCache responseCache13 = okHttpClient9.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient9.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient9.setFollowProtocolRedirects(false);
        boolean boolean17 = okHttpClient9.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient9.setConnectionPool(connectionPool18);
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient9.setCookieHandler(cookieHandler20);
        java.net.ProxySelector proxySelector22 = okHttpClient21.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator23 = okHttpClient21.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(proxySelector22);
        org.junit.Assert.assertNull(okAuthenticator23);
    }

    @Test
    public void test23536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23536");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setCookieHandler(cookieHandler13);
        java.net.Proxy proxy15 = okHttpClient11.getProxy();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient11.getHostnameVerifier();
        boolean boolean19 = okHttpClient11.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient11.setConnectionPool(connectionPool20);
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier24 = okHttpClient21.getHostnameVerifier();
        java.net.ResponseCache responseCache25 = okHttpClient21.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNull(hostnameVerifier24);
        org.junit.Assert.assertNull(responseCache25);
    }

    @Test
    public void test23537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23537");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory14);
        boolean boolean16 = okHttpClient11.getFollowProtocolRedirects();
        boolean boolean17 = okHttpClient11.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23538");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler13 = okHttpClient11.getCookieHandler();
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        boolean boolean16 = okHttpClient15.getFollowProtocolRedirects();
        boolean boolean17 = okHttpClient15.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient15.getHostnameVerifier();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory19);
        com.squareup.okhttp.ConnectionPool connectionPool21 = okHttpClient15.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool22 = okHttpClient15.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(hostnameVerifier18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(connectionPool21);
        org.junit.Assert.assertNull(connectionPool22);
    }

    @Test
    public void test23539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23539");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        java.net.ResponseCache responseCache13 = okHttpClient9.getResponseCache();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient9.setFollowProtocolRedirects(false);
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setCookieHandler(cookieHandler20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setSSLSocketFactory(sSLSocketFactory22);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test23540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23540");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        java.net.ResponseCache responseCache13 = okHttpClient9.getResponseCache();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient9.setAuthenticator(okAuthenticator16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setAuthenticator(okAuthenticator18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient17.setHostnameVerifier(hostnameVerifier20);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient17.setAuthenticator(okAuthenticator22);
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient23.setAuthenticator(okAuthenticator26);
        com.squareup.okhttp.OkHttpClient okHttpClient29 = okHttpClient27.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory30 = okHttpClient27.getSslSocketFactory();
        java.net.CookieHandler cookieHandler31 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient32 = okHttpClient27.setCookieHandler(cookieHandler31);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNull(sSLSocketFactory30);
        org.junit.Assert.assertNotNull(okHttpClient32);
    }

    @Test
    public void test23541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23541");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient2.setResponseCache(responseCache10);
        com.squareup.okhttp.ConnectionPool connectionPool12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setConnectionPool(connectionPool12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient2.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient2.setConnectionPool(connectionPool17);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setSSLSocketFactory(sSLSocketFactory19);
        java.net.Proxy proxy21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setProxy(proxy21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setResponseCache(responseCache23);
        javax.net.ssl.HostnameVerifier hostnameVerifier25 = okHttpClient24.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(hostnameVerifier25);
    }

    @Test
    public void test23542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23542");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache11 = okHttpClient9.getResponseCache();
        java.net.ProxySelector proxySelector12 = okHttpClient9.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient9.setAuthenticator(okAuthenticator13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient9.setConnectionPool(connectionPool15);
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient9.setCookieHandler(cookieHandler17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient9.setProxySelector(proxySelector19);
        javax.net.ssl.HostnameVerifier hostnameVerifier21 = okHttpClient9.getHostnameVerifier();
        java.net.CookieHandler cookieHandler22 = okHttpClient9.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient9.setConnectionPool(connectionPool23);
        java.net.Proxy proxy25 = okHttpClient9.getProxy();
        java.net.ProxySelector proxySelector26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient9.setProxySelector(proxySelector26);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(hostnameVerifier21);
        org.junit.Assert.assertNull(cookieHandler22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNull(proxy25);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test23543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23543");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setProxy(proxy16);
        java.net.ResponseCache responseCache18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setResponseCache(responseCache18);
        java.net.CookieHandler cookieHandler20 = okHttpClient19.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient19.setAuthenticator(okAuthenticator21);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient22.setProxySelector(proxySelector23);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(cookieHandler20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test23544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23544");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setAuthenticator(okAuthenticator17);
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setProxySelector(proxySelector19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient18.setAuthenticator(okAuthenticator21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient18.setResponseCache(responseCache23);
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient18.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient18.setHostnameVerifier(hostnameVerifier27);
        com.squareup.okhttp.OkAuthenticator okAuthenticator29 = okHttpClient28.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNull(okAuthenticator29);
    }

    @Test
    public void test23545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23545");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector16 = okHttpClient15.getProxySelector();
        java.net.CookieHandler cookieHandler17 = okHttpClient15.getCookieHandler();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = okHttpClient19.getSslSocketFactory();
        boolean boolean23 = okHttpClient19.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNull(cookieHandler17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(sSLSocketFactory22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23546");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        boolean boolean4 = okHttpClient2.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setFollowProtocolRedirects(true);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory13);
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = okHttpClient14.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(hostnameVerifier15);
    }

    @Test
    public void test23547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23547");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setFollowProtocolRedirects(true);
        boolean boolean18 = okHttpClient17.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient17.setProxySelector(proxySelector19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setAuthenticator(okAuthenticator21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient20.setResponseCache(responseCache23);
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient20.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient20.setResponseCache(responseCache27);
        java.net.ResponseCache responseCache29 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient28.setResponseCache(responseCache29);
        com.squareup.okhttp.OkAuthenticator okAuthenticator31 = okHttpClient28.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNull(okAuthenticator31);
    }

    @Test
    public void test23548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23548");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient6.getConnectionPool();
        java.net.ProxySelector proxySelector9 = okHttpClient6.getProxySelector();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setProxySelector(proxySelector10);
        java.net.ResponseCache responseCache12 = okHttpClient6.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient6.getAuthenticator();
        java.net.ProxySelector proxySelector14 = okHttpClient6.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test23549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23549");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setProxy(proxy12);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setAuthenticator(okAuthenticator15);
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setHostnameVerifier(hostnameVerifier17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test23550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23550");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setAuthenticator(okAuthenticator7);
        com.squareup.okhttp.ConnectionPool connectionPool9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setConnectionPool(connectionPool9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient0.setHostnameVerifier(hostnameVerifier11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        boolean boolean15 = okHttpClient12.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient12.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test23551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23551");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxySelector(proxySelector7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setCookieHandler(cookieHandler9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setCookieHandler(cookieHandler11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setSSLSocketFactory(sSLSocketFactory15);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector21 = okHttpClient18.getProxySelector();
        java.net.ProxySelector proxySelector22 = okHttpClient18.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(proxySelector21);
        org.junit.Assert.assertNull(proxySelector22);
    }

    @Test
    public void test23552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23552");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient13.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = okHttpClient13.getAuthenticator();
        boolean boolean22 = okHttpClient13.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool23 = okHttpClient13.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(okAuthenticator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(connectionPool23);
    }

    @Test
    public void test23553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23553");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxySelector(proxySelector7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setHostnameVerifier(hostnameVerifier9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        java.lang.Class<?> wildcardClass15 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23554");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setAuthenticator(okAuthenticator7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setAuthenticator(okAuthenticator11);
        boolean boolean13 = okHttpClient12.getFollowProtocolRedirects();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient12.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient12.setHostnameVerifier(hostnameVerifier15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient12.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator20 = okHttpClient12.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(hostnameVerifier19);
        org.junit.Assert.assertNull(okAuthenticator20);
    }

    @Test
    public void test23555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23555");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        java.net.ProxySelector proxySelector14 = okHttpClient13.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setFollowProtocolRedirects(false);
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient13.setResponseCache(responseCache19);
        java.net.ResponseCache responseCache21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient13.setResponseCache(responseCache21);
        java.net.ResponseCache responseCache23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient13.setResponseCache(responseCache23);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxySelector14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test23556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23556");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setCookieHandler(cookieHandler13);
        java.net.Proxy proxy15 = okHttpClient11.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory16);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setCookieHandler(cookieHandler18);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient17.open(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxy15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test23557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23557");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setConnectionPool(connectionPool5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient0.getHostnameVerifier();
        boolean boolean8 = okHttpClient0.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient0.setConnectionPool(connectionPool11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient12.getAuthenticator();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setCookieHandler(cookieHandler14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient17.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test23558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23558");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxySelector(proxySelector7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        java.net.ResponseCache responseCache13 = okHttpClient10.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setConnectionPool(connectionPool14);
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setProxy(proxy16);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setSSLSocketFactory(sSLSocketFactory18);
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test23559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23559");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient4.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setHostnameVerifier(hostnameVerifier7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient10.setFollowProtocolRedirects(false);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setHostnameVerifier(hostnameVerifier16);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setCookieHandler(cookieHandler18);
        java.net.Proxy proxy20 = okHttpClient19.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNull(proxy20);
    }

    @Test
    public void test23560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23560");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setHostnameVerifier(hostnameVerifier12);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient13.getConnectionPool();
        java.net.ProxySelector proxySelector16 = okHttpClient13.getProxySelector();
        java.net.Proxy proxy17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setProxy(proxy17);
        java.net.Proxy proxy19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient13.setProxy(proxy19);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNull(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test23561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23561");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setHostnameVerifier(hostnameVerifier3);
        java.net.Proxy proxy5 = okHttpClient0.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setAuthenticator(okAuthenticator6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setProxySelector(proxySelector8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory10);
        java.net.Proxy proxy12 = okHttpClient11.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient11.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test23562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23562");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient4.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setHostnameVerifier(hostnameVerifier7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.getHostnameVerifier();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setResponseCache(responseCache12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        java.net.ResponseCache responseCache16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setResponseCache(responseCache16);
        java.lang.Class<?> wildcardClass18 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23563");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory13 = okHttpClient11.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient11.getConnectionPool();
        java.net.ProxySelector proxySelector15 = okHttpClient11.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setConnectionPool(connectionPool16);
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient11.setAuthenticator(okAuthenticator18);
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setCookieHandler(cookieHandler20);
        com.squareup.okhttp.ConnectionPool connectionPool22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setConnectionPool(connectionPool22);
        boolean boolean24 = okHttpClient21.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNull(connectionPool14);
        org.junit.Assert.assertNull(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test23564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23564");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        java.net.Proxy proxy8 = okHttpClient4.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient10.setAuthenticator(okAuthenticator12);
        java.net.CookieHandler cookieHandler14 = okHttpClient13.getCookieHandler();
        com.squareup.okhttp.ConnectionPool connectionPool15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setConnectionPool(connectionPool15);
        java.net.ProxySelector proxySelector17 = okHttpClient13.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setAuthenticator(okAuthenticator18);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test23565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23565");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setHostnameVerifier(hostnameVerifier10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setCookieHandler(cookieHandler16);
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
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
    }

    @Test
    public void test23566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23566");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setCookieHandler(cookieHandler11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient9.setResponseCache(responseCache13);
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient9.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient9.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(connectionPool15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test23567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23567");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setHostnameVerifier(hostnameVerifier12);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setProxy(proxy14);
        java.net.CookieHandler cookieHandler16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setCookieHandler(cookieHandler16);
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setCookieHandler(cookieHandler20);
        java.net.ResponseCache responseCache22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient19.setResponseCache(responseCache22);
        java.net.ProxySelector proxySelector24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setProxySelector(proxySelector24);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient23.setSSLSocketFactory(sSLSocketFactory26);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
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
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
    }

    @Test
    public void test23568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23568");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setProxy(proxy8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setAuthenticator(okAuthenticator10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient13.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient13.setAuthenticator(okAuthenticator17);
        java.net.ResponseCache responseCache19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setResponseCache(responseCache19);
        javax.net.ssl.HostnameVerifier hostnameVerifier21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setHostnameVerifier(hostnameVerifier21);
        javax.net.ssl.HostnameVerifier hostnameVerifier23 = okHttpClient20.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient20.setAuthenticator(okAuthenticator24);
        java.net.CookieHandler cookieHandler26 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient20.setCookieHandler(cookieHandler26);
        java.lang.Class<?> wildcardClass28 = okHttpClient20.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNull(hostnameVerifier23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test23569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23569");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient4.setHostnameVerifier(hostnameVerifier11);
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23570");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        boolean boolean7 = okHttpClient4.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setCookieHandler(cookieHandler8);
        boolean boolean10 = okHttpClient9.getFollowProtocolRedirects();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setProxy(proxy15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setConnectionPool(connectionPool17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setAuthenticator(okAuthenticator19);
        javax.net.ssl.HostnameVerifier hostnameVerifier21 = okHttpClient20.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient20.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNull(hostnameVerifier21);
        org.junit.Assert.assertNotNull(okHttpClient23);
    }

    @Test
    public void test23571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23571");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient2.getSslSocketFactory();
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setProxy(proxy12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient2.setResponseCache(responseCache14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = okHttpClient2.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient2.setConnectionPool(connectionPool17);
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient18.setAuthenticator(okAuthenticator19);
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient20.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(okAuthenticator16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
    }

    @Test
    public void test23572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23572");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        java.net.ResponseCache responseCache7 = okHttpClient4.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setAuthenticator(okAuthenticator9);
        java.net.ProxySelector proxySelector11 = okHttpClient4.getProxySelector();
        java.net.ResponseCache responseCache12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setResponseCache(responseCache12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory16);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setCookieHandler(cookieHandler18);
        javax.net.ssl.HostnameVerifier hostnameVerifier20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setHostnameVerifier(hostnameVerifier20);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory22 = okHttpClient21.getSslSocketFactory();
        java.net.CookieHandler cookieHandler23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient21.setCookieHandler(cookieHandler23);
        com.squareup.okhttp.ConnectionPool connectionPool25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient21.setConnectionPool(connectionPool25);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(sSLSocketFactory22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
    }

    @Test
    public void test23573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23573");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setCookieHandler(cookieHandler11);
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient2.setCookieHandler(cookieHandler13);
        java.net.ResponseCache responseCache15 = okHttpClient14.getResponseCache();
        java.net.ProxySelector proxySelector16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setProxySelector(proxySelector16);
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient14.getConnectionPool();
        java.net.CookieHandler cookieHandler19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient14.setCookieHandler(cookieHandler19);
        java.net.Proxy proxy21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient14.setProxy(proxy21);
        java.net.ProxySelector proxySelector23 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient14.setProxySelector(proxySelector23);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory25 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setSSLSocketFactory(sSLSocketFactory25);
        com.squareup.okhttp.OkAuthenticator okAuthenticator27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient24.setAuthenticator(okAuthenticator27);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory29 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient30 = okHttpClient28.setSSLSocketFactory(sSLSocketFactory29);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(connectionPool18);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient30);
    }

    @Test
    public void test23574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23574");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = okHttpClient2.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient2.setAuthenticator(okAuthenticator11);
        java.net.Proxy proxy13 = okHttpClient2.getProxy();
        java.net.ProxySelector proxySelector14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient2.setProxySelector(proxySelector14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setSSLSocketFactory(sSLSocketFactory16);
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient15.setCookieHandler(cookieHandler18);
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient15.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setAuthenticator(okAuthenticator22);
        java.net.Proxy proxy24 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient25 = okHttpClient23.setProxy(proxy24);
        javax.net.ssl.HostnameVerifier hostnameVerifier26 = okHttpClient25.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNull(hostnameVerifier26);
    }

    @Test
    public void test23575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test23575");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setProxySelector(proxySelector1);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        javax.net.ssl.HostnameVerifier hostnameVerifier4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient2.setHostnameVerifier(hostnameVerifier4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setProxySelector(proxySelector6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setConnectionPool(connectionPool10);
        boolean boolean12 = okHttpClient11.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setAuthenticator(okAuthenticator13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setCookieHandler(cookieHandler15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient11.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool20 = okHttpClient11.getConnectionPool();
        java.net.Proxy proxy21 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient22 = okHttpClient11.setProxy(proxy21);
        boolean boolean23 = okHttpClient11.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(hostnameVerifier19);
        org.junit.Assert.assertNull(connectionPool20);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }
}

