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
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient2.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass4 = okHttpClient0.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection4 = okHttpClient0.open(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient3.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = okHttpClient0.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient10.open(uRL15);
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
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient3.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = connectionPool7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setResponseCache(responseCache8);
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
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection3 = okHttpClient0.open(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(proxySelector1);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setHostnameVerifier(hostnameVerifier5);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient3.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass8 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient2.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        java.lang.Class<?> wildcardClass8 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient3.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.lang.Class<?> wildcardClass7 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
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
        java.net.ResponseCache responseCache12 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(responseCache12);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient7.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = okHttpClient0.getResponseCache();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        java.net.Proxy proxy12 = okHttpClient10.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNull(proxy12);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setProxySelector(proxySelector6);
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
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient6.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient10.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = hostnameVerifier16.getClass();
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
        org.junit.Assert.assertNull(hostnameVerifier16);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient16.open(uRL18);
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
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxySelector(proxySelector7);
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
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setProxy(proxy6);
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
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = okHttpClient5.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = proxySelector8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.lang.Class<?> wildcardClass8 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient2.getConnectionPool();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient2.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler10 = okHttpClient6.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient3.getAuthenticator();
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
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
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
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        java.lang.Class<?> wildcardClass6 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient10.getConnectionPool();
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
        org.junit.Assert.assertNull(connectionPool17);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
        java.net.ResponseCache responseCache13 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory5);
        java.lang.Class<?> wildcardClass7 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = okAuthenticator9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.lang.Class<?> wildcardClass8 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxy(proxy9);
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
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
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
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient2.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient6.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        java.net.ResponseCache responseCache9 = okHttpClient7.getResponseCache();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient7.open(uRL10);
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
        org.junit.Assert.assertNull(responseCache9);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory11);
        java.lang.Class<?> wildcardClass13 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = okHttpClient4.getProxy();
        java.lang.Class<?> wildcardClass10 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = sSLSocketFactory12.getClass();
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
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = okHttpClient0.getResponseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = responseCache8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection8 = okHttpClient6.open(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
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
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setProxySelector(proxySelector12);
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
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.lang.Class<?> wildcardClass4 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
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
        java.lang.Class<?> wildcardClass13 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
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
        boolean boolean14 = okHttpClient13.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass15 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass8 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setSSLSocketFactory(sSLSocketFactory5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient0.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = okAuthenticator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.Proxy proxy2 = okHttpClient0.getProxy();
        java.net.ResponseCache responseCache3 = okHttpClient0.getResponseCache();
        boolean boolean4 = okHttpClient0.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(responseCache3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient2.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.Proxy proxy8 = okHttpClient7.getProxy();
        boolean boolean9 = okHttpClient7.getFollowProtocolRedirects();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(hostnameVerifier10);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        java.net.ProxySelector proxySelector8 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient3.getSslSocketFactory();
        java.lang.Class<?> wildcardClass10 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
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
        java.net.Proxy proxy14 = okHttpClient13.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setResponseCache(responseCache8);
        java.lang.Class<?> wildcardClass10 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setAuthenticator(okAuthenticator8);
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
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
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
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.lang.Class<?> wildcardClass5 = okHttpClient0.getClass();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setHostnameVerifier(hostnameVerifier10);
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
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
        boolean boolean11 = okHttpClient9.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient3.getHostnameVerifier();
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
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(hostnameVerifier7);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
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
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
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
        boolean boolean11 = okHttpClient6.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.getAuthenticator();
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setCookieHandler(cookieHandler10);
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
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
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
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setHostnameVerifier(hostnameVerifier7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
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
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
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
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
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
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient6.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient5.open(uRL12);
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
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.lang.Class<?> wildcardClass9 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient2.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
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
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setResponseCache(responseCache13);
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxy(proxy6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.net.ProxySelector proxySelector9 = okHttpClient5.getProxySelector();
        java.net.ResponseCache responseCache10 = okHttpClient5.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNull(responseCache10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector8 = okHttpClient2.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = proxySelector8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(proxySelector8);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient7.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
        com.squareup.okhttp.ConnectionPool connectionPool10 = okHttpClient9.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setFollowProtocolRedirects(true);
        boolean boolean5 = okHttpClient0.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient0.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setProxySelector(proxySelector9);
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = okAuthenticator11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient4.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
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
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator24 = okHttpClient23.getAuthenticator();
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
        org.junit.Assert.assertNull(okAuthenticator24);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
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
        java.net.ResponseCache responseCache20 = okHttpClient16.getResponseCache();
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
        org.junit.Assert.assertNull(responseCache20);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.getHostnameVerifier();
        java.net.ResponseCache responseCache9 = okHttpClient5.getResponseCache();
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient5.setProxy(proxy10);
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
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
        java.lang.Class<?> wildcardClass20 = okHttpClient16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setHostnameVerifier(hostnameVerifier15);
        java.lang.Class<?> wildcardClass17 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = okAuthenticator10.getClass();
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
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory8);
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
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
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
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(okAuthenticator17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxy(proxy8);
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
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
        java.net.ResponseCache responseCache19 = okHttpClient13.getResponseCache();
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
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        java.net.ProxySelector proxySelector8 = okHttpClient2.getProxySelector();
        boolean boolean9 = okHttpClient2.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
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
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient6.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = okAuthenticator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        java.lang.Class<?> wildcardClass10 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
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
        java.net.ProxySelector proxySelector12 = okHttpClient11.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass3 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient3.open(uRL13);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
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
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory6);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient6.getAuthenticator();
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
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass8 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.lang.Class<?> wildcardClass8 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
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
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient7.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = okHttpClient0.getProxySelector();
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setProxy(proxy5);
        java.lang.Class<?> wildcardClass7 = okHttpClient0.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxySelector4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
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
        java.lang.Class<?> wildcardClass22 = okHttpClient16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setProxySelector(proxySelector6);
        java.net.Proxy proxy8 = okHttpClient3.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
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
        java.net.CookieHandler cookieHandler13 = okHttpClient11.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(cookieHandler13);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier27 = okHttpClient24.getHostnameVerifier();
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
        org.junit.Assert.assertNull(hostnameVerifier27);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
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
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
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
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient9.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
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
        java.lang.Class<?> wildcardClass18 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient7.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = okAuthenticator10.getClass();
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
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
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
        java.lang.Class<?> wildcardClass19 = okHttpClient16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
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
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient16.open(uRL17);
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
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient3.getSslSocketFactory();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient3.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
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
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setResponseCache(responseCache13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient11.open(uRL15);
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
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient10.getHostnameVerifier();
        java.net.ProxySelector proxySelector18 = okHttpClient10.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool19 = okHttpClient10.getConnectionPool();
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
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNull(proxySelector18);
        org.junit.Assert.assertNull(connectionPool19);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
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
        java.net.ResponseCache responseCache14 = okHttpClient9.getResponseCache();
        java.lang.Class<?> wildcardClass15 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler10 = okHttpClient6.getCookieHandler();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(cookieHandler10);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
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
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.Proxy proxy2 = okHttpClient0.getProxy();
        java.net.ResponseCache responseCache3 = okHttpClient0.getResponseCache();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection5 = okHttpClient0.open(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNull(proxy2);
        org.junit.Assert.assertNull(responseCache3);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ProxySelector proxySelector7 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass10 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient11.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler10 = okHttpClient9.getCookieHandler();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxySelector(proxySelector11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient9.open(uRL13);
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
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
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient2.getAuthenticator();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient2.setProxy(proxy8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient2.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
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
        java.net.ProxySelector proxySelector13 = okHttpClient11.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(proxySelector13);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient11.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
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
        java.lang.Class<?> wildcardClass17 = okHttpClient10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        java.lang.Class<?> wildcardClass7 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
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
        java.lang.Class<?> wildcardClass16 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.ResponseCache responseCache8 = okHttpClient7.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection5 = okHttpClient2.open(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
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
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        java.lang.Class<?> wildcardClass12 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = okHttpClient4.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(sSLSocketFactory9);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
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
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
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
        java.net.CookieHandler cookieHandler14 = okHttpClient11.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        java.lang.Class<?> wildcardClass12 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient3.getSslSocketFactory();
        java.lang.Class<?> wildcardClass6 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection6 = okHttpClient3.open(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
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
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setFollowProtocolRedirects(false);
        boolean boolean19 = okHttpClient16.getFollowProtocolRedirects();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
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
        java.net.Proxy proxy17 = okHttpClient7.getProxy();
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
        org.junit.Assert.assertNull(proxy17);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
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
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setProxy(proxy15);
        java.lang.Class<?> wildcardClass17 = okHttpClient16.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
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
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient16.open(uRL17);
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
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
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
        java.lang.Class<?> wildcardClass17 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
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
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setCookieHandler(cookieHandler13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient11.open(uRL15);
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
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
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
        boolean boolean12 = okHttpClient8.getFollowProtocolRedirects();
        boolean boolean13 = okHttpClient8.getFollowProtocolRedirects();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient8.open(uRL14);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setCookieHandler(cookieHandler5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient4.getSslSocketFactory();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient4.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
        java.lang.Class<?> wildcardClass19 = okHttpClient18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.ProxySelector proxySelector7 = okHttpClient2.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setResponseCache(responseCache7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setHostnameVerifier(hostnameVerifier9);
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
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient10.open(uRL19);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setSSLSocketFactory(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
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
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
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
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
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
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setResponseCache(responseCache13);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient6.open(uRL15);
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
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = okHttpClient0.getResponseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = responseCache5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(responseCache5);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
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
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
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
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
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
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient11.setProxy(proxy15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient16.open(uRL17);
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
        org.junit.Assert.assertNull(okAuthenticator12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
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
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient15.open(uRL17);
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
        org.junit.Assert.assertNull(proxy16);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient22.setSSLSocketFactory(sSLSocketFactory27);
        com.squareup.okhttp.ConnectionPool connectionPool29 = okHttpClient28.getConnectionPool();
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
        org.junit.Assert.assertNull(connectionPool29);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
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
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient0.getAuthenticator();
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setProxySelector(proxySelector6);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient7.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
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
        java.net.CookieHandler cookieHandler18 = okHttpClient17.getCookieHandler();
        java.net.ResponseCache responseCache19 = okHttpClient17.getResponseCache();
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
        org.junit.Assert.assertNull(cookieHandler18);
        org.junit.Assert.assertNull(responseCache19);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setCookieHandler(cookieHandler4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        java.lang.Class<?> wildcardClass7 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient6.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNull(okAuthenticator8);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
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
        java.net.Proxy proxy16 = okHttpClient15.getProxy();
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
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
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
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient10.getConnectionPool();
        java.net.ResponseCache responseCache14 = okHttpClient10.getResponseCache();
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
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(connectionPool13);
        org.junit.Assert.assertNull(responseCache14);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient10.getHostnameVerifier();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient10.open(uRL18);
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
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxySelector(proxySelector7);
        java.lang.Class<?> wildcardClass9 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
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
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient11.open(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
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
        java.net.URL uRL27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection28 = okHttpClient26.open(uRL27);
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
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        java.net.Proxy proxy9 = okHttpClient2.getProxy();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient2.open(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
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
        java.net.CookieHandler cookieHandler12 = okHttpClient11.getCookieHandler();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient11.open(uRL13);
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
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
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
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
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
        java.lang.Class<?> wildcardClass22 = okHttpClient19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient3.getSslSocketFactory();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setResponseCache(responseCache6);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient7.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setAuthenticator(okAuthenticator9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = sSLSocketFactory11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
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
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient8.setResponseCache(responseCache14);
        java.lang.Class<?> wildcardClass16 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient0.setProxy(proxy10);
        java.net.CookieHandler cookieHandler12 = okHttpClient11.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(cookieHandler12);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
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
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
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
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setCookieHandler(cookieHandler11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient8.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = okHttpClient0.getCookieHandler();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = cookieHandler8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(cookieHandler8);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.ProxySelector proxySelector7 = okHttpClient6.getProxySelector();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient6.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(hostnameVerifier8);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
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
        java.net.ProxySelector proxySelector16 = okHttpClient13.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(proxySelector16);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setAuthenticator(okAuthenticator9);
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient10.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        java.lang.Class<?> wildcardClass8 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient3.getHostnameVerifier();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxySelector(proxySelector8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient9.getSslSocketFactory();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient9.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient15.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
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
        java.lang.Class<?> wildcardClass10 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNull(connectionPool9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.lang.Class<?> wildcardClass13 = okHttpClient12.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
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
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
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
        java.net.CookieHandler cookieHandler13 = okHttpClient3.getCookieHandler();
        java.net.ResponseCache responseCache14 = okHttpClient3.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
        org.junit.Assert.assertNull(responseCache14);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
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
        boolean boolean11 = okHttpClient10.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.lang.Class<?> wildcardClass9 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        java.net.ResponseCache responseCache9 = okHttpClient8.getResponseCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = responseCache9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
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
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setConnectionPool(connectionPool5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setCookieHandler(cookieHandler6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        boolean boolean9 = okHttpClient7.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass10 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
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
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient10.getSslSocketFactory();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(sSLSocketFactory16);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient13.setSSLSocketFactory(sSLSocketFactory16);
        boolean boolean18 = okHttpClient17.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.CookieHandler cookieHandler7 = okHttpClient3.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(cookieHandler7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = responseCache16.getClass();
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
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection16 = okHttpClient6.open(uRL15);
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
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setFollowProtocolRedirects(false);
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
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = sSLSocketFactory12.getClass();
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
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setHostnameVerifier(hostnameVerifier7);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = sSLSocketFactory11.getClass();
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
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        java.net.ProxySelector proxySelector9 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setFollowProtocolRedirects(true);
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
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
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
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
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
        java.net.ResponseCache responseCache16 = okHttpClient10.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(responseCache16);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        java.net.ProxySelector proxySelector8 = okHttpClient4.getProxySelector();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setProxy(proxy9);
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
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.lang.Class<?> wildcardClass9 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
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
        java.net.CookieHandler cookieHandler18 = okHttpClient17.getCookieHandler();
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection20 = okHttpClient17.open(uRL19);
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
        org.junit.Assert.assertNull(cookieHandler18);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient9.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
        java.net.ResponseCache responseCache22 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient23 = okHttpClient21.setResponseCache(responseCache22);
        com.squareup.okhttp.ConnectionPool connectionPool24 = okHttpClient21.getConnectionPool();
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
        org.junit.Assert.assertNull(connectionPool24);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient11.getHostnameVerifier();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient11.open(uRL18);
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
        org.junit.Assert.assertNull(responseCache14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector5 = okHttpClient0.getProxySelector();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient0.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxySelector4);
        org.junit.Assert.assertNull(proxySelector5);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient8.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
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
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection30 = okHttpClient28.open(uRL29);
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
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
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
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        boolean boolean15 = okHttpClient14.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setProxy(proxy6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient7.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(connectionPool8);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
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
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
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
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
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
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient16.open(uRL17);
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
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
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
        boolean boolean17 = okHttpClient6.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient0.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxySelector4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
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
        java.net.ProxySelector proxySelector15 = okHttpClient12.getProxySelector();
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setProxy(proxy16);
        boolean boolean18 = okHttpClient17.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = responseCache11.getClass();
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
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNull(responseCache11);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector10 = okHttpClient3.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxySelector10);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = okHttpClient10.getSslSocketFactory();
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient10.setConnectionPool(connectionPool17);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(sSLSocketFactory16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxySelector(proxySelector7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.lang.Class<?> wildcardClass10 = okHttpClient7.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.ConnectionPool connectionPool5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setConnectionPool(connectionPool5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient6.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setCookieHandler(cookieHandler11);
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
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = okHttpClient4.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient4.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory8);
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient4.setResponseCache(responseCache10);
        java.lang.Class<?> wildcardClass12 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
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
        java.net.ResponseCache responseCache13 = okHttpClient12.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = connectionPool7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
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
        com.squareup.okhttp.OkHttpClient okHttpClient26 = okHttpClient24.setConnectionPool(connectionPool25);
        com.squareup.okhttp.ConnectionPool connectionPool27 = okHttpClient24.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = connectionPool27.getClass();
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
        org.junit.Assert.assertNull(connectionPool27);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
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
        java.net.CookieHandler cookieHandler14 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient4.setProxy(proxy15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient4.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(cookieHandler11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient0.setProxy(proxy10);
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
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        java.net.ProxySelector proxySelector2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setProxySelector(proxySelector2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxy(proxy4);
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setCookieHandler(cookieHandler6);
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = proxy8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
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
        boolean boolean27 = okHttpClient22.getFollowProtocolRedirects();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
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
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = okHttpClient3.getAuthenticator();
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxy(proxy5);
        java.lang.Class<?> wildcardClass7 = okHttpClient6.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(okAuthenticator4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier24 = okHttpClient23.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator25 = okHttpClient23.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = okAuthenticator25.getClass();
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
        org.junit.Assert.assertNull(hostnameVerifier24);
        org.junit.Assert.assertNull(okAuthenticator25);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient3.getConnectionPool();
        java.net.Proxy proxy8 = okHttpClient3.getProxy();
        boolean boolean9 = okHttpClient3.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
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
        java.net.CookieHandler cookieHandler18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient10.setCookieHandler(cookieHandler18);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory20 = okHttpClient19.getSslSocketFactory();
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
        org.junit.Assert.assertNull(sSLSocketFactory20);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
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
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection12 = okHttpClient7.open(uRL11);
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
        org.junit.Assert.assertNull(proxy10);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
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
        java.net.Proxy proxy12 = okHttpClient5.getProxy();
        boolean boolean13 = okHttpClient5.getFollowProtocolRedirects();
        java.lang.Class<?> wildcardClass14 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.lang.Class<?> wildcardClass7 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient6.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setAuthenticator(okAuthenticator11);
        java.lang.Class<?> wildcardClass13 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
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
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        java.lang.Class<?> wildcardClass7 = okHttpClient2.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
        java.net.ProxySelector proxySelector14 = okHttpClient12.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(sSLSocketFactory13);
        org.junit.Assert.assertNull(proxySelector14);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient4.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
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
        java.net.ResponseCache responseCache13 = okHttpClient11.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setAuthenticator(okAuthenticator14);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient11.setSSLSocketFactory(sSLSocketFactory16);
        boolean boolean18 = okHttpClient17.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(responseCache13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
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
        java.net.ProxySelector proxySelector12 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setAuthenticator(okAuthenticator15);
        java.net.ProxySelector proxySelector17 = okHttpClient8.getProxySelector();
        java.net.ProxySelector proxySelector18 = okHttpClient8.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNull(proxySelector18);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
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
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setCookieHandler(cookieHandler10);
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
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        java.net.ProxySelector proxySelector9 = okHttpClient6.getProxySelector();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
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
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
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
        java.net.Proxy proxy27 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient24.setProxy(proxy27);
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection30 = okHttpClient28.open(uRL29);
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
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setConnectionPool(connectionPool8);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient7.getSslSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = sSLSocketFactory10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
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
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection18 = okHttpClient16.open(uRL17);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(proxySelector4);
        java.net.ProxySelector proxySelector6 = okHttpClient5.getProxySelector();
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(proxySelector6);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setFollowProtocolRedirects(false);
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient8.setConnectionPool(connectionPool10);
        java.lang.Class<?> wildcardClass12 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
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
        java.net.CookieHandler cookieHandler15 = okHttpClient11.getCookieHandler();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(hostnameVerifier14);
        org.junit.Assert.assertNull(cookieHandler15);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setConnectionPool(connectionPool8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setProxySelector(proxySelector12);
        java.net.Proxy proxy14 = okHttpClient9.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(proxy14);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.Proxy proxy8 = okHttpClient6.getProxy();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setHostnameVerifier(hostnameVerifier9);
        java.lang.Class<?> wildcardClass11 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = hostnameVerifier3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient8.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxy(proxy4);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
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
        java.lang.Class<?> wildcardClass13 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient12.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient16.setHostnameVerifier(hostnameVerifier18);
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
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
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
        com.squareup.okhttp.ConnectionPool connectionPool18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient13.setConnectionPool(connectionPool18);
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient19.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier22 = okHttpClient19.getHostnameVerifier();
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection24 = okHttpClient19.open(uRL23);
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
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNull(hostnameVerifier22);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
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
        java.lang.Class<?> wildcardClass12 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNull(proxy10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient5.getHostnameVerifier();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection9 = okHttpClient5.open(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(hostnameVerifier6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setFollowProtocolRedirects(false);
        java.lang.Class<?> wildcardClass9 = okHttpClient8.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
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
        java.net.CookieHandler cookieHandler24 = okHttpClient23.getCookieHandler();
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
        org.junit.Assert.assertNull(cookieHandler24);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
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
        java.lang.Class<?> wildcardClass13 = okHttpClient10.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setHostnameVerifier(hostnameVerifier7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
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
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient12.open(uRL16);
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
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        java.net.ResponseCache responseCache8 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
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
        java.net.Proxy proxy21 = okHttpClient20.getProxy();
        java.net.ProxySelector proxySelector22 = okHttpClient20.getProxySelector();
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection24 = okHttpClient20.open(uRL23);
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
        org.junit.Assert.assertNull(proxy21);
        org.junit.Assert.assertNull(proxySelector22);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.net.ResponseCache responseCache4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setResponseCache(responseCache4);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient0.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        boolean boolean13 = okHttpClient10.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache14 = okHttpClient10.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(responseCache14);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setConnectionPool(connectionPool7);
        java.net.ProxySelector proxySelector9 = okHttpClient2.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
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
        java.lang.Class<?> wildcardClass24 = okHttpClient21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient5.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient0.getHostnameVerifier();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(hostnameVerifier5);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
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
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxySelector(proxySelector10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
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
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient10.getHostnameVerifier();
        java.net.ResponseCache responseCache17 = okHttpClient10.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient10.setHostnameVerifier(hostnameVerifier18);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient10.open(uRL20);
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
        org.junit.Assert.assertNull(hostnameVerifier16);
        org.junit.Assert.assertNull(responseCache17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient10.getHostnameVerifier();
        java.net.ProxySelector proxySelector18 = okHttpClient10.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator19 = okHttpClient10.getAuthenticator();
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
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNull(proxySelector18);
        org.junit.Assert.assertNull(okAuthenticator19);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
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
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setCookieHandler(cookieHandler11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient8.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
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
        java.net.CookieHandler cookieHandler17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient6.setCookieHandler(cookieHandler17);
        boolean boolean19 = okHttpClient6.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler20 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient21 = okHttpClient6.setCookieHandler(cookieHandler20);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(okHttpClient21);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setCookieHandler(cookieHandler12);
        java.net.ResponseCache responseCache14 = okHttpClient13.getResponseCache();
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
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
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
        java.net.ProxySelector proxySelector11 = okHttpClient4.getProxySelector();
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
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient5.getHostnameVerifier();
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool9 = okHttpClient5.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(connectionPool9);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient0.setCookieHandler(cookieHandler7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient0.setHostnameVerifier(hostnameVerifier9);
        java.lang.Class<?> wildcardClass11 = okHttpClient0.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setCookieHandler(cookieHandler9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient3.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
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
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.ResponseCache responseCache11 = okHttpClient10.getResponseCache();
        java.net.CookieHandler cookieHandler12 = okHttpClient10.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient10.getHostnameVerifier();
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
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(responseCache11);
        org.junit.Assert.assertNull(cookieHandler12);
        org.junit.Assert.assertNull(hostnameVerifier13);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient0.setProxySelector(proxySelector4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setProxySelector(proxySelector8);
        java.net.ResponseCache responseCache10 = okHttpClient9.getResponseCache();
        java.net.ProxySelector proxySelector11 = okHttpClient9.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
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
        java.lang.Class<?> wildcardClass15 = okHttpClient12.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory17);
        java.lang.Class<?> wildcardClass19 = okHttpClient12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
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
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setConnectionPool(connectionPool11);
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient10.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
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
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient2.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = connectionPool13.getClass();
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
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient6.getAuthenticator();
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient6.setCookieHandler(cookieHandler12);
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setResponseCache(responseCache14);
        com.squareup.okhttp.ConnectionPool connectionPool16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient15.setConnectionPool(connectionPool16);
        java.lang.Class<?> wildcardClass18 = okHttpClient17.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.getSslSocketFactory();
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxy(proxy8);
        java.net.CookieHandler cookieHandler10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setCookieHandler(cookieHandler10);
        java.lang.Class<?> wildcardClass12 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
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
        java.net.ProxySelector proxySelector12 = okHttpClient5.getProxySelector();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient5.open(uRL13);
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
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(proxySelector12);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setResponseCache(responseCache6);
        com.squareup.okhttp.OkAuthenticator okAuthenticator8 = okHttpClient7.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setAuthenticator(okAuthenticator9);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
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
        java.lang.Class<?> wildcardClass13 = okHttpClient5.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxySelector(proxySelector5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.net.Proxy proxy9 = okHttpClient8.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxy9);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
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
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient10.open(uRL13);
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
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setHostnameVerifier(hostnameVerifier11);
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setAuthenticator(okAuthenticator13);
        java.net.ResponseCache responseCache15 = okHttpClient14.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.ProxySelector proxySelector5 = okHttpClient4.getProxySelector();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxy(proxy7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient4.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = okHttpClient0.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setHostnameVerifier(hostnameVerifier2);
        java.net.ProxySelector proxySelector4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxySelector(proxySelector4);
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient5.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(cookieHandler1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = okHttpClient3.getProxy();
        java.net.ProxySelector proxySelector5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setProxySelector(proxySelector5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setCookieHandler(cookieHandler9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        java.lang.Class<?> wildcardClass13 = okHttpClient10.getClass();
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
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient0.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
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
        boolean boolean17 = okHttpClient16.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient6.open(uRL12);
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
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        boolean boolean5 = okHttpClient2.getFollowProtocolRedirects();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setAuthenticator(okAuthenticator6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient7.setConnectionPool(connectionPool10);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient7.open(uRL12);
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
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection27 = okHttpClient21.open(uRL26);
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
        org.junit.Assert.assertNull(responseCache18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient25);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = okHttpClient16.getHostnameVerifier();
        java.net.Proxy proxy18 = okHttpClient16.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(hostnameVerifier17);
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setCookieHandler(cookieHandler9);
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
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
        java.net.Proxy proxy21 = okHttpClient20.getProxy();
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
        org.junit.Assert.assertNull(proxy21);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
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
        com.squareup.okhttp.ConnectionPool connectionPool17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient8.setConnectionPool(connectionPool17);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient8.getHostnameVerifier();
        java.net.ProxySelector proxySelector20 = okHttpClient8.getProxySelector();
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection22 = okHttpClient8.open(uRL21);
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
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNull(hostnameVerifier19);
        org.junit.Assert.assertNull(proxySelector20);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        java.net.Proxy proxy4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setProxy(proxy4);
        java.lang.Class<?> wildcardClass6 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = okHttpClient2.getHostnameVerifier();
        java.net.CookieHandler cookieHandler4 = okHttpClient2.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setHostnameVerifier(hostnameVerifier7);
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass11 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
        com.squareup.okhttp.ConnectionPool connectionPool11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setConnectionPool(connectionPool11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        java.lang.Class<?> wildcardClass15 = okHttpClient10.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection34 = okHttpClient32.open(uRL33);
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
        org.junit.Assert.assertNull(responseCache27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient32);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
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
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setHostnameVerifier(hostnameVerifier15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.ProxySelector proxySelector5 = okHttpClient4.getProxySelector();
        java.net.CookieHandler cookieHandler6 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxy(proxy7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient4.setCookieHandler(cookieHandler9);
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
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
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
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
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
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setCookieHandler(cookieHandler15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        java.lang.Class<?> wildcardClass19 = okHttpClient18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
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
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setCookieHandler(cookieHandler15);
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
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(cookieHandler14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
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
        com.squareup.okhttp.ConnectionPool connectionPool13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setConnectionPool(connectionPool13);
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
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
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
        java.net.ProxySelector proxySelector12 = okHttpClient10.getProxySelector();
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setProxySelector(proxySelector13);
        java.net.ResponseCache responseCache15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setResponseCache(responseCache15);
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(hostnameVerifier8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient2.getHostnameVerifier();
        java.net.ResponseCache responseCache6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient2.setResponseCache(responseCache6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
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
        org.junit.Assert.assertNull(hostnameVerifier5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient2.setHostnameVerifier(hostnameVerifier12);
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient2.setCookieHandler(cookieHandler14);
        java.lang.Class<?> wildcardClass16 = okHttpClient15.getClass();
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
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient3.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setAuthenticator(okAuthenticator10);
        java.lang.Class<?> wildcardClass12 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient0.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
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
        java.net.ProxySelector proxySelector10 = okHttpClient5.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(proxySelector10);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        com.squareup.okhttp.ConnectionPool connectionPool5 = okHttpClient0.getConnectionPool();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient0.setCookieHandler(cookieHandler6);
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
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setProxySelector(proxySelector8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        java.lang.Class<?> wildcardClass12 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
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
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        boolean boolean20 = okHttpClient17.getFollowProtocolRedirects();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
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
        com.squareup.okhttp.ConnectionPool connectionPool15 = okHttpClient14.getConnectionPool();
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
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        java.net.ProxySelector proxySelector8 = okHttpClient7.getProxySelector();
        boolean boolean9 = okHttpClient7.getFollowProtocolRedirects();
        java.net.CookieHandler cookieHandler10 = okHttpClient7.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(cookieHandler10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setCookieHandler(cookieHandler8);
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setConnectionPool(connectionPool10);
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient3.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(okAuthenticator12);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
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
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(responseCache18);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
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
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setResponseCache(responseCache14);
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
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
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
        org.junit.Assert.assertNull(okAuthenticator8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
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
        java.net.ProxySelector proxySelector19 = okHttpClient14.getProxySelector();
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
        org.junit.Assert.assertNull(proxySelector19);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        java.net.CookieHandler cookieHandler6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setCookieHandler(cookieHandler6);
        java.net.CookieHandler cookieHandler8 = okHttpClient7.getCookieHandler();
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient7.setHostnameVerifier(hostnameVerifier9);
        java.net.ProxySelector proxySelector11 = okHttpClient7.getProxySelector();
        java.lang.Class<?> wildcardClass12 = okHttpClient7.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(cookieHandler8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
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
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setResponseCache(responseCache11);
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient10.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setCookieHandler(cookieHandler15);
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
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
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
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.CookieHandler cookieHandler7 = okHttpClient6.getCookieHandler();
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(cookieHandler7);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator21 = okHttpClient20.getAuthenticator();
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
        org.junit.Assert.assertNull(okAuthenticator21);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setAuthenticator(okAuthenticator11);
        boolean boolean13 = okHttpClient10.getFollowProtocolRedirects();
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
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
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
        java.lang.Class<?> wildcardClass17 = okHttpClient14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient16.getConnectionPool();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection19 = okHttpClient16.open(uRL18);
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
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(connectionPool17);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
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
        java.net.ResponseCache responseCache14 = okHttpClient11.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(responseCache14);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
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
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient13.setCookieHandler(cookieHandler15);
        java.net.ResponseCache responseCache17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient16.setResponseCache(responseCache17);
        com.squareup.okhttp.ConnectionPool connectionPool19 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient16.setConnectionPool(connectionPool19);
        java.net.CookieHandler cookieHandler21 = okHttpClient20.getCookieHandler();
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
        org.junit.Assert.assertNull(cookieHandler21);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = okHttpClient3.getHostnameVerifier();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxySelector(proxySelector8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setHostnameVerifier(hostnameVerifier10);
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        com.squareup.okhttp.ConnectionPool connectionPool13 = okHttpClient9.getConnectionPool();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(hostnameVerifier7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNull(connectionPool13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient14.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setHostnameVerifier(hostnameVerifier9);
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
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient2.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient2.getSslSocketFactory();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.Proxy proxy7 = okHttpClient2.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNull(sSLSocketFactory5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setCookieHandler(cookieHandler3);
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
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setProxySelector(proxySelector9);
        java.net.CookieHandler cookieHandler11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setCookieHandler(cookieHandler11);
        java.net.Proxy proxy13 = okHttpClient12.getProxy();
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient12.getAuthenticator();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
        org.junit.Assert.assertNull(okAuthenticator14);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
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
        boolean boolean15 = okHttpClient14.getFollowProtocolRedirects();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient14.open(uRL16);
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
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
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
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient14.setProxy(proxy16);
        java.net.ProxySelector proxySelector18 = okHttpClient14.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(proxySelector18);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
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
        boolean boolean12 = okHttpClient3.getFollowProtocolRedirects();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient13.setHostnameVerifier(hostnameVerifier14);
        javax.net.ssl.HostnameVerifier hostnameVerifier16 = okHttpClient15.getHostnameVerifier();
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
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient8.setHostnameVerifier(hostnameVerifier15);
        com.squareup.okhttp.ConnectionPool connectionPool17 = okHttpClient8.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(responseCache9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(hostnameVerifier12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(connectionPool17);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setAuthenticator(okAuthenticator7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient8.getAuthenticator();
        java.net.ProxySelector proxySelector10 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient8.getAuthenticator();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNull(proxySelector10);
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = okHttpClient3.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(proxy8);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setResponseCache(responseCache9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient10.getConnectionPool();
        boolean boolean12 = okHttpClient10.getFollowProtocolRedirects();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        java.net.Proxy proxy18 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient17.setProxy(proxy18);
        java.lang.Class<?> wildcardClass20 = okHttpClient17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
        com.squareup.okhttp.OkAuthenticator okAuthenticator14 = okHttpClient13.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = okHttpClient13.getSslSocketFactory();
        java.lang.Class<?> wildcardClass16 = okHttpClient13.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okAuthenticator14);
        org.junit.Assert.assertNull(sSLSocketFactory15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient9.setSSLSocketFactory(sSLSocketFactory12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient9.setFollowProtocolRedirects(true);
        com.squareup.okhttp.ConnectionPool connectionPool16 = okHttpClient9.getConnectionPool();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNull(connectionPool16);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setProxy(proxy5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setSSLSocketFactory(sSLSocketFactory9);
        java.net.ResponseCache responseCache11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient6.setResponseCache(responseCache11);
        java.net.ProxySelector proxySelector13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient6.setProxySelector(proxySelector13);
        java.net.ProxySelector proxySelector15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setProxySelector(proxySelector15);
        java.lang.Class<?> wildcardClass17 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient16.getSslSocketFactory();
        java.lang.Class<?> wildcardClass18 = okHttpClient16.getClass();
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
        org.junit.Assert.assertNull(sSLSocketFactory17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
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
        java.lang.Class<?> wildcardClass15 = okHttpClient14.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(hostnameVerifier9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient9.getClass();
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
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
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
        java.lang.Class<?> wildcardClass11 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNull(proxySelector8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.Proxy proxy8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setProxy(proxy8);
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setHostnameVerifier(hostnameVerifier10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient3.setProxySelector(proxySelector12);
        com.squareup.okhttp.ConnectionPool connectionPool14 = okHttpClient3.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient3.setAuthenticator(okAuthenticator15);
        java.net.ProxySelector proxySelector17 = okHttpClient16.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool18 = okHttpClient16.getConnectionPool();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory19 = okHttpClient16.getSslSocketFactory();
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection21 = okHttpClient16.open(uRL20);
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
        org.junit.Assert.assertNull(proxySelector17);
        org.junit.Assert.assertNull(connectionPool18);
        org.junit.Assert.assertNull(sSLSocketFactory19);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient2.getConnectionPool();
        java.net.ResponseCache responseCache8 = okHttpClient2.getResponseCache();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient2.setSSLSocketFactory(sSLSocketFactory9);
        java.net.CookieHandler cookieHandler11 = okHttpClient2.getCookieHandler();
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
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(cookieHandler11);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
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
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient12.setSSLSocketFactory(sSLSocketFactory17);
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
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
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
        java.net.Proxy proxy13 = okHttpClient12.getProxy();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(connectionPool8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient3.getConnectionPool();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = okHttpClient3.getAuthenticator();
        java.net.ProxySelector proxySelector10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient3.setProxySelector(proxySelector10);
        java.net.ProxySelector proxySelector12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxySelector(proxySelector12);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory14 = okHttpClient11.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(okAuthenticator9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(sSLSocketFactory14);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier17 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient14.setHostnameVerifier(hostnameVerifier17);
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
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory3 = okHttpClient0.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(sSLSocketFactory3);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
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
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setFollowProtocolRedirects(false);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setCookieHandler(cookieHandler5);
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = proxy7.getClass();
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
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
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
        java.net.Proxy proxy12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setProxy(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(hostnameVerifier3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        java.net.ProxySelector proxySelector12 = okHttpClient8.getProxySelector();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = proxySelector12.getClass();
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
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNull(proxySelector12);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.CookieHandler cookieHandler1 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setCookieHandler(cookieHandler1);
        java.net.CookieHandler cookieHandler3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setCookieHandler(cookieHandler3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = okHttpClient4.getAuthenticator();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setHostnameVerifier(hostnameVerifier8);
        java.net.CookieHandler cookieHandler10 = okHttpClient9.getCookieHandler();
        java.net.ProxySelector proxySelector11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient9.setProxySelector(proxySelector11);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(cookieHandler10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        java.net.ProxySelector proxySelector1 = okHttpClient0.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator2 = okHttpClient0.getAuthenticator();
        java.net.ResponseCache responseCache3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setResponseCache(responseCache3);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection6 = okHttpClient4.open(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(proxySelector1);
        org.junit.Assert.assertNull(okAuthenticator2);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.CookieHandler cookieHandler6 = okHttpClient3.getCookieHandler();
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient3.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(cookieHandler6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
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
        java.lang.Class<?> wildcardClass13 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        java.lang.Class<?> wildcardClass10 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
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
        java.net.Proxy proxy13 = okHttpClient6.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxy13);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setConnectionPool(connectionPool7);
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.ConnectionPool connectionPool11 = okHttpClient8.getConnectionPool();
        java.net.ProxySelector proxySelector12 = okHttpClient8.getProxySelector();
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient8.setAuthenticator(okAuthenticator13);
        java.net.ResponseCache responseCache15 = okHttpClient14.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNull(proxySelector12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(responseCache15);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setConnectionPool(connectionPool7);
        java.lang.Class<?> wildcardClass9 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = okHttpClient2.getAuthenticator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = okAuthenticator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(okAuthenticator3);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        java.net.Proxy proxy10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient0.setProxy(proxy10);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setFollowProtocolRedirects(true);
        java.net.Proxy proxy14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient11.setProxy(proxy14);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.ProxySelector proxySelector7 = okHttpClient0.getProxySelector();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient0.setCookieHandler(cookieHandler8);
        java.net.ResponseCache responseCache10 = okHttpClient9.getResponseCache();
        java.net.Proxy proxy11 = okHttpClient9.getProxy();
        java.lang.Class<?> wildcardClass12 = okHttpClient9.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(responseCache10);
        org.junit.Assert.assertNull(proxy11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier13 = okHttpClient12.getHostnameVerifier();
        java.net.CookieHandler cookieHandler14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setCookieHandler(cookieHandler14);
        com.squareup.okhttp.OkAuthenticator okAuthenticator16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient12.setAuthenticator(okAuthenticator16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient17.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(hostnameVerifier13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
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
        java.net.Proxy proxy16 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient17 = okHttpClient7.setProxy(proxy16);
        javax.net.ssl.HostnameVerifier hostnameVerifier18 = okHttpClient7.getHostnameVerifier();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(cookieHandler15);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(hostnameVerifier18);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
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
        java.net.ProxySelector proxySelector12 = okHttpClient7.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(connectionPool10);
        org.junit.Assert.assertNull(connectionPool11);
        org.junit.Assert.assertNull(proxySelector12);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setHostnameVerifier(hostnameVerifier9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory11);
        java.net.CookieHandler cookieHandler13 = okHttpClient12.getCookieHandler();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(cookieHandler13);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
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
        java.net.ProxySelector proxySelector15 = okHttpClient10.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(connectionPool5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(proxySelector13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(proxySelector15);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
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
        java.lang.Class<?> wildcardClass18 = okHttpClient10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = okHttpClient4.getProxy();
        java.net.ProxySelector proxySelector7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setProxySelector(proxySelector7);
        boolean boolean9 = okHttpClient8.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector10 = okHttpClient8.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(proxySelector10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setCookieHandler(cookieHandler8);
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
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
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
        com.squareup.okhttp.ConnectionPool connectionPool12 = okHttpClient11.getConnectionPool();
        java.net.Proxy proxy13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient11.setProxy(proxy13);
        java.net.CookieHandler cookieHandler15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient14.setCookieHandler(cookieHandler15);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(connectionPool12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        boolean boolean9 = okHttpClient6.getFollowProtocolRedirects();
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
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setConnectionPool(connectionPool6);
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        java.lang.Class<?> wildcardClass10 = okHttpClient9.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.getSslSocketFactory();
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient5.setCookieHandler(cookieHandler7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setAuthenticator(okAuthenticator9);
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient8.getHostnameVerifier();
        java.net.ResponseCache responseCache12 = okHttpClient8.getResponseCache();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(hostnameVerifier11);
        org.junit.Assert.assertNull(responseCache12);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setHostnameVerifier(hostnameVerifier5);
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        java.net.ProxySelector proxySelector8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setProxySelector(proxySelector8);
        java.lang.Class<?> wildcardClass10 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
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
        javax.net.ssl.SSLSocketFactory sSLSocketFactory15 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient16 = okHttpClient10.setSSLSocketFactory(sSLSocketFactory15);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory17 = okHttpClient10.getSslSocketFactory();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNull(sSLSocketFactory17);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ProxySelector proxySelector6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient5.setProxySelector(proxySelector6);
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient5.setHostnameVerifier(hostnameVerifier8);
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
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.ConnectionPool connectionPool4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setConnectionPool(connectionPool4);
        java.net.ResponseCache responseCache6 = okHttpClient5.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        java.net.Proxy proxy8 = okHttpClient5.getProxy();
        java.net.Proxy proxy9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient5.setProxy(proxy9);
        java.net.ProxySelector proxySelector11 = okHttpClient10.getProxySelector();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
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
        java.net.Proxy proxy11 = okHttpClient10.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxy11);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
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
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient8.setFollowProtocolRedirects(false);
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
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
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
        java.net.ResponseCache responseCache29 = okHttpClient28.getResponseCache();
        com.squareup.okhttp.OkAuthenticator okAuthenticator30 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient31 = okHttpClient28.setAuthenticator(okAuthenticator30);
        java.lang.Class<?> wildcardClass32 = okHttpClient31.getClass();
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
        org.junit.Assert.assertNull(responseCache29);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = okHttpClient4.getSslSocketFactory();
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setHostnameVerifier(hostnameVerifier6);
        com.squareup.okhttp.ConnectionPool connectionPool8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient4.setConnectionPool(connectionPool8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection11 = okHttpClient4.open(uRL10);
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
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
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
        java.net.Proxy proxy18 = okHttpClient17.getProxy();
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
        org.junit.Assert.assertNull(proxy18);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
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
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setResponseCache(responseCache10);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient11.getSslSocketFactory();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient11.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(okAuthenticator5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setProxy(proxy10);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient11.setCookieHandler(cookieHandler12);
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
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
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
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection17 = okHttpClient14.open(uRL16);
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
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNull(proxySelector15);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
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
        com.squareup.okhttp.OkAuthenticator okAuthenticator13 = okHttpClient12.getAuthenticator();
        java.net.ResponseCache responseCache14 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient15 = okHttpClient12.setResponseCache(responseCache14);
        java.lang.Class<?> wildcardClass16 = okHttpClient12.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(okAuthenticator13);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
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
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection15 = okHttpClient8.open(uRL14);
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
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory4 = okHttpClient3.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setAuthenticator(okAuthenticator5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient3.setProxy(proxy7);
        javax.net.ssl.HostnameVerifier hostnameVerifier9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient3.setHostnameVerifier(hostnameVerifier9);
        java.net.Proxy proxy11 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setProxy(proxy11);
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
        org.junit.Assert.assertNull(sSLSocketFactory4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.Proxy proxy5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setProxy(proxy5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setCookieHandler(cookieHandler7);
        java.net.ProxySelector proxySelector9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient6.setProxySelector(proxySelector9);
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
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setAuthenticator(okAuthenticator4);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient3.getSslSocketFactory();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient3.getSslSocketFactory();
        java.lang.Class<?> wildcardClass8 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setCookieHandler(cookieHandler4);
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = connectionPool6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ProxySelector proxySelector5 = okHttpClient2.getProxySelector();
        boolean boolean6 = okHttpClient2.getFollowProtocolRedirects();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setResponseCache(responseCache7);
        java.net.ResponseCache responseCache9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setResponseCache(responseCache9);
        java.net.ProxySelector proxySelector11 = okHttpClient8.getProxySelector();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(proxySelector11);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setResponseCache(responseCache5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient6.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(hostnameVerifier8);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.ProxySelector proxySelector5 = okHttpClient3.getProxySelector();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient3.setSSLSocketFactory(sSLSocketFactory6);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient3.setFollowProtocolRedirects(true);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory10 = okHttpClient9.getSslSocketFactory();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient9.getAuthenticator();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory12 = okHttpClient9.getSslSocketFactory();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(sSLSocketFactory10);
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(sSLSocketFactory12);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        javax.net.ssl.HostnameVerifier hostnameVerifier14 = okHttpClient7.getHostnameVerifier();
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
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setFollowProtocolRedirects(false);
        java.net.CookieHandler cookieHandler4 = okHttpClient3.getCookieHandler();
        java.net.CookieHandler cookieHandler5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setCookieHandler(cookieHandler5);
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient3.getConnectionPool();
        java.net.Proxy proxy8 = okHttpClient3.getProxy();
        java.net.CookieHandler cookieHandler9 = okHttpClient3.getCookieHandler();
        java.lang.Class<?> wildcardClass10 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(cookieHandler4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNull(proxy8);
        org.junit.Assert.assertNull(cookieHandler9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        javax.net.ssl.HostnameVerifier hostnameVerifier3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setHostnameVerifier(hostnameVerifier3);
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        java.net.Proxy proxy6 = okHttpClient4.getProxy();
        com.squareup.okhttp.ConnectionPool connectionPool7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient4.setConnectionPool(connectionPool7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
        org.junit.Assert.assertNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
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
        java.lang.Class<?> wildcardClass14 = okHttpClient11.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        java.net.ProxySelector proxySelector3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient2.setProxySelector(proxySelector3);
        com.squareup.okhttp.OkAuthenticator okAuthenticator5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient2.setAuthenticator(okAuthenticator5);
        java.net.CookieHandler cookieHandler7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient2.setCookieHandler(cookieHandler7);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection10 = okHttpClient8.open(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory1 = okHttpClient0.getSslSocketFactory();
        java.net.CookieHandler cookieHandler2 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient3 = okHttpClient0.setCookieHandler(cookieHandler2);
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass6 = okHttpClient3.getClass();
        org.junit.Assert.assertNull(sSLSocketFactory1);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        com.squareup.okhttp.OkHttpClient okHttpClient0 = new com.squareup.okhttp.OkHttpClient();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = okHttpClient0.setFollowProtocolRedirects(true);
        com.squareup.okhttp.OkAuthenticator okAuthenticator3 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient0.setAuthenticator(okAuthenticator3);
        java.net.ResponseCache responseCache5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient0.setResponseCache(responseCache5);
        java.net.Proxy proxy7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setProxy(proxy7);
        com.squareup.okhttp.OkAuthenticator okAuthenticator9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setAuthenticator(okAuthenticator9);
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient8.getSslSocketFactory();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient8.setFollowProtocolRedirects(true);
        java.lang.Class<?> wildcardClass14 = okHttpClient13.getClass();
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNull(sSLSocketFactory11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

