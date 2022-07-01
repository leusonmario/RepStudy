import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        boolean boolean4 = okHttpClient3.followProtocolRedirects;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient3.setFollowProtocolRedirects(false);
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient3.authenticator;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy10 = serializedObjectSupporter9.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy13 = serializedObjectSupporter9.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter9.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter9.deserializeObjectOkHttpClient55();
        okHttpClient8.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.Class<?> wildcardClass17 = serializedObjectSupporter9.getClass();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, (long) (short) 10);
        connectionPool2.evictAll();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        javax.net.ssl.HostnameVerifier hostnameVerifier5 = okHttpClient4.getHostnameVerifier();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient4.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(hostnameVerifier5);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
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
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 10, (-1L));
        int int3 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy10 = serializedObjectSupporter6.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter6.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient12.copyWithDefaults();
        com.squareup.okhttp.Route[] routeArray14 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet15 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet15, routeArray14);
        okHttpClient13.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet15);
        okHttpClient5.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet15);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(routeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(0, (long) 100);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient7.copyWithDefaults();
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy8();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(100, (-1L));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient6.copyWithDefaults();
        com.squareup.okhttp.Route[] routeArray8 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet9 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet9, routeArray8);
        okHttpClient7.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet9);
        java.net.CookieHandler cookieHandler12 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient7.setCookieHandler(cookieHandler12);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(routeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = okHttpClient3.copyWithDefaults();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy6 = serializedObjectSupporter5.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter5.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter5.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter5.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter5.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter5.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter5.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter5.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter5.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter5.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter5.deserializeObjectOkHttpClient95();
        java.util.Set<com.squareup.okhttp.Route> routeSet18 = okHttpClient17.failedRoutes;
        okHttpClient3.failedRoutes = routeSet18;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy6);
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
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(routeSet18);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter11.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter11.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter11.deserializeObjectOkHttpClient52();
        java.net.Proxy proxy15 = serializedObjectSupporter11.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter11.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter11.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkAuthenticator okAuthenticator18 = okHttpClient17.authenticator;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter19 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy20 = serializedObjectSupporter19.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter19.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter19.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter19.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.Route[] routeArray24 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet25 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet25, routeArray24);
        okHttpClient23.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet25);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter28 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy29 = serializedObjectSupporter28.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter28.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter28.deserializeObjectOkHttpClient198();
        java.net.ProxySelector proxySelector32 = java.net.ProxySelector.getDefault();
        okHttpClient31.proxySelector = proxySelector32;
        okHttpClient23.proxySelector = proxySelector32;
        com.squareup.okhttp.OkHttpClient okHttpClient35 = okHttpClient17.setProxySelector(proxySelector32);
        com.squareup.okhttp.OkHttpClient okHttpClient36 = okHttpClient10.setProxySelector(proxySelector32);
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNull(okAuthenticator18);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(routeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(proxySelector32);
        org.junit.Assert.assertNotNull(okHttpClient35);
        org.junit.Assert.assertNotNull(okHttpClient36);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.ConnectionPool connectionPool10 = null;
        okHttpClient9.connectionPool = connectionPool10;
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.connectionPool;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.InetAddress inetAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket3 = socketFactory0.createSocket(inetAddress1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.Socket socket4 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        java.net.InetAddress inetAddress7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket9 = socketFactory0.createSocket(inetAddress5, (int) (short) 10, inetAddress7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: port out of range:-1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket4);
        org.junit.Assert.assertEquals(socket4.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient10.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
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
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter6.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient138();
        java.util.Set<com.squareup.okhttp.Route> routeSet15 = okHttpClient14.getfailedRoutes();
        okHttpClient5.setfailedRoutes(routeSet15);
        java.net.ProxySelector proxySelector17 = okHttpClient5.proxySelector;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(routeSet15);
        org.junit.Assert.assertNull(proxySelector17);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter2 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy3 = serializedObjectSupporter2.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter2.deserializeObjectOkHttpClient137();
        boolean boolean5 = proxy1.equals((java.lang.Object) serializedObjectSupporter2);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter2.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter2.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter2.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter2.deserializeObjectOkHttpClient16();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, (long) 1);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        java.net.CookieHandler cookieHandler10 = null;
        okHttpClient9.cookieHandler = cookieHandler10;
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        java.net.ResponseCache responseCache8 = okHttpClient7.responseCache;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(responseCache8);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.SocketAddress socketAddress5 = proxy4.address();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(socketAddress5);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
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
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.ConnectionPool connectionPool8 = new com.squareup.okhttp.ConnectionPool((int) (byte) 0, 0L);
        com.squareup.okhttp.Address address9 = null;
        com.squareup.okhttp.Connection connection10 = connectionPool8.get(address9);
        com.squareup.okhttp.Address address11 = null;
        com.squareup.okhttp.Connection connection12 = connectionPool8.get(address11);
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient5.setConnectionPool(connectionPool8);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connection10);
        org.junit.Assert.assertNull(connection12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.squareup.okhttp.ConnectionPool connectionPool0 = com.squareup.okhttp.ConnectionPool.getDefault();
        int int1 = connectionPool0.getConnectionCount();
        org.junit.Assert.assertNotNull(connectionPool0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy2();
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.connectionPool;
        com.squareup.okhttp.ConnectionPool connectionPool10 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, (long) (short) 100);
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient6.setConnectionPool(connectionPool10);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        java.lang.Class<?> wildcardClass13 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient8.copyWithDefaults();
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy6();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy10 = serializedObjectSupporter9.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter9.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter9.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter9.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter9.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter17 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy18 = serializedObjectSupporter17.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter17.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter17.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter21 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy22 = serializedObjectSupporter21.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter21.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter21.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter21.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter26 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy27 = serializedObjectSupporter26.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter26.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter26.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter26.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter26.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient32 = serializedObjectSupporter26.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy33 = serializedObjectSupporter26.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter26.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy35 = serializedObjectSupporter26.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter26.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient37 = serializedObjectSupporter26.deserializeObjectOkHttpClient116();
        java.net.ProxySelector proxySelector38 = java.net.ProxySelector.getDefault();
        okHttpClient37.proxySelector = proxySelector38;
        com.squareup.okhttp.OkHttpClient okHttpClient40 = okHttpClient25.setProxySelector(proxySelector38);
        com.squareup.okhttp.OkHttpClient okHttpClient41 = okHttpClient20.setProxySelector(proxySelector38);
        com.squareup.okhttp.OkHttpClient okHttpClient42 = okHttpClient16.setProxySelector(proxySelector38);
        okHttpClient8.proxySelector = proxySelector38;
        java.net.URI uRI44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList45 = proxySelector38.select(uRI44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(proxy27);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNotNull(proxy33);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(proxy35);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(okHttpClient37);
        org.junit.Assert.assertNotNull(proxySelector38);
        org.junit.Assert.assertNotNull(okHttpClient40);
        org.junit.Assert.assertNotNull(okHttpClient41);
        org.junit.Assert.assertNotNull(okHttpClient42);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory5 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setSSLSocketFactory(sSLSocketFactory5);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket("HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:43383", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:43383");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = null;
        okHttpClient4.serializedObjectSupporter = serializedObjectSupporter5;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.ProxySelector proxySelector5 = okHttpClient4.proxySelector;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter6.deserializeObjectOkHttpClient122();
        java.net.Proxy proxy12 = serializedObjectSupporter6.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = okHttpClient4.setProxy(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxySelector5);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter4 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy5 = serializedObjectSupporter4.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter4.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter4.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter4.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter4.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter4.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy11 = serializedObjectSupporter4.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter4.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy13 = serializedObjectSupporter4.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter4.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter4.deserializeObjectOkHttpClient116();
        java.net.ProxySelector proxySelector16 = java.net.ProxySelector.getDefault();
        okHttpClient15.proxySelector = proxySelector16;
        com.squareup.okhttp.OkHttpClient okHttpClient18 = okHttpClient3.setProxySelector(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient1);
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
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxySelector16);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy7();
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
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy10();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        java.net.Proxy.Type type5 = proxy4.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy10 = serializedObjectSupporter6.deserializeObjectProxy6();
        java.net.Proxy.Type type11 = proxy10.type();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter12 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy13 = serializedObjectSupporter12.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter12.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter12.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy16 = serializedObjectSupporter12.deserializeObjectProxy3();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter17 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy18 = serializedObjectSupporter17.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter17.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter17.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter17.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter17.deserializeObjectOkHttpClient117();
        boolean boolean23 = proxy16.equals((java.lang.Object) serializedObjectSupporter17);
        java.net.SocketAddress socketAddress24 = proxy16.address();
        java.net.Proxy proxy25 = new java.net.Proxy(type11, socketAddress24);
        java.net.Proxy proxy26 = new java.net.Proxy(type5, socketAddress24);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter27 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter27.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter27.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter27.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter27.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient32 = serializedObjectSupporter27.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy33 = serializedObjectSupporter27.deserializeObjectProxy7();
        java.net.SocketAddress socketAddress34 = proxy33.address();
        java.net.Proxy proxy35 = new java.net.Proxy(type5, socketAddress34);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + java.net.Proxy.Type.HTTP + "'", type5.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + java.net.Proxy.Type.HTTP + "'", type11.equals(java.net.Proxy.Type.HTTP));
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(socketAddress24);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNotNull(proxy33);
        org.junit.Assert.assertNotNull(socketAddress34);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) -1, (long) 1);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient4.copyWithDefaults();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient159();
        okHttpClient4.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter6.deserializeObjectOkHttpClient13();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection13 = okHttpClient11.open(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient6.authenticator;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy9 = serializedObjectSupporter8.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.Route[] routeArray13 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet14 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet14, routeArray13);
        okHttpClient12.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet14);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter17 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy18 = serializedObjectSupporter17.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter17.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter17.deserializeObjectOkHttpClient198();
        java.net.ProxySelector proxySelector21 = java.net.ProxySelector.getDefault();
        okHttpClient20.proxySelector = proxySelector21;
        okHttpClient12.proxySelector = proxySelector21;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient6.setProxySelector(proxySelector21);
        java.net.URI uRI25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList26 = proxySelector21.select(uRI25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(routeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(proxySelector21);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        java.lang.Class<?> wildcardClass7 = okHttpClient6.getClass();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy15 = serializedObjectSupporter0.deserializeObjectProxy7();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy15);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.CookieHandler cookieHandler5 = okHttpClient4.getCookieHandler();
        com.squareup.okhttp.OkAuthenticator okAuthenticator6 = null;
        okHttpClient4.authenticator = okAuthenticator6;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(cookieHandler5);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
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
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy12 = serializedObjectSupporter11.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter11.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter11.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter11.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter11.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter11.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter11.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter11.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter11.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter21 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy22 = serializedObjectSupporter21.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter21.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter21.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter21.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = serializedObjectSupporter21.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient27 = serializedObjectSupporter21.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter28 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy29 = serializedObjectSupporter28.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter28.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter28.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy32 = serializedObjectSupporter28.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient33 = serializedObjectSupporter28.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter28.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient35 = okHttpClient34.copyWithDefaults();
        com.squareup.okhttp.Route[] routeArray36 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet37 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet37, routeArray36);
        okHttpClient35.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet37);
        javax.net.ssl.HostnameVerifier hostnameVerifier40 = okHttpClient35.getHostnameVerifier();
        okHttpClient27.hostnameVerifier = hostnameVerifier40;
        com.squareup.okhttp.OkHttpClient okHttpClient42 = okHttpClient20.setHostnameVerifier(hostnameVerifier40);
        com.squareup.okhttp.OkHttpClient okHttpClient43 = okHttpClient10.setHostnameVerifier(hostnameVerifier40);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(okHttpClient35);
        org.junit.Assert.assertNotNull(routeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(hostnameVerifier40);
        org.junit.Assert.assertNotNull(okHttpClient42);
        org.junit.Assert.assertNotNull(okHttpClient43);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        boolean boolean7 = okHttpClient6.getFollowProtocolRedirects();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient6.setFollowProtocolRedirects(true);
        boolean boolean10 = okHttpClient9.followProtocolRedirects;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = okHttpClient11.copyWithDefaults();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient4.copyWithDefaults();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy7 = serializedObjectSupporter6.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter6.deserializeObjectOkHttpClient159();
        okHttpClient4.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter6.deserializeObjectOkHttpClient13();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter6.deserializeObjectOkHttpClient179();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy4();
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
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 100, (long) '4');
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 1, 10L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.getAuthenticator();
        com.squareup.okhttp.OkAuthenticator okAuthenticator12 = okHttpClient10.getAuthenticator();
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
        org.junit.Assert.assertNull(okAuthenticator11);
        org.junit.Assert.assertNull(okAuthenticator12);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient5.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient251();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        java.net.CookieHandler cookieHandler8 = null;
        okHttpClient7.cookieHandler = cookieHandler8;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
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
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        boolean boolean7 = okHttpClient6.followProtocolRedirects;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy6 = serializedObjectSupporter5.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter5.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter5.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter5.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter5.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy12 = serializedObjectSupporter5.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter5.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy14 = serializedObjectSupporter5.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter5.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter5.deserializeObjectOkHttpClient116();
        java.net.ProxySelector proxySelector17 = java.net.ProxySelector.getDefault();
        okHttpClient16.proxySelector = proxySelector17;
        com.squareup.okhttp.OkHttpClient okHttpClient19 = okHttpClient4.setProxySelector(proxySelector17);
        java.net.URI uRI20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList21 = proxySelector17.select(uRI20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URI can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(proxySelector17);
        org.junit.Assert.assertNotNull(okHttpClient19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy9 = serializedObjectSupporter8.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter8.deserializeObjectOkHttpClient239();
        okHttpClient7.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy4();
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 1, (long) (short) 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.ConnectionPool connectionPool6 = okHttpClient5.getConnectionPool();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient5.getAuthenticator();
        javax.net.ssl.HostnameVerifier hostnameVerifier8 = okHttpClient5.hostnameVerifier;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(connectionPool6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNull(hostnameVerifier8);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy6 = serializedObjectSupporter5.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter5.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter5.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter5.deserializeObjectOkHttpClient117();
        boolean boolean11 = proxy4.equals((java.lang.Object) serializedObjectSupporter5);
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter5.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter5.deserializeObjectOkHttpClient197();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectList3();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy10 = serializedObjectSupporter9.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient120();
        java.net.CookieHandler cookieHandler13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setCookieHandler(cookieHandler13);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter15 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy16 = serializedObjectSupporter15.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter15.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter15.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy19 = serializedObjectSupporter15.deserializeObjectProxy3();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter20 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy21 = serializedObjectSupporter20.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter20.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter20.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter20.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter20.deserializeObjectOkHttpClient117();
        boolean boolean26 = proxy19.equals((java.lang.Object) serializedObjectSupporter20);
        com.squareup.okhttp.OkHttpClient okHttpClient27 = okHttpClient12.setProxy(proxy19);
        com.squareup.okhttp.OkHttpClient okHttpClient28 = okHttpClient8.setProxy(proxy19);
        com.squareup.okhttp.OkAuthenticator okAuthenticator29 = okHttpClient8.authenticator;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(proxy21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNull(okAuthenticator29);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
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
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        java.net.ResponseCache responseCache13 = okHttpClient12.getResponseCache();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNull(responseCache13);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy10 = serializedObjectSupporter9.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter9.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter9.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter9.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter9.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter9.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter9.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter9.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy20 = serializedObjectSupporter9.deserializeObjectProxy7();
        java.net.Proxy.Type type21 = proxy20.type();
        okHttpClient8.proxy = proxy20;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(proxy20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + java.net.Proxy.Type.HTTP + "'", type21.equals(java.net.Proxy.Type.HTTP));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient134();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy8 = serializedObjectSupporter7.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy11 = serializedObjectSupporter7.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient13.copyWithDefaults();
        com.squareup.okhttp.Route[] routeArray15 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet16 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet16, routeArray15);
        okHttpClient14.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet16);
        javax.net.ssl.HostnameVerifier hostnameVerifier19 = okHttpClient14.getHostnameVerifier();
        okHttpClient6.hostnameVerifier = hostnameVerifier19;
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache21 = okHttpClient6.okResponseCache();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(routeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(hostnameVerifier19);
        org.junit.Assert.assertNull(okResponseCache21);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter9.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter9.deserializeObjectOkHttpClient117();
        java.util.Set<com.squareup.okhttp.Route> routeSet14 = okHttpClient13.failedRoutes;
        okHttpClient8.setfailedRoutes(routeSet14);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(routeSet14);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket("HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45175", 1);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45175");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.Socket socket4 = socketFactory0.createSocket();
        java.net.Socket socket5 = socketFactory0.createSocket();
        java.net.Socket socket6 = socketFactory0.createSocket();
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket9 = socketFactory0.createSocket("HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45413", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45413");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket4);
        org.junit.Assert.assertEquals(socket4.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket5);
        org.junit.Assert.assertEquals(socket5.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket6);
        org.junit.Assert.assertEquals(socket6.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(1, (long) (byte) 10);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient116();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient10.copyWithDefaults();
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient242();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient107();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory11 = okHttpClient10.sslSocketFactory;
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
        org.junit.Assert.assertNull(sSLSocketFactory11);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.ConnectionPool connectionPool4 = okHttpClient3.getConnectionPool();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNull(connectionPool4);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy8();
        java.lang.String str10 = proxy9.toString();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45175" + "'", str10, "HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:45175");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        java.net.ResponseCache responseCache6 = okHttpClient5.responseCache;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(responseCache6);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
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
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient164();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.SocketAddress socketAddress7 = proxy6.address();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy9 = serializedObjectSupporter8.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy11 = serializedObjectSupporter8.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter8.deserializeObjectOkHttpClient224();
        boolean boolean14 = proxy6.equals((java.lang.Object) okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(socketAddress7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) -1, (long) 100);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) ' ', (long) 100);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter5.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient219();
        boolean boolean8 = proxy4.equals((java.lang.Object) serializedObjectSupporter5);
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter5.deserializeObjectOkHttpClient139();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, (int) ' ', inetAddress4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection7 = okHttpClient5.open(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        java.net.ResponseCache responseCache10 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient11 = okHttpClient9.setResponseCache(responseCache10);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter2 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy3 = serializedObjectSupporter2.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter2.deserializeObjectOkHttpClient137();
        boolean boolean5 = proxy1.equals((java.lang.Object) serializedObjectSupporter2);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter2.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter2.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter2.deserializeObjectOkHttpClient191();
        java.net.ProxySelector proxySelector9 = okHttpClient8.proxySelector;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(proxySelector9);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient21();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkAuthenticator okAuthenticator10 = okHttpClient9.authenticator;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(okAuthenticator10);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress10 = proxy9.address();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(socketAddress10);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        java.util.Set<com.squareup.okhttp.Route> routeSet5 = okHttpClient4.failedRoutes;
        javax.net.ssl.HostnameVerifier hostnameVerifier6 = okHttpClient4.hostnameVerifier;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(routeSet5);
        org.junit.Assert.assertNull(hostnameVerifier6);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectList3();
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
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy2();
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
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("hi!", (int) '#', inetAddress5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        java.net.ResponseCache responseCache4 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient3.setResponseCache(responseCache4);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy7();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient166();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
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
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy5();
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 1, 100L);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter3 = okHttpClient2.serializedObjectSupporter;
        java.net.Proxy proxy4 = okHttpClient2.proxy;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy6 = serializedObjectSupporter5.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter5.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy9 = serializedObjectSupporter5.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter5.deserializeObjectOkHttpClient71();
        java.util.Set<com.squareup.okhttp.Route> routeSet11 = okHttpClient10.getfailedRoutes();
        okHttpClient2.failedRoutes = routeSet11;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNull(proxy4);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(routeSet11);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient201();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient9.copyWithDefaults();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.ConnectionPool connectionPool8 = okHttpClient7.connectionPool;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNull(connectionPool8);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
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
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.Route[] routeArray5 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet6 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet6, routeArray5);
        okHttpClient4.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet6);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter9 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy10 = serializedObjectSupporter9.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter9.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter9.deserializeObjectOkHttpClient198();
        java.net.ProxySelector proxySelector13 = java.net.ProxySelector.getDefault();
        okHttpClient12.proxySelector = proxySelector13;
        okHttpClient4.proxySelector = proxySelector13;
        java.net.ProxySelector.setDefault(proxySelector13);
        java.net.URI uRI17 = null;
        java.net.SocketAddress socketAddress18 = null;
        java.io.IOException iOException19 = null;
        // The following exception was thrown during execution in test generation
        try {
            proxySelector13.connectFailed(uRI17, socketAddress18, iOException19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Arguments can't be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(routeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(proxy10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxySelector13);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
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
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection14 = okHttpClient12.open(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy8 = serializedObjectSupporter7.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient146();
        okHttpClient13.followProtocolRedirects = false;
        java.util.Set<com.squareup.okhttp.Route> routeSet16 = okHttpClient13.failedRoutes;
        okHttpClient6.setfailedRoutes(routeSet16);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(routeSet16);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient217();
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
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
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        java.net.Proxy proxy14 = serializedObjectSupporter0.deserializeObjectProxy10();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(proxy14);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(proxy11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(100, (long) (byte) 100);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient90();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        java.lang.Class<?> wildcardClass11 = okHttpClient10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress2 = null;
        java.net.InetAddress inetAddress4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket6 = socketFactory0.createSocket(inetAddress2, 0, inetAddress4, 100);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient11();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient85();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
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
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient110();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache11 = okHttpClient10.okResponseCache();
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
        org.junit.Assert.assertNull(okResponseCache11);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(0, (long) (short) 0);
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient108();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient142();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
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
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 10, (long) '#');
        connectionPool2.evictAll();
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy6();
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
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(1, (long) (-1));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient43();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory6 = okHttpClient5.sslSocketFactory;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(sSLSocketFactory6);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
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
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter7 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy8 = serializedObjectSupporter7.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter7.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter7.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter7.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter7.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter7.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy14 = serializedObjectSupporter7.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter7.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy16 = serializedObjectSupporter7.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter7.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter7.deserializeObjectOkHttpClient116();
        java.net.ProxySelector proxySelector19 = java.net.ProxySelector.getDefault();
        okHttpClient18.proxySelector = proxySelector19;
        okHttpClient6.proxySelector = proxySelector19;
        java.net.URI uRI22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.net.Proxy> proxyList23 = proxySelector19.select(uRI22);
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
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(proxy16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(proxySelector19);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy5();
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
        org.junit.Assert.assertNotNull(proxy11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        java.net.ProxySelector proxySelector7 = okHttpClient6.proxySelector;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxySelector7);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        java.net.ResponseCache responseCache7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setResponseCache(responseCache7);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient209();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkAuthenticator okAuthenticator11 = okHttpClient10.authenticator;
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
        org.junit.Assert.assertNull(okAuthenticator11);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient188();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter2 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy3 = serializedObjectSupporter2.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter2.deserializeObjectOkHttpClient137();
        boolean boolean5 = proxy1.equals((java.lang.Object) serializedObjectSupporter2);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter2.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter2.deserializeObjectOkHttpClient248();
        okHttpClient7.followProtocolRedirects = false;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient227();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy7();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(proxy12);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy2();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) 'a', (long) (short) -1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient93();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
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
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket("HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:43383", 0, inetAddress5, 1);
            org.junit.Assert.fail("Expected exception of type java.net.BindException; message: Permission denied (Bind failed)");
        } catch (java.net.BindException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter8.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter8.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter14 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy15 = serializedObjectSupporter14.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter14.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter14.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter14.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter14.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter14.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter14.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter14.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter14.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter24 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy25 = serializedObjectSupporter24.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = serializedObjectSupporter24.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient27 = serializedObjectSupporter24.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter24.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter24.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter24.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter31 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy32 = serializedObjectSupporter31.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient33 = serializedObjectSupporter31.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient34 = serializedObjectSupporter31.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy35 = serializedObjectSupporter31.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter31.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient37 = serializedObjectSupporter31.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient38 = okHttpClient37.copyWithDefaults();
        com.squareup.okhttp.Route[] routeArray39 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet40 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet40, routeArray39);
        okHttpClient38.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet40);
        javax.net.ssl.HostnameVerifier hostnameVerifier43 = okHttpClient38.getHostnameVerifier();
        okHttpClient30.hostnameVerifier = hostnameVerifier43;
        com.squareup.okhttp.OkHttpClient okHttpClient45 = okHttpClient23.setHostnameVerifier(hostnameVerifier43);
        com.squareup.okhttp.OkHttpClient okHttpClient46 = okHttpClient13.setHostnameVerifier(hostnameVerifier43);
        okHttpClient7.hostnameVerifier = hostnameVerifier43;
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(proxy15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(proxy25);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(proxy32);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(okHttpClient34);
        org.junit.Assert.assertNotNull(proxy35);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(okHttpClient37);
        org.junit.Assert.assertNotNull(okHttpClient38);
        org.junit.Assert.assertNotNull(routeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(hostnameVerifier43);
        org.junit.Assert.assertNotNull(okHttpClient45);
        org.junit.Assert.assertNotNull(okHttpClient46);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) '4');
        connectionPool2.evictAll();
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
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
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, (long) '#');
        com.squareup.okhttp.Address address3 = null;
        com.squareup.okhttp.Connection connection4 = connectionPool2.get(address3);
        org.junit.Assert.assertNull(connection4);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient146();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        java.net.ResponseCache responseCache8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setResponseCache(responseCache8);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient141();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient167();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient200();
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient32();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter2 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy3 = serializedObjectSupporter2.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter2.deserializeObjectOkHttpClient137();
        boolean boolean5 = proxy1.equals((java.lang.Object) serializedObjectSupporter2);
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter2.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter2.deserializeObjectOkHttpClient205();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory8 = null;
        okHttpClient7.sslSocketFactory = sSLSocketFactory8;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient97();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter5 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy6 = serializedObjectSupporter5.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter5.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter5.deserializeObjectOkHttpClient120();
        java.net.CookieHandler cookieHandler9 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient10 = okHttpClient8.setCookieHandler(cookieHandler9);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter11.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter11.deserializeObjectOkHttpClient184();
        java.util.Set<com.squareup.okhttp.Route> routeSet14 = okHttpClient13.failedRoutes;
        okHttpClient8.failedRoutes = routeSet14;
        okHttpClient4.setfailedRoutes(routeSet14);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(routeSet14);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient145();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.internal.http.OkResponseCache okResponseCache14 = okHttpClient13.okResponseCache();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNull(okResponseCache14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
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
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient147();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
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
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient161();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
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
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient239();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 10, (long) (short) 0);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((-1), (long) '#');
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        java.util.Set<com.squareup.okhttp.Route> routeSet8 = okHttpClient7.getfailedRoutes();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(routeSet8);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.Proxy.Type type4 = proxy3.type();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.net.Proxy.Type.HTTP + "'", type4.equals(java.net.Proxy.Type.HTTP));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient9();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient124();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient208();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$UnmodifiableRandomAccessList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = okHttpClient4.copyWithDefaults();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        okHttpClient12.followProtocolRedirects = true;
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient202();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter11 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter11.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter11.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter11.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter11.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter11.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter11.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter18 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy19 = serializedObjectSupporter18.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter18.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient21 = serializedObjectSupporter18.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient22 = serializedObjectSupporter18.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter18.deserializeObjectOkHttpClient35();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter18.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter25 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy26 = serializedObjectSupporter25.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient27 = serializedObjectSupporter25.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient28 = serializedObjectSupporter25.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy29 = serializedObjectSupporter25.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter25.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter25.deserializeObjectOkHttpClient39();
        com.squareup.okhttp.OkHttpClient okHttpClient32 = okHttpClient31.copyWithDefaults();
        com.squareup.okhttp.Route[] routeArray33 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet34 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet34, routeArray33);
        okHttpClient32.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet34);
        javax.net.ssl.HostnameVerifier hostnameVerifier37 = okHttpClient32.getHostnameVerifier();
        okHttpClient24.hostnameVerifier = hostnameVerifier37;
        com.squareup.okhttp.OkHttpClient okHttpClient39 = okHttpClient17.setHostnameVerifier(hostnameVerifier37);
        com.squareup.okhttp.OkHttpClient okHttpClient40 = okHttpClient10.setHostnameVerifier(hostnameVerifier37);
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(okHttpClient21);
        org.junit.Assert.assertNotNull(okHttpClient22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(proxy26);
        org.junit.Assert.assertNotNull(okHttpClient27);
        org.junit.Assert.assertNotNull(okHttpClient28);
        org.junit.Assert.assertNotNull(proxy29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNotNull(routeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(hostnameVerifier37);
        org.junit.Assert.assertNotNull(okHttpClient39);
        org.junit.Assert.assertNotNull(okHttpClient40);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((-1), (long) (byte) 0);
        com.squareup.okhttp.Address address3 = null;
        com.squareup.okhttp.Connection connection4 = connectionPool2.get(address3);
        org.junit.Assert.assertNull(connection4);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient240();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
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
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient117();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
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
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient245();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient88();
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
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.ConnectionPool connectionPool7 = okHttpClient6.getConnectionPool();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(connectionPool7);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient169();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket5 = socketFactory0.createSocket(inetAddress3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.net.ConnectException; message: Connection refused (Connection refused)");
        } catch (java.net.ConnectException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient62();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient87();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient12();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient10();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient112();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient152();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient243();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy6();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient220();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient143();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient121();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = okHttpClient9.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient83();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkAuthenticator okAuthenticator7 = okHttpClient6.authenticator;
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy9 = serializedObjectSupporter8.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.Route[] routeArray13 = new com.squareup.okhttp.Route[] {};
        java.util.LinkedHashSet<com.squareup.okhttp.Route> routeSet14 = new java.util.LinkedHashSet<com.squareup.okhttp.Route>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.squareup.okhttp.Route>) routeSet14, routeArray13);
        okHttpClient12.setfailedRoutes((java.util.Set<com.squareup.okhttp.Route>) routeSet14);
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter17 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy18 = serializedObjectSupporter17.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient19 = serializedObjectSupporter17.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = serializedObjectSupporter17.deserializeObjectOkHttpClient198();
        java.net.ProxySelector proxySelector21 = java.net.ProxySelector.getDefault();
        okHttpClient20.proxySelector = proxySelector21;
        okHttpClient12.proxySelector = proxySelector21;
        com.squareup.okhttp.OkHttpClient okHttpClient24 = okHttpClient6.setProxySelector(proxySelector21);
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection26 = okHttpClient24.open(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(okAuthenticator7);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(routeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(proxy18);
        org.junit.Assert.assertNotNull(okHttpClient19);
        org.junit.Assert.assertNotNull(okHttpClient20);
        org.junit.Assert.assertNotNull(proxySelector21);
        org.junit.Assert.assertNotNull(okHttpClient24);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient105();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient206();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient58();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        java.net.Proxy proxy7 = okHttpClient6.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(proxy7);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient55();
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (byte) 100, (-1L));
        int int3 = connectionPool2.getHttpConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter6.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter6.deserializeObjectOkHttpClient127();
        java.net.Proxy proxy9 = serializedObjectSupporter6.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter6.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter6.deserializeObjectOkHttpClient49();
        okHttpClient5.serializedObjectSupporter = serializedObjectSupporter6;
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter6.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter6.deserializeObjectOkHttpClient115();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient57();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        java.net.ResponseCache responseCache13 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient14 = okHttpClient12.setResponseCache(responseCache13);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient16();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.Socket socket3 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket8 = socketFactory0.createSocket("HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:43383", (int) (byte) 0, inetAddress6, 0);
            org.junit.Assert.fail("Expected exception of type java.net.UnknownHostException; message: HTTP @ inesserver1.windows.cin.ufpe.br/172.20.26.2:43383");
        } catch (java.net.UnknownHostException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(socketFactory0);
        org.junit.Assert.assertNotNull(socket1);
        org.junit.Assert.assertEquals(socket1.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket2);
        org.junit.Assert.assertEquals(socket2.toString(), "Socket[unconnected]");
        org.junit.Assert.assertNotNull(socket3);
        org.junit.Assert.assertEquals(socket3.toString(), "Socket[unconnected]");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient252();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient47();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient5();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient158();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient115();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy5();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient160();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient170();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) -1, 10L);
        int int3 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter6 = okHttpClient5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient123();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient216();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy4();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        java.net.Proxy proxy8 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        java.net.Proxy proxy10 = serializedObjectSupporter0.deserializeObjectProxy3();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(proxy8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(proxy10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient215();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        java.net.ResponseCache responseCache7 = okHttpClient6.responseCache;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient162();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient250();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient190();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient137();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient25();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient210();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient249();
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient126();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient3();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy7();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy4();
        java.net.SocketAddress socketAddress14 = proxy13.address();
        org.junit.Assert.assertNotNull(proxy1);
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
        org.junit.Assert.assertNotNull(proxy12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNull(socketAddress14);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.CookieHandler cookieHandler9 = okHttpClient8.cookieHandler;
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNull(cookieHandler9);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient254();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient118();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient98();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient20();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient106();
        javax.net.ssl.HostnameVerifier hostnameVerifier11 = okHttpClient10.hostnameVerifier;
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
        org.junit.Assert.assertNull(hostnameVerifier11);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient56();
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient133();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient54();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient119();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient28();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNotNull(okHttpClient10);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient18();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = okHttpClient6.copyWithDefaults();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient29();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient236();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient212();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient148();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) (byte) -1);
        int int3 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient23();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient260();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = okHttpClient9.getHostnameVerifier();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(proxy4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier10);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient114();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient248();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient42();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient27();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient197();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient171();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient187();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient184();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient113();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        java.net.Proxy proxy13 = serializedObjectSupporter0.deserializeObjectProxy9();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter0.deserializeObjectOkHttpClient173();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        java.lang.Class<?> wildcardClass19 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(proxy13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        java.net.Proxy proxy3 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient34();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient199();
        javax.net.ssl.HostnameVerifier hostnameVerifier7 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient8 = okHttpClient6.setHostnameVerifier(hostnameVerifier7);
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(proxy3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient8);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient109();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient198();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient111();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient165();
        org.junit.Assert.assertNotNull(proxy1);
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient172();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }
}

