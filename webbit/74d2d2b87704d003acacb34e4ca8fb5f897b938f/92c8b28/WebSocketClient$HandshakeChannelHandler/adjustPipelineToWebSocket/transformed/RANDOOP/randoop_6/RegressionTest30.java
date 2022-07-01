import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 10, 100, 100]");
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, -1, 0, 10]");
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 0, -1, 1]");
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 0, 1, 0]");
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 10, 100, -1]");
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, -1, 100, 1]");
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 10, -1, -1]");
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 1, 10, 1]");
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 10, 10, 10]");
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 0, 10, 0]");
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 10, -1, 10]");
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, -1, 1, 100]");
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 1, 0, 100]");
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 100, 10, 10]");
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 10, 0, -1]");
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 10, 10, 100]");
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, -1, 10, -1]");
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 0, 0, 10]");
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 100, 1, -1]");
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 1, 0, 0]");
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, -1, 10, 1]");
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 0, 10, -1]");
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, -1, 0]");
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 0, 100, 10]");
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, -1, 100, 1]");
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 1, -1]");
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 1, 1, 100]");
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, -1, 10]");
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 100, 0, 0]");
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 100, 0, 0]");
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, -1, 10, 10]");
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 10, 10, 10]");
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 100, 100, 0]");
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 1, 1, -1]");
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 1, 100, -1]");
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 1, 1, 0]");
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 1, 0, 1]");
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 1, 10, 100]");
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 1, 1, -1]");
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, 0, 10]");
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 10, 10, -1]");
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 10, 1, 1]");
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 1, -1, -1]");
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 0, -1, 10]");
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 100, 100, 0]");
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, -1, 10, 100]");
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, 0, 1]");
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, -1, 1, -1]");
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 1, 100, -1]");
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, -1, -1, 100]");
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, -1, -1, 1]");
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, 1, 10]");
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 100, 0, -1]");
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 1, 10, 1]");
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 10, 0, 1]");
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 1, 1, 100]");
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, -1, 10, 1]");
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 10, 0, 10]");
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, -1, 0, -1]");
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, -1, 10, 100]");
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 1, 100, 10]");
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 100, 1, 10]");
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 10, -1, 0]");
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 1, 1, -1]");
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, -1, -1, 0]");
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 0, 1, 100]");
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 1, 10, 0]");
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, 100, -1]");
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 1, 1, 10]");
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, -1, 10, -1]");
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 100, 0, -1]");
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 1, 10, -1]");
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 0, -1, -1]");
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, 1, 100]");
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 10, 10, -1]");
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, -1, -1]");
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 0, 1]");
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, -1, 1]");
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 0, 0, 1]");
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 100, 100, 10]");
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 10, 10, 0]");
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 10, 10, 10]");
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 100, -1, 100]");
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, -1, -1, 0]");
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 0, 100, 100]");
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, -1, 100, 1]");
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 1, 100, -1]");
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 100, 10, 100]");
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, -1, 0, -1]");
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, -1, 0, 100]");
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 0, 0, 100]");
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, -1, 0, 1]");
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 10, 1, 10]");
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, -1, -1, 1]");
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 1, 100, 10]");
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 100, 0]");
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 10, 1, 100]");
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, -1, 1, -1]");
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 1, 100, 0]");
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 10, -1, -1]");
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 1, 100, 10]");
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 10, 0, -1]");
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 10, 100, 1]");
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 10, -1, -1]");
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 1, 1, 0]");
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, -1, 100, 10]");
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 0, 10, -1]");
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, -1, 100, 1]");
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 1, -1, 10]");
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 0, 1, 100]");
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 1, 0, -1]");
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 1, 1, 10]");
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, -1, -1]");
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 100, 100, 10]");
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 10, -1, -1]");
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, -1, 10, 0]");
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 10, 0, 10]");
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 0, -1, -1]");
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 1, -1, 1]");
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 1, 10, 10]");
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 0, 100, 10]");
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 0, 100, 100]");
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, -1, -1, -1]");
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 10, -1, 0]");
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, -1, 0, 0]");
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 0, 0, 100]");
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 100, 0, -1]");
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 100, 100, 0]");
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 100, 100]");
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, -1, 1, 100]");
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 100, 0, -1]");
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 1, 0, -1]");
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, -1, 1, 10]");
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 1, -1, 100]");
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 100, 0, 10]");
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, -1, 0, -1]");
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 10, -1, 0]");
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, -1, 0, -1]");
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 10, -1, -1]");
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 10, 10, 1]");
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 10, 0, 100]");
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 0, 1, -1]");
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 0, 10, 100]");
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, -1, 0, 10]");
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 100, -1, 100]");
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 0, 0, 1]");
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 10, 0, 100]");
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 100, 1, 0]");
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 10, -1, 100]");
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 0, 0, 10]");
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 100, 100]");
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 10, 100, 100]");
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, -1, 0, 10]");
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 0, 0, 100]");
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 0, -1, -1]");
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, 10, 0]");
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 100, 10, 0]");
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, 100, 10]");
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 100, 10, 1]");
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 10, 100, 1]");
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 10, 1]");
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 1, 100, 0]");
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 100, -1, 100]");
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, -1, 0]");
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 10, 0, -1]");
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 1, 1, 10]");
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 100, 100, -1]");
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, -1, -1, 1]");
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 100, 1, 10]");
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 1, -1]");
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 10, 100, 100]");
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 0, -1, 100]");
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 100, -1, 100]");
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 10, 0, 10]");
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 100, 0, 0]");
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, -1, 10, -1]");
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 1, 0, 100]");
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 10, 10, 10]");
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 0, -1, 100]");
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 10, 10, 100]");
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 1, 1, 0]");
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, -1, -1, -1]");
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 100, 1, -1]");
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, -1, 1, 100]");
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 0, 1, -1]");
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, 100, 100]");
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 0, 1, 10]");
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, -1, 10, 10]");
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 100, 0, 0]");
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, -1, 1, 10]");
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 10, -1, 10]");
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, 1, -1]");
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 100, 1, -1]");
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 10, 0, 1]");
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 10, -1, -1]");
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 10, 1, 100]");
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, -1, -1, -1]");
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 10, 1, 100]");
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 0, 1, 1]");
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, 0, 100]");
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 10, 1, -1]");
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 0, 0, 1]");
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 1, -1, -1]");
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, 0, 0]");
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 1, 10, 100]");
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, -1, 0, -1]");
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, 1, 10]");
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, -1, 100, 0]");
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, 0, 100]");
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 1, 1, 1]");
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, -1, 100, 0]");
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, -1, 0, -1]");
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, -1, 0, 100]");
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, -1, 0, 1]");
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 0, 1, 10]");
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 0, 0, 10]");
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, -1, 10, 10]");
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 1, -1, 10]");
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, 100, 100]");
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 10, 100, 10]");
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 10, -1, 10]");
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 0, 0, 1]");
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, -1, 100]");
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, -1, 100, 100]");
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 1, 100, 100]");
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 1, 10, 0]");
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 0, -1, -1]");
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 0, -1, 0]");
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, -1, 1, 0]");
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 100, 10, -1]");
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 100, -1, -1]");
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 1, 10, 100]");
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 1, 1, 10]");
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 1, 0, 10]");
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 0, 10, -1]");
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 0, 10, 10]");
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 100, 0, 10]");
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 100, 1, 0]");
    }

    @Test
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 1, 0, -1]");
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 10, 100, -1]");
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 100, 1, 100]");
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 10, -1, -1]");
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 10, 10, 100]");
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, -1, 1, 1]");
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 100, 100, 100]");
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, -1, -1]");
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 0, -1, 1]");
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, -1, 10, 100]");
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 100, 1, -1]");
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 10, 10, 0]");
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, 1, 10]");
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, -1, 100, 0]");
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, -1, 1, 0]");
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 1, 10, 1]");
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 1, 100, 0]");
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 100, 0, 1]");
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 100, -1, 0]");
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, 1, 10, 1]");
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 0, 100, 100]");
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 0, 100, -1]");
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 1, 1, 1]");
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 0, -1, 10]");
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 0, -1, 100]");
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 1, 100, 1]");
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 100, 10, 100]");
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 10, 0, 0]");
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 100, -1, 10]");
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, -1, 0, 10]");
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 0, 0, 1]");
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, -1, -1, 1]");
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, -1, 1, 10]");
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, 0, 10]");
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 10, 1, 0]");
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 10, 10, -1]");
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 10, -1, -1]");
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 100, 0, -1]");
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 10, 0, 0]");
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 0, -1, 1]");
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 1, 100]");
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 10, 10, 100]");
    }

    @Test
    public void test15283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15283");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 100, -1, 0]");
    }

    @Test
    public void test15284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15284");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 1, 100, 10]");
    }

    @Test
    public void test15285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15285");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 1, 10, 0]");
    }

    @Test
    public void test15286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15286");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 100, 10, 0]");
    }

    @Test
    public void test15287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15287");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, 10, 100]");
    }

    @Test
    public void test15288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15288");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, 0, -1]");
    }

    @Test
    public void test15289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15289");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 100, 1, 100]");
    }

    @Test
    public void test15290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15290");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, -1, 1, 100]");
    }

    @Test
    public void test15291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15291");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test15292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15292");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 0, 0, 1]");
    }

    @Test
    public void test15293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15293");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, 100, -1]");
    }

    @Test
    public void test15294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15294");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 10, 1, 0]");
    }

    @Test
    public void test15295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15295");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 1, -1, 0]");
    }

    @Test
    public void test15296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15296");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 0, -1]");
    }

    @Test
    public void test15297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15297");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 1, 1, 0]");
    }

    @Test
    public void test15298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15298");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 100, 10, 0]");
    }

    @Test
    public void test15299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15299");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 10, 0, 100]");
    }

    @Test
    public void test15300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15300");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 1, -1, -1]");
    }

    @Test
    public void test15301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15301");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, 1, -1, 1]");
    }

    @Test
    public void test15302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15302");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 100, 0, 10]");
    }

    @Test
    public void test15303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15303");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 1, -1, 0]");
    }

    @Test
    public void test15304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15304");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 0, 10, 100]");
    }

    @Test
    public void test15305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15305");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 0, 100, 0]");
    }

    @Test
    public void test15306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15306");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 100, 10, 0]");
    }

    @Test
    public void test15307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15307");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 1, 100, -1]");
    }

    @Test
    public void test15308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15308");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 1, 0]");
    }

    @Test
    public void test15309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15309");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 100, 0, 0]");
    }

    @Test
    public void test15310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15310");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 0, -1, 0]");
    }

    @Test
    public void test15311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15311");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 100, 0, 1]");
    }

    @Test
    public void test15312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15312");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 100, 1]");
    }

    @Test
    public void test15313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15313");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 10, 1, -1]");
    }

    @Test
    public void test15314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15314");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 10, 1]");
    }

    @Test
    public void test15315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15315");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 0, 10, 0]");
    }

    @Test
    public void test15316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15316");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 10, 0, 1]");
    }

    @Test
    public void test15317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15317");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 100, 100, 100]");
    }

    @Test
    public void test15318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15318");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 10, -1, -1]");
    }

    @Test
    public void test15319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15319");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 100, 10, 1]");
    }

    @Test
    public void test15320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15320");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 1, 0, 10]");
    }

    @Test
    public void test15321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15321");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 10, -1, 0]");
    }

    @Test
    public void test15322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15322");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 10, 10, 1]");
    }

    @Test
    public void test15323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15323");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 10, 10, 1]");
    }

    @Test
    public void test15324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15324");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 100, 100, 0]");
    }

    @Test
    public void test15325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15325");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 10, 1, 10]");
    }

    @Test
    public void test15326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15326");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 0, 1, 10]");
    }

    @Test
    public void test15327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15327");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 100, 0, -1]");
    }

    @Test
    public void test15328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15328");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 100, 100, 10]");
    }

    @Test
    public void test15329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15329");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, -1, 100, 10]");
    }

    @Test
    public void test15330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15330");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 10, 0, -1]");
    }

    @Test
    public void test15331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15331");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, 10, 1, -1]");
    }

    @Test
    public void test15332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15332");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 1, 1, 10]");
    }

    @Test
    public void test15333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15333");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 0, 10, 1]");
    }

    @Test
    public void test15334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15334");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, 10, 10]");
    }

    @Test
    public void test15335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15335");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 1, 10, 100]");
    }

    @Test
    public void test15336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15336");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 1, -1, -1]");
    }

    @Test
    public void test15337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15337");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 1, -1, 1]");
    }

    @Test
    public void test15338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15338");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 0, 10, 0]");
    }

    @Test
    public void test15339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15339");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 0, 0, 10]");
    }

    @Test
    public void test15340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15340");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 0, 10, 100]");
    }

    @Test
    public void test15341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15341");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 10, 100, 100]");
    }

    @Test
    public void test15342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15342");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, -1, 1, 10]");
    }

    @Test
    public void test15343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15343");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 10, 0, 1]");
    }

    @Test
    public void test15344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15344");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, -1, 100, 100]");
    }

    @Test
    public void test15345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15345");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 10, 0, -1]");
    }

    @Test
    public void test15346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15346");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, 1, 100, 0]");
    }

    @Test
    public void test15347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15347");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 1, -1, -1]");
    }

    @Test
    public void test15348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15348");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 10, 100, 1]");
    }

    @Test
    public void test15349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15349");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 100, 100, 100]");
    }

    @Test
    public void test15350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15350");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 100, 10, 0]");
    }

    @Test
    public void test15351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15351");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 100, -1, 10]");
    }

    @Test
    public void test15352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15352");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 0, 0, -1]");
    }

    @Test
    public void test15353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15353");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, -1, 100]");
    }

    @Test
    public void test15354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15354");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test15355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15355");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, -1, 1, 100]");
    }

    @Test
    public void test15356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15356");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, -1, -1, 1]");
    }

    @Test
    public void test15357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15357");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 0, -1, 0]");
    }

    @Test
    public void test15358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15358");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 10, 100, 0]");
    }

    @Test
    public void test15359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15359");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 10, 10, 100]");
    }

    @Test
    public void test15360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15360");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 100, 0, 1]");
    }

    @Test
    public void test15361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15361");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, -1, 0]");
    }

    @Test
    public void test15362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15362");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 0, 10, 10]");
    }

    @Test
    public void test15363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15363");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 100, 1, 10]");
    }

    @Test
    public void test15364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15364");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 0, 1, 1]");
    }

    @Test
    public void test15365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15365");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 100, 10, 0]");
    }

    @Test
    public void test15366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15366");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, -1, 100, 0]");
    }

    @Test
    public void test15367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15367");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 100, 100, 1]");
    }

    @Test
    public void test15368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15368");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 0, 100, 10]");
    }

    @Test
    public void test15369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15369");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 1, 0, 1]");
    }

    @Test
    public void test15370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15370");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 10, 0, 1]");
    }

    @Test
    public void test15371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15371");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 0, 10, 0]");
    }

    @Test
    public void test15372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15372");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 10, 1, -1]");
    }

    @Test
    public void test15373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15373");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 100, 100, 10]");
    }

    @Test
    public void test15374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15374");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 1, 100, 0]");
    }

    @Test
    public void test15375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15375");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 0, 0, -1]");
    }

    @Test
    public void test15376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15376");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 1, -1, -1]");
    }

    @Test
    public void test15377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15377");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 1, 10, 1]");
    }

    @Test
    public void test15378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15378");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 0, 1, 1]");
    }

    @Test
    public void test15379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15379");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 10, 1]");
    }

    @Test
    public void test15380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15380");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 1, 100, 10]");
    }

    @Test
    public void test15381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15381");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 1, -1, 0]");
    }

    @Test
    public void test15382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15382");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, -1, 10, 0]");
    }

    @Test
    public void test15383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15383");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, 100, 1]");
    }

    @Test
    public void test15384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15384");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 1, 100, -1]");
    }

    @Test
    public void test15385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15385");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, -1, 1, 1]");
    }

    @Test
    public void test15386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15386");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, -1, 100, -1]");
    }

    @Test
    public void test15387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15387");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, -1, 100]");
    }

    @Test
    public void test15388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15388");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 100, 10, 0]");
    }

    @Test
    public void test15389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15389");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 1, -1, -1]");
    }

    @Test
    public void test15390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15390");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 1, 0]");
    }

    @Test
    public void test15391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15391");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 100, 100, 0]");
    }

    @Test
    public void test15392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15392");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, 10, 1]");
    }

    @Test
    public void test15393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15393");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 0, 0, 100]");
    }

    @Test
    public void test15394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15394");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1, 100, 10]");
    }

    @Test
    public void test15395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15395");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 10, -1, -1]");
    }

    @Test
    public void test15396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15396");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 1, 0, 1]");
    }

    @Test
    public void test15397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15397");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 100, 0, 10]");
    }

    @Test
    public void test15398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15398");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 10, -1, -1]");
    }

    @Test
    public void test15399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15399");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 0, 10, -1]");
    }

    @Test
    public void test15400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15400");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 1, 0, -1]");
    }

    @Test
    public void test15401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15401");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test15402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15402");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 0, 0]");
    }

    @Test
    public void test15403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15403");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 0, 0, 0]");
    }

    @Test
    public void test15404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15404");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, 1, 1]");
    }

    @Test
    public void test15405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15405");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, 100, 1]");
    }

    @Test
    public void test15406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15406");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, -1, 1, 1]");
    }

    @Test
    public void test15407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15407");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 1, 0, 0]");
    }

    @Test
    public void test15408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15408");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 0, 10, 1]");
    }

    @Test
    public void test15409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15409");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, 0, 0]");
    }

    @Test
    public void test15410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15410");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 10, 0, 10]");
    }

    @Test
    public void test15411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15411");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 1, 1, 10]");
    }

    @Test
    public void test15412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15412");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 10, -1, 100]");
    }

    @Test
    public void test15413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15413");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 100, 100, 10]");
    }

    @Test
    public void test15414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15414");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 1, -1, 10]");
    }

    @Test
    public void test15415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15415");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 100, 1, -1]");
    }

    @Test
    public void test15416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15416");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 1, 10, 100]");
    }

    @Test
    public void test15417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15417");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, -1, -1, -1]");
    }

    @Test
    public void test15418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15418");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 1, -1, 100]");
    }

    @Test
    public void test15419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15419");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 100, 0, 1]");
    }

    @Test
    public void test15420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15420");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 100, 10, 1]");
    }

    @Test
    public void test15421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15421");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 0, -1, 10]");
    }

    @Test
    public void test15422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15422");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 10, 1, 1]");
    }

    @Test
    public void test15423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15423");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, -1, 10, 0]");
    }

    @Test
    public void test15424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15424");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, -1, -1, 1]");
    }

    @Test
    public void test15425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15425");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, -1, 10, 100]");
    }

    @Test
    public void test15426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15426");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 10, 10]");
    }

    @Test
    public void test15427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15427");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 100, 0, 100]");
    }

    @Test
    public void test15428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15428");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 1, 10, 10]");
    }

    @Test
    public void test15429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15429");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 0, 10, 1]");
    }

    @Test
    public void test15430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15430");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 0, 1, 100]");
    }

    @Test
    public void test15431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15431");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 100, 0, 1]");
    }

    @Test
    public void test15432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15432");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, 100, 100]");
    }

    @Test
    public void test15433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15433");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, -1, 0, 1]");
    }

    @Test
    public void test15434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15434");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 100, 0, 100]");
    }

    @Test
    public void test15435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15435");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 10, -1, 1]");
    }

    @Test
    public void test15436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15436");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 0, -1]");
    }

    @Test
    public void test15437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15437");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, -1, 1, 1]");
    }

    @Test
    public void test15438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15438");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 1, 10, 10]");
    }

    @Test
    public void test15439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15439");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, -1, -1, 1]");
    }

    @Test
    public void test15440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15440");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 1, 10, 0]");
    }

    @Test
    public void test15441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15441");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 10, 1, 10]");
    }

    @Test
    public void test15442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15442");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 1, 1, 1]");
    }

    @Test
    public void test15443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15443");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 0, 1, 100]");
    }

    @Test
    public void test15444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15444");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 10, 1, 0]");
    }

    @Test
    public void test15445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15445");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 10, 0, 1]");
    }

    @Test
    public void test15446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15446");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 1, 1, 1]");
    }

    @Test
    public void test15447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15447");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 1, -1, 100]");
    }

    @Test
    public void test15448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15448");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 0, 10, 1]");
    }

    @Test
    public void test15449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15449");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 10, 10, 1]");
    }

    @Test
    public void test15450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15450");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 10, 10, 100]");
    }

    @Test
    public void test15451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15451");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 0, 0, -1]");
    }

    @Test
    public void test15452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15452");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 100, -1, -1]");
    }

    @Test
    public void test15453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15453");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 1, 1, 10]");
    }

    @Test
    public void test15454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15454");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 10, -1, 100]");
    }

    @Test
    public void test15455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15455");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 10, 10, -1]");
    }

    @Test
    public void test15456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15456");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, 1, 10]");
    }

    @Test
    public void test15457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15457");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 1, 1, 0]");
    }

    @Test
    public void test15458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15458");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 1, 0, 0]");
    }

    @Test
    public void test15459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15459");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 1, 10, 10]");
    }

    @Test
    public void test15460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15460");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 100, 0, 1]");
    }

    @Test
    public void test15461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15461");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, -1, -1, 10]");
    }

    @Test
    public void test15462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15462");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 100, -1, -1]");
    }

    @Test
    public void test15463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15463");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 10, 100, 10]");
    }

    @Test
    public void test15464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15464");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 100, 1, 1]");
    }

    @Test
    public void test15465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15465");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, -1, 1, -1]");
    }

    @Test
    public void test15466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15466");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 100, 1, 10]");
    }

    @Test
    public void test15467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15467");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, 100, 10]");
    }

    @Test
    public void test15468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15468");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 1, -1, 0]");
    }

    @Test
    public void test15469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15469");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 100, 0, 0]");
    }

    @Test
    public void test15470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15470");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 100, 100, 100]");
    }

    @Test
    public void test15471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15471");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 0, 1, 1]");
    }

    @Test
    public void test15472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15472");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 100, 100, -1]");
    }

    @Test
    public void test15473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15473");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 0, 1, 0]");
    }

    @Test
    public void test15474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15474");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, -1, 100, 0]");
    }

    @Test
    public void test15475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15475");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 0, 1, -1]");
    }

    @Test
    public void test15476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15476");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, -1, 100, -1]");
    }

    @Test
    public void test15477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15477");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 10, 10, 10]");
    }

    @Test
    public void test15478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15478");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 0, 1, 10]");
    }

    @Test
    public void test15479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15479");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 1, 10, -1]");
    }

    @Test
    public void test15480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15480");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 10, 10, 0]");
    }

    @Test
    public void test15481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15481");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 100, -1, 100]");
    }

    @Test
    public void test15482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15482");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, 0, 10]");
    }

    @Test
    public void test15483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15483");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 100, 1, 1]");
    }

    @Test
    public void test15484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15484");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 10, 1, 0]");
    }

    @Test
    public void test15485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15485");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 100, 1, 0]");
    }

    @Test
    public void test15486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15486");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 1, 0, 1]");
    }

    @Test
    public void test15487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15487");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 1, -1, 0]");
    }

    @Test
    public void test15488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15488");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 1, 0, 0]");
    }

    @Test
    public void test15489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15489");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 10, 1, 100]");
    }

    @Test
    public void test15490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15490");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 0, 1, 10]");
    }

    @Test
    public void test15491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15491");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1, 0, 1]");
    }

    @Test
    public void test15492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15492");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 1, 1, 0]");
    }

    @Test
    public void test15493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15493");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 0, 1, 10]");
    }

    @Test
    public void test15494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15494");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 100, 10, -1]");
    }

    @Test
    public void test15495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15495");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 100, -1, 1]");
    }

    @Test
    public void test15496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15496");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 0, 1, 0]");
    }

    @Test
    public void test15497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15497");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 100, 10, -1]");
    }

    @Test
    public void test15498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15498");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, -1, 1, 10]");
    }

    @Test
    public void test15499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15499");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 100, 0, 10]");
    }

    @Test
    public void test15500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15500");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 10, 10, -1]");
    }
}

