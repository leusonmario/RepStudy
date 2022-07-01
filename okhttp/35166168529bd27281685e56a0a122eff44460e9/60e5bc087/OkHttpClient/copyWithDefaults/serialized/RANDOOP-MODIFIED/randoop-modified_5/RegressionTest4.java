import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        javax.net.SocketFactory socketFactory0 = javax.net.ssl.SSLSocketFactory.getDefault();
        java.net.Socket socket1 = socketFactory0.createSocket();
        java.net.Socket socket2 = socketFactory0.createSocket();
        java.net.InetAddress inetAddress3 = null;
        java.net.InetAddress inetAddress5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.Socket socket7 = socketFactory0.createSocket(inetAddress3, (int) (byte) 1, inetAddress5, (int) (short) 100);
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
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
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
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        java.net.Proxy proxy17 = serializedObjectSupporter6.deserializeObjectProxy10();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter6.deserializeObjectOkHttpClient157();
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
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertNotNull(okHttpClient18);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient26();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient4();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient178();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient157();
        java.net.Proxy proxy5 = okHttpClient4.getProxy();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNull(proxy5);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient52();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient151();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient127();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter10.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter10.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter10.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter10.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter10.deserializeObjectOkHttpClient233();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter10.deserializeObjectOkHttpClient131();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter10.deserializeObjectOkHttpClient114();
        java.util.List<java.lang.String> strList18 = okHttpClient17.getDEFAULT_TRANSPORTS();
        okHttpClient9.transports = strList18;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
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
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient255();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient228();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient241();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter11.deserializeObjectOkHttpClient134();
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
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient19.copyWithDefaults();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter21 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy22 = serializedObjectSupporter21.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient23 = serializedObjectSupporter21.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient24 = serializedObjectSupporter21.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient25 = serializedObjectSupporter21.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient26 = serializedObjectSupporter21.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter27 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy28 = serializedObjectSupporter27.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient29 = serializedObjectSupporter27.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient30 = serializedObjectSupporter27.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient31 = serializedObjectSupporter27.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient32 = serializedObjectSupporter27.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient33 = serializedObjectSupporter27.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter34 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient35 = serializedObjectSupporter34.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient36 = serializedObjectSupporter34.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient37 = serializedObjectSupporter34.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient38 = serializedObjectSupporter34.deserializeObjectOkHttpClient195();
        com.squareup.okhttp.OkHttpClient okHttpClient39 = serializedObjectSupporter34.deserializeObjectOkHttpClient9();
        com.squareup.okhttp.OkHttpClient okHttpClient40 = serializedObjectSupporter34.deserializeObjectOkHttpClient177();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter41 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy42 = serializedObjectSupporter41.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient43 = serializedObjectSupporter41.deserializeObjectOkHttpClient49();
        com.squareup.okhttp.OkHttpClient okHttpClient44 = serializedObjectSupporter41.deserializeObjectOkHttpClient157();
        com.squareup.okhttp.OkHttpClient okHttpClient45 = okHttpClient44.copyWithDefaults();
        com.squareup.okhttp.OkAuthenticator okAuthenticator46 = okHttpClient45.authenticator;
        com.squareup.okhttp.OkHttpClient okHttpClient47 = okHttpClient40.setAuthenticator(okAuthenticator46);
        com.squareup.okhttp.OkHttpClient okHttpClient48 = okHttpClient33.setAuthenticator(okAuthenticator46);
        com.squareup.okhttp.OkHttpClient okHttpClient49 = okHttpClient26.setAuthenticator(okAuthenticator46);
        okHttpClient20.authenticator = okAuthenticator46;
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
        org.junit.Assert.assertNotNull(proxy22);
        org.junit.Assert.assertNotNull(okHttpClient23);
        org.junit.Assert.assertNotNull(okHttpClient24);
        org.junit.Assert.assertNotNull(okHttpClient25);
        org.junit.Assert.assertNotNull(okHttpClient26);
        org.junit.Assert.assertNotNull(proxy28);
        org.junit.Assert.assertNotNull(okHttpClient29);
        org.junit.Assert.assertNotNull(okHttpClient30);
        org.junit.Assert.assertNotNull(okHttpClient31);
        org.junit.Assert.assertNotNull(okHttpClient32);
        org.junit.Assert.assertNotNull(okHttpClient33);
        org.junit.Assert.assertNotNull(okHttpClient35);
        org.junit.Assert.assertNotNull(okHttpClient36);
        org.junit.Assert.assertNotNull(okHttpClient37);
        org.junit.Assert.assertNotNull(okHttpClient38);
        org.junit.Assert.assertNotNull(okHttpClient39);
        org.junit.Assert.assertNotNull(okHttpClient40);
        org.junit.Assert.assertNotNull(proxy42);
        org.junit.Assert.assertNotNull(okHttpClient43);
        org.junit.Assert.assertNotNull(okHttpClient44);
        org.junit.Assert.assertNotNull(okHttpClient45);
        org.junit.Assert.assertNotNull(okAuthenticator46);
        org.junit.Assert.assertNotNull(okHttpClient47);
        org.junit.Assert.assertNotNull(okHttpClient48);
        org.junit.Assert.assertNotNull(okHttpClient49);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient230();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient258();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient196();
        java.net.ResponseCache responseCache7 = okHttpClient6.getResponseCache();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(responseCache7);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient235();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (-1L));
        int int3 = connectionPool2.getSpdyConnectionCount();
        int int4 = connectionPool2.getSpdyConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient234();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient183();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = okHttpClient4.setFollowProtocolRedirects(true);
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
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
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient131();
        java.net.Proxy proxy12 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient222();
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
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient125();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient223();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient159();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient13();
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) (short) 0, (long) (byte) 10);
        int int3 = connectionPool2.getConnectionCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) 'a', (long) 0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient138();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient237();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient180();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy9();
        java.net.SocketAddress socketAddress6 = proxy5.address();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(socketAddress6);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient128();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient53();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter0.deserializeObjectOkHttpClient94();
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient230();
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
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool((int) '4', (long) 'a');
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient7();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient211();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient261();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient104();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy3();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.squareup.okhttp.ConnectionPool connectionPool2 = new com.squareup.okhttp.ConnectionPool(100, 0L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient153();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy4();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient194();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient193();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient19();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient33();
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter11.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter11.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter11.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy17 = serializedObjectSupporter11.deserializeObjectProxy5();
        java.net.SocketAddress socketAddress18 = proxy17.address();
        java.net.Proxy proxy19 = new java.net.Proxy(type10, socketAddress18);
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
        java.net.Proxy proxy75 = new java.net.Proxy(type10, socketAddress73);
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
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(proxy17);
        org.junit.Assert.assertNotNull(socketAddress18);
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
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient59();
        javax.net.ssl.HostnameVerifier hostnameVerifier10 = null;
        okHttpClient9.hostnameVerifier = hostnameVerifier10;
        javax.net.ssl.HostnameVerifier hostnameVerifier12 = okHttpClient9.getHostnameVerifier();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(okHttpClient9);
        org.junit.Assert.assertNull(hostnameVerifier12);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient247();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient176();
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient91();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient84();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient213();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient136();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient67();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient207();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient99();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient14();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient17();
        java.net.CookieHandler cookieHandler8 = null;
        com.squareup.okhttp.OkHttpClient okHttpClient9 = okHttpClient7.setCookieHandler(cookieHandler8);
        java.net.ResponseCache responseCache10 = null;
        okHttpClient9.responseCache = responseCache10;
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(okHttpClient7);
        org.junit.Assert.assertNotNull(okHttpClient9);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient224();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient61();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient204();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient8();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter8 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter8.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter8.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter8.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter8.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter8.deserializeObjectOkHttpClient163();
        java.net.Proxy proxy14 = serializedObjectSupporter8.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter8.deserializeObjectOkHttpClient237();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter8.deserializeObjectOkHttpClient129();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter8.deserializeObjectOkHttpClient196();
        com.squareup.okhttp.OkHttpClient okHttpClient18 = serializedObjectSupporter8.deserializeObjectOkHttpClient85();
        java.net.Proxy proxy19 = serializedObjectSupporter8.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient20 = okHttpClient7.setProxy(proxy19);
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
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(proxy14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(okHttpClient18);
        org.junit.Assert.assertNotNull(proxy19);
        org.junit.Assert.assertNotNull(okHttpClient20);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient257();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient181();
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        java.net.Proxy proxy6 = serializedObjectSupporter0.deserializeObjectProxy10();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient221();
        java.net.Proxy proxy9 = serializedObjectSupporter0.deserializeObjectProxy6();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient174();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient150();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(proxy6);
        org.junit.Assert.assertNotNull(proxy7);
        org.junit.Assert.assertNotNull(okHttpClient8);
        org.junit.Assert.assertNotNull(proxy9);
        org.junit.Assert.assertNotNull(okHttpClient10);
        org.junit.Assert.assertNotNull(okHttpClient11);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient60();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient168();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient120();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient218();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient68();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(okHttpClient5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNotNull(okHttpClient7);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient189();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient154();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient182();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient89();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient232();
        java.net.Proxy proxy11 = serializedObjectSupporter0.deserializeObjectProxy5();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient24();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient48();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient132();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient70();
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        java.net.Proxy proxy2 = serializedObjectSupporter0.deserializeObjectProxy2();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient246();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient51();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient253();
        org.junit.Assert.assertNotNull(okHttpClient1);
        org.junit.Assert.assertNotNull(proxy2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient203();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient191();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient256();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient238();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient39();
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient225();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient177();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient22();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient122();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient95();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient6();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient69();
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter10 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter10.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter10.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter10.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient14 = serializedObjectSupporter10.deserializeObjectOkHttpClient72();
        com.squareup.okhttp.OkHttpClient okHttpClient15 = serializedObjectSupporter10.deserializeObjectOkHttpClient94();
        com.squareup.okhttp.OkHttpClient okHttpClient16 = serializedObjectSupporter10.deserializeObjectOkHttpClient179();
        com.squareup.okhttp.OkHttpClient okHttpClient17 = serializedObjectSupporter10.deserializeObjectOkHttpClient39();
        java.util.List<java.lang.String> strList18 = okHttpClient17.getDEFAULT_TRANSPORTS();
        okHttpClient9.transports = strList18;
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
        org.junit.Assert.assertNotNull(okHttpClient14);
        org.junit.Assert.assertNotNull(okHttpClient15);
        org.junit.Assert.assertNotNull(okHttpClient16);
        org.junit.Assert.assertNotNull(okHttpClient17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        java.net.Proxy proxy1 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient135();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient229();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient192();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy8();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient155();
        javax.net.ssl.SSLSocketFactory sSLSocketFactory7 = okHttpClient6.sslSocketFactory;
        java.util.List<java.lang.String> strList8 = okHttpClient6.getTransports();
        org.junit.Assert.assertNotNull(proxy1);
        org.junit.Assert.assertNotNull(okHttpClient2);
        org.junit.Assert.assertNotNull(okHttpClient3);
        org.junit.Assert.assertNotNull(okHttpClient4);
        org.junit.Assert.assertNotNull(proxy5);
        org.junit.Assert.assertNotNull(okHttpClient6);
        org.junit.Assert.assertNull(sSLSocketFactory7);
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient214();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient185();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient231();
        com.squareup.okhttp.OkHttpClient okHttpClient4 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
        java.net.Proxy proxy5 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient50();
        java.net.Proxy proxy7 = serializedObjectSupporter0.deserializeObjectProxy3();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient144();
        com.squareup.okhttp.OkHttpClient okHttpClient9 = serializedObjectSupporter0.deserializeObjectOkHttpClient44();
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient36();
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient15();
        com.squareup.okhttp.OkHttpClient okHttpClient12 = serializedObjectSupporter0.deserializeObjectOkHttpClient156();
        com.squareup.okhttp.OkHttpClient okHttpClient13 = serializedObjectSupporter0.deserializeObjectOkHttpClient96();
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
        org.junit.Assert.assertNotNull(okHttpClient12);
        org.junit.Assert.assertNotNull(okHttpClient13);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient140();
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.squareup.okhttp.SerializedObjectSupporter serializedObjectSupporter0 = new com.squareup.okhttp.SerializedObjectSupporter();
        com.squareup.okhttp.OkHttpClient okHttpClient1 = serializedObjectSupporter0.deserializeObjectOkHttpClient259();
        com.squareup.okhttp.OkHttpClient okHttpClient2 = serializedObjectSupporter0.deserializeObjectOkHttpClient86();
        com.squareup.okhttp.OkHttpClient okHttpClient3 = serializedObjectSupporter0.deserializeObjectOkHttpClient139();
        java.net.Proxy proxy4 = serializedObjectSupporter0.deserializeObjectProxy7();
        com.squareup.okhttp.OkHttpClient okHttpClient5 = serializedObjectSupporter0.deserializeObjectOkHttpClient226();
        com.squareup.okhttp.OkHttpClient okHttpClient6 = serializedObjectSupporter0.deserializeObjectOkHttpClient92();
        com.squareup.okhttp.OkHttpClient okHttpClient7 = serializedObjectSupporter0.deserializeObjectOkHttpClient205();
        com.squareup.okhttp.OkHttpClient okHttpClient8 = serializedObjectSupporter0.deserializeObjectOkHttpClient35();
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        com.squareup.okhttp.OkHttpClient okHttpClient10 = serializedObjectSupporter0.deserializeObjectOkHttpClient71();
        com.squareup.okhttp.OkHttpClient okHttpClient11 = serializedObjectSupporter0.deserializeObjectOkHttpClient219();
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
}

