import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 0, 10, 0]");
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
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
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 1, 100, 1]");
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 10, 10, 100]");
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, 10, 10]");
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 1, 100, 100]");
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, -1, 0]");
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 1, 1, 100]");
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 1, 0, 0]");
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 100, 0, 1]");
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 0, 0, 0]");
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 1, 10, 0]");
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, 100, 1]");
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, -1, 1, -1]");
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 0, 100, 100]");
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 0, 100, 10]");
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, -1, 100, 100]");
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, -1, -1, 1]");
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, -1, 0]");
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 1, -1, 100]");
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 100, 1]");
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 0, 10, 100]");
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 10, 10, -1]");
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 10, 1, 0]");
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 1, 100, 10]");
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, -1, 0]");
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 10, -1, -1]");
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 0, 100, 10]");
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 100, -1, -1]");
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 100, 10, 1]");
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 10, 100, 1]");
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 10, 1, 100]");
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 100, 0, 100]");
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 1, 1, 100]");
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, -1, 1, 1]");
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 100, 1, 100]");
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, -1, 10, 0]");
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 0, 0, 0]");
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 1, 100, 1]");
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 0, 1, 0]");
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 1, 100, 0]");
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, 100, -1]");
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 1, 10, 100]");
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 10, 10, -1]");
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, 1, 1]");
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 0, 100, 100]");
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 100, 10, 10]");
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 0, -1]");
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, -1, 100, 10]");
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 100, 1, -1]");
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 100, -1, 100]");
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 1, 0, 0]");
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 1, 10, 10]");
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, -1, -1, 100]");
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 1, 1, 10]");
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, -1, -1, 10]");
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 0, 1, 100]");
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, -1, 0, -1]");
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 0, -1]");
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 1, 100, 10]");
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, -1, 10, 100]");
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 1, 1, 0]");
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 10, 1, 0]");
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, -1, 10, 0]");
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 100, -1, 10]");
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 10, 0, 1]");
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 10, 100, 0]");
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 1, 100, 1]");
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 0, 0, -1]");
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 100, -1, -1]");
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 10, 100, 0]");
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 0, 100, 0]");
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 0, 10, 100]");
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 1, 10, -1]");
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 0, 100, -1]");
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 1, -1, 0]");
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 0, 1, 0]");
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, -1, 100]");
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 100, 0, -1]");
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 0, -1, -1]");
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 100, 1, 1]");
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
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
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 10, 10, 0]");
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, -1, 0, 10]");
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 100, 10]");
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 1, 100]");
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 100, 10, 1]");
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 1, 1, -1]");
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 100, 100, 0]");
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, 1, 1]");
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, -1, -1, 100]");
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, -1, 100, 1]");
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, -1, 10, 1]");
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 1, 1, 10]");
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 0, 0, -1]");
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 1, 100, 10]");
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 100, 10, 10]");
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 10, 0, -1]");
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 100, 0, 0]");
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 100, 100, 0]");
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, -1, 1, 0]");
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, -1, -1, -1]");
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 10, 0, 0]");
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 10, 0, 100]");
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, -1, 100]");
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 0, 0, 10]");
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 0, 100, 100]");
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 1, 10, 10]");
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 100, -1, 10]");
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 1, 1, 100]");
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 100, 100, 10]");
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 0, 1, 100]");
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 100, -1, 100]");
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, -1, 0]");
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 1, -1, 0]");
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 1, 10, 1]");
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 0, 100, 10]");
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
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
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, -1, 100, 10]");
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 10, 0, 0]");
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10, -1, 0]");
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 0, 10, 0]");
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 1, 1, 100]");
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 100, 10, 1]");
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 1, 100, 10]");
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 100, 1, 0]");
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 0, 0, 100]");
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 100, 10, 10]");
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 1, 100, 0]");
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 0, 1, 1]");
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 10, -1, -1]");
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, 1, 100]");
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 100, 10, 1]");
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 0, -1, 0]");
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 1, -1]");
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
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
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, 0, 1]");
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 1, 100, -1]");
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 0, 0, 0]");
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 1, 0, 10]");
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, -1, 10, 100]");
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 100, 100, 10]");
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 1, 0, 1]");
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 100, -1, 0]");
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 0, 100, 100]");
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 100, 0, 1]");
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
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
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 1, 0, 1]");
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 1, 100, -1]");
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 1, 10, 100]");
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 0, 100, 0]");
    }

    @Test
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 10, -1, 0]");
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 10, 100, 10]");
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 100, 1, 10]");
    }

    @Test
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, 1, 0]");
    }

    @Test
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 0, 10, 0]");
    }

    @Test
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 1, 1]");
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, 10, 0]");
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, 0, -1]");
    }

    @Test
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, -1, 10, 1]");
    }

    @Test
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 10, 1, 1]");
    }

    @Test
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 1, 100, 100]");
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 100, 1, 100]");
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 10, 100, 1]");
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 100, 1, 0]");
    }

    @Test
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, -1, 0, -1]");
    }

    @Test
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, -1, 0, 100]");
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 10, 1, 100]");
    }

    @Test
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, -1, -1, 100]");
    }

    @Test
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 100, 100, 100]");
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 100, 100, 0]");
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 0, 10]");
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 100, 100, 1]");
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 100, 0, 0]");
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 0, 10]");
    }

    @Test
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 100, 100, 0]");
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
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
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 0, 100, 10]");
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 10, 10, 1]");
    }

    @Test
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
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
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 1, 100, -1]");
    }

    @Test
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 0, -1, -1]");
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 0, -1, -1]");
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 10, 100, 1]");
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 10, 0, 0]");
    }

    @Test
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, 0, 100]");
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 100, -1, 0]");
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 10, 0]");
    }

    @Test
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 100, 100, 1]");
    }

    @Test
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 10, 1, -1]");
    }

    @Test
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 100, 100, -1]");
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 1, -1, 0]");
    }

    @Test
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 100, 100, 10]");
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 100, 1, 10]");
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 10, 10, 0]");
    }

    @Test
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 1, 0, 1]");
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 0, 0, 100]");
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 1, 100, 1]");
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, -1, -1]");
    }

    @Test
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 10, 1, 0]");
    }

    @Test
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 0, -1, -1]");
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 1, -1, 10]");
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, -1, 1, -1]");
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 0, 1, 10]");
    }

    @Test
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 0, 1, 10]");
    }

    @Test
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, -1, 0, 1]");
    }

    @Test
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, -1, 100, 1]");
    }

    @Test
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 1, -1, -1]");
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 10, 1, -1]");
    }

    @Test
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 10, 1, -1]");
    }

    @Test
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 100, 100, 100]");
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, -1, 1]");
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 10, 10, 1]");
    }

    @Test
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, -1, 0, 0]");
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, 0, 0]");
    }

    @Test
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 100, 100, 1]");
    }

    @Test
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 0, 100, 100]");
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 1, -1, 10]");
    }

    @Test
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, 1, 100]");
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 100, 100, 10]");
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 0, -1, 10]");
    }

    @Test
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, -1, 1, 10]");
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 100, 100, -1]");
    }

    @Test
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 1, 1, 10]");
    }

    @Test
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 1, 0, 0]");
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 10, -1, 0]");
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, -1, 0, -1]");
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 100, 100, 0]");
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10, 0, 10]");
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 0, 100, 0]");
    }

    @Test
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1, -1, 10]");
    }

    @Test
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, 100, 10]");
    }

    @Test
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 100, 100, 100]");
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, -1, -1, 0]");
    }

    @Test
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 0, 10, 0]");
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, -1, 100]");
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 0, 100, 1]");
    }

    @Test
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, -1, 0, 100]");
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 0, 0, 100]");
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, -1, 1, 0]");
    }

    @Test
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 1, -1, 100]");
    }

    @Test
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
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
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, -1, 1, 1]");
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 100, 100]");
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 0, 10, -1]");
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 0, 1, 1]");
    }

    @Test
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, 10, -1]");
    }

    @Test
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 10, 100, -1]");
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, 100, 10]");
    }

    @Test
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 10, 0, 10]");
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 0, 1, 1]");
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, -1, 100, 1]");
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 0, 10, 0]");
    }

    @Test
    public void test19254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19254");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 1, 1]");
    }

    @Test
    public void test19255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19255");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 100, 100, -1]");
    }

    @Test
    public void test19256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19256");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 0, 0, 10]");
    }

    @Test
    public void test19257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19257");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 100, 0, 100]");
    }

    @Test
    public void test19258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19258");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 1, 10, 100]");
    }

    @Test
    public void test19259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19259");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, -1, 100, 100]");
    }

    @Test
    public void test19260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19260");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 1, 0, 10]");
    }

    @Test
    public void test19261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19261");
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
    public void test19262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19262");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 100, 100, 100]");
    }

    @Test
    public void test19263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19263");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, -1, 100, -1]");
    }

    @Test
    public void test19264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19264");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 10, 1, 100]");
    }

    @Test
    public void test19265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19265");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, -1, 100, 0]");
    }

    @Test
    public void test19266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19266");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, -1, 1, 0]");
    }

    @Test
    public void test19267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19267");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, -1, -1, 100]");
    }

    @Test
    public void test19268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19268");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, -1, 1, 0]");
    }

    @Test
    public void test19269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19269");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 1, -1, -1]");
    }

    @Test
    public void test19270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19270");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, -1, -1, 10]");
    }

    @Test
    public void test19271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19271");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 10, -1, 100]");
    }

    @Test
    public void test19272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19272");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 100, 100, 0]");
    }

    @Test
    public void test19273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19273");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 100, 100, -1]");
    }

    @Test
    public void test19274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19274");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, -1, 1, 100]");
    }

    @Test
    public void test19275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19275");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 1, 100, 0]");
    }

    @Test
    public void test19276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19276");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 0, 100, 100]");
    }

    @Test
    public void test19277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19277");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 100, 1, 10]");
    }

    @Test
    public void test19278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19278");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 0, 10, 1]");
    }

    @Test
    public void test19279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19279");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, 0, 100, 10]");
    }

    @Test
    public void test19280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19280");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 1, 100, -1]");
    }

    @Test
    public void test19281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19281");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 100, 1, 0]");
    }

    @Test
    public void test19282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19282");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 10, 10, 0]");
    }

    @Test
    public void test19283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19283");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 10, 1, 1]");
    }

    @Test
    public void test19284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19284");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 10, 1, 0]");
    }

    @Test
    public void test19285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19285");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 1, 10, -1]");
    }

    @Test
    public void test19286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19286");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 10, 0, 10]");
    }

    @Test
    public void test19287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19287");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 10, -1, 0]");
    }

    @Test
    public void test19288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19288");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 10, 10]");
    }

    @Test
    public void test19289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19289");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 1, 1, -1]");
    }

    @Test
    public void test19290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19290");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 10, 100, -1]");
    }

    @Test
    public void test19291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19291");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 100, 1, 1]");
    }

    @Test
    public void test19292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19292");
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
    public void test19293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19293");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 100, 10, -1]");
    }

    @Test
    public void test19294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19294");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 1, 0, 0]");
    }

    @Test
    public void test19295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19295");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, 100, -1]");
    }

    @Test
    public void test19296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19296");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 0, -1, 10]");
    }

    @Test
    public void test19297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19297");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 10, 0, 100]");
    }

    @Test
    public void test19298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19298");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 100, 10, -1]");
    }

    @Test
    public void test19299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19299");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 0, 10, 1]");
    }

    @Test
    public void test19300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19300");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 1, 10, 100]");
    }

    @Test
    public void test19301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19301");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 1, -1, 0]");
    }

    @Test
    public void test19302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19302");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 100, 1, 100]");
    }

    @Test
    public void test19303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19303");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, -1, 10, 10]");
    }

    @Test
    public void test19304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19304");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 1, 0, 0]");
    }

    @Test
    public void test19305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19305");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, -1, 1, 1]");
    }

    @Test
    public void test19306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19306");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 100, -1, 100]");
    }

    @Test
    public void test19307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19307");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 0, 100, 100]");
    }

    @Test
    public void test19308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19308");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 1, 100, 10]");
    }

    @Test
    public void test19309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19309");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, -1, 0]");
    }

    @Test
    public void test19310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19310");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, -1, -1, 0]");
    }

    @Test
    public void test19311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19311");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, -1, 10]");
    }

    @Test
    public void test19312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19312");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 1, 100, 1]");
    }

    @Test
    public void test19313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19313");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, -1, -1, 1]");
    }

    @Test
    public void test19314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19314");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 0, -1, 0]");
    }

    @Test
    public void test19315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19315");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 1, 1, 1]");
    }

    @Test
    public void test19316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19316");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 10, 100, 0]");
    }

    @Test
    public void test19317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19317");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 100, 100, 100]");
    }

    @Test
    public void test19318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19318");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, -1, -1, -1]");
    }

    @Test
    public void test19319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19319");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 10, 0, 100]");
    }

    @Test
    public void test19320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19320");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 10, 0, -1]");
    }

    @Test
    public void test19321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19321");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, -1, 10, -1]");
    }

    @Test
    public void test19322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19322");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 10, 1, 0]");
    }

    @Test
    public void test19323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19323");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 1, 10, 0]");
    }

    @Test
    public void test19324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19324");
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
    public void test19325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19325");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, 1, 0]");
    }

    @Test
    public void test19326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19326");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 10, 0, 0]");
    }

    @Test
    public void test19327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19327");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 1, 1, 10]");
    }

    @Test
    public void test19328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19328");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 100, 100, -1]");
    }

    @Test
    public void test19329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19329");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 100, 100, -1]");
    }

    @Test
    public void test19330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19330");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 100, 0, 1]");
    }

    @Test
    public void test19331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19331");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, -1, 1, 100]");
    }

    @Test
    public void test19332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19332");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 100, 10, 0]");
    }

    @Test
    public void test19333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19333");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, -1, 100, 100]");
    }

    @Test
    public void test19334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19334");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 1, 10, 10]");
    }

    @Test
    public void test19335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19335");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, -1, 10, 1]");
    }

    @Test
    public void test19336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19336");
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
    public void test19337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19337");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 0, 100, -1]");
    }

    @Test
    public void test19338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19338");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 10, 100, 100]");
    }

    @Test
    public void test19339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19339");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 100, 10, 100]");
    }

    @Test
    public void test19340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19340");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 1, 100, 100]");
    }

    @Test
    public void test19341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19341");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, 1, 10]");
    }

    @Test
    public void test19342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19342");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 0, 1, 0]");
    }

    @Test
    public void test19343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19343");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test19344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19344");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 100, 1, 100]");
    }

    @Test
    public void test19345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19345");
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
    public void test19346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19346");
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
    public void test19347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19347");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 0, 100, 1]");
    }

    @Test
    public void test19348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19348");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 1, 0, 0]");
    }

    @Test
    public void test19349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19349");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 0, 0, 1]");
    }

    @Test
    public void test19350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19350");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 100, 10, 1]");
    }

    @Test
    public void test19351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19351");
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
    public void test19352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19352");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, 100, 0]");
    }

    @Test
    public void test19353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19353");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 10, 1, 100]");
    }

    @Test
    public void test19354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19354");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 100, 100, 10]");
    }

    @Test
    public void test19355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19355");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 0, 100, 1]");
    }

    @Test
    public void test19356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19356");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, -1, -1, 100]");
    }

    @Test
    public void test19357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19357");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 0, 10, -1]");
    }

    @Test
    public void test19358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19358");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 100, 0, 10]");
    }

    @Test
    public void test19359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19359");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 0, -1, 1]");
    }

    @Test
    public void test19360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19360");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 1, 100]");
    }

    @Test
    public void test19361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19361");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 1, 1, -1]");
    }

    @Test
    public void test19362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19362");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 0, 10, 1]");
    }

    @Test
    public void test19363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19363");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, -1, 10, -1]");
    }

    @Test
    public void test19364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19364");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, 0, 10]");
    }

    @Test
    public void test19365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19365");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 10, 0, -1]");
    }

    @Test
    public void test19366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19366");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 10, 1, 100]");
    }

    @Test
    public void test19367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19367");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 10, 100, -1]");
    }

    @Test
    public void test19368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19368");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 100, 10, -1]");
    }

    @Test
    public void test19369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19369");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, 100, 1]");
    }

    @Test
    public void test19370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19370");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, 100, 100]");
    }

    @Test
    public void test19371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19371");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 10, -1, 0]");
    }

    @Test
    public void test19372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19372");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 1, 10, 0]");
    }

    @Test
    public void test19373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19373");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 100, 1, 1]");
    }

    @Test
    public void test19374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19374");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, 1, 1]");
    }

    @Test
    public void test19375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19375");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, -1, 10, 100]");
    }

    @Test
    public void test19376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19376");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, -1, 1, 10]");
    }

    @Test
    public void test19377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19377");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 1, 10, 10]");
    }

    @Test
    public void test19378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19378");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 0, -1, 0]");
    }

    @Test
    public void test19379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19379");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 0, 10, 100]");
    }

    @Test
    public void test19380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19380");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, -1, -1, 1]");
    }

    @Test
    public void test19381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19381");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 1, 10, -1]");
    }

    @Test
    public void test19382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19382");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 1, 10, 10]");
    }

    @Test
    public void test19383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19383");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 10, 0, 0]");
    }

    @Test
    public void test19384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19384");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 1, 100, 10]");
    }

    @Test
    public void test19385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19385");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 0, -1, 100]");
    }

    @Test
    public void test19386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19386");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 0, -1, 1]");
    }

    @Test
    public void test19387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19387");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, 1, 1]");
    }

    @Test
    public void test19388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19388");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, 100, 1]");
    }

    @Test
    public void test19389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19389");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 1, 1, 100]");
    }

    @Test
    public void test19390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19390");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, -1, 100, 10]");
    }

    @Test
    public void test19391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19391");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 0, 100, -1]");
    }

    @Test
    public void test19392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19392");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, -1, 100, 0]");
    }

    @Test
    public void test19393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19393");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 100, 100, 0]");
    }

    @Test
    public void test19394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19394");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, -1, 1, 100]");
    }

    @Test
    public void test19395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19395");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, -1, -1]");
    }

    @Test
    public void test19396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19396");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 10, -1, 1]");
    }

    @Test
    public void test19397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19397");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, 0, 1]");
    }

    @Test
    public void test19398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19398");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 100, 0, 100]");
    }

    @Test
    public void test19399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19399");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, -1, 10, 10]");
    }

    @Test
    public void test19400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19400");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, -1, 1, 1]");
    }

    @Test
    public void test19401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19401");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, -1, 1, 0]");
    }

    @Test
    public void test19402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19402");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, -1, -1, -1]");
    }

    @Test
    public void test19403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19403");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, -1, 10, -1]");
    }

    @Test
    public void test19404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19404");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 10, 1, -1]");
    }

    @Test
    public void test19405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19405");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 1, 1, -1]");
    }

    @Test
    public void test19406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19406");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 1, 10, 100]");
    }

    @Test
    public void test19407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19407");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, -1, 100, -1]");
    }

    @Test
    public void test19408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19408");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 100, 100, -1]");
    }

    @Test
    public void test19409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19409");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 10, 0, 1]");
    }

    @Test
    public void test19410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19410");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, -1, 0, 10]");
    }

    @Test
    public void test19411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19411");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 10, 100, 1]");
    }

    @Test
    public void test19412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19412");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 0, -1, 1]");
    }

    @Test
    public void test19413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19413");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, -1, 1]");
    }

    @Test
    public void test19414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19414");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 10, 10, 1]");
    }

    @Test
    public void test19415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19415");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, 0, 100]");
    }

    @Test
    public void test19416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19416");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 0, 10, -1]");
    }

    @Test
    public void test19417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19417");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 1, -1, 1]");
    }

    @Test
    public void test19418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19418");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 10, -1, 0]");
    }

    @Test
    public void test19419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19419");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 10, -1, 100]");
    }

    @Test
    public void test19420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19420");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 0, 0, 10]");
    }

    @Test
    public void test19421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19421");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, 0, 0]");
    }

    @Test
    public void test19422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19422");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 0, -1, 10]");
    }

    @Test
    public void test19423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19423");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 10, -1, -1]");
    }

    @Test
    public void test19424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19424");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, -1, -1, 100]");
    }

    @Test
    public void test19425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19425");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 10, 100, 10]");
    }

    @Test
    public void test19426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19426");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 10, 100]");
    }

    @Test
    public void test19427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19427");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 10, 100, 1]");
    }

    @Test
    public void test19428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19428");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 100, 10, 10]");
    }

    @Test
    public void test19429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19429");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, -1, 100, 0]");
    }

    @Test
    public void test19430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19430");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 100, 0, 10]");
    }

    @Test
    public void test19431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19431");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 1, -1, 0]");
    }

    @Test
    public void test19432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19432");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 1, 0, 100]");
    }

    @Test
    public void test19433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19433");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 1, 100, 100]");
    }

    @Test
    public void test19434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19434");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 100, 10]");
    }

    @Test
    public void test19435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19435");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 10, -1, 100]");
    }

    @Test
    public void test19436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19436");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 10, 1, 0]");
    }

    @Test
    public void test19437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19437");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, 10, 10]");
    }

    @Test
    public void test19438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19438");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 100, -1, 1]");
    }

    @Test
    public void test19439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19439");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 1, -1, 1]");
    }

    @Test
    public void test19440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19440");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, -1, 1, 1]");
    }

    @Test
    public void test19441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19441");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, -1, 1, 10]");
    }

    @Test
    public void test19442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19442");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, 100, 1]");
    }

    @Test
    public void test19443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19443");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 100, 1, 10]");
    }

    @Test
    public void test19444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19444");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, -1, 0, 10]");
    }

    @Test
    public void test19445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19445");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 100, 0, 0]");
    }

    @Test
    public void test19446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19446");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 0, 1]");
    }

    @Test
    public void test19447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19447");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 10, 100, 1]");
    }

    @Test
    public void test19448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19448");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, -1, 100, -1]");
    }

    @Test
    public void test19449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19449");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 1, 10, 100]");
    }

    @Test
    public void test19450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19450");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 0, -1, 0]");
    }

    @Test
    public void test19451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19451");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 100, 10, -1]");
    }

    @Test
    public void test19452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19452");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 100, 10, 10]");
    }

    @Test
    public void test19453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19453");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 10, -1, 1]");
    }

    @Test
    public void test19454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19454");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 10, 1, 1]");
    }

    @Test
    public void test19455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19455");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 10, 1, 10]");
    }

    @Test
    public void test19456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19456");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 0, 100, -1]");
    }

    @Test
    public void test19457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19457");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 0, 100, 100]");
    }

    @Test
    public void test19458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19458");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 10, 100, -1]");
    }

    @Test
    public void test19459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19459");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, -1, 10, -1]");
    }

    @Test
    public void test19460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19460");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 100, 0, 1]");
    }

    @Test
    public void test19461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19461");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, 1, 0]");
    }

    @Test
    public void test19462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19462");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, 100, 1]");
    }

    @Test
    public void test19463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19463");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, 1, -1]");
    }

    @Test
    public void test19464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19464");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 10, 0, -1]");
    }

    @Test
    public void test19465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19465");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, -1, 0, 100]");
    }

    @Test
    public void test19466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19466");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 100, 0, -1]");
    }

    @Test
    public void test19467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19467");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 100, 0, 0]");
    }

    @Test
    public void test19468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19468");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 0, -1, -1]");
    }

    @Test
    public void test19469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19469");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 100, 0, 0]");
    }

    @Test
    public void test19470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19470");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 100, 1, 10]");
    }

    @Test
    public void test19471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19471");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 0, 1, 100]");
    }

    @Test
    public void test19472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19472");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, -1, 1, 1]");
    }

    @Test
    public void test19473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19473");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 1, 100, 100]");
    }

    @Test
    public void test19474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19474");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 100, -1, 100]");
    }

    @Test
    public void test19475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19475");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 10, 0, 1]");
    }

    @Test
    public void test19476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19476");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 100, 100, 10]");
    }

    @Test
    public void test19477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19477");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 0, -1, 0]");
    }

    @Test
    public void test19478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19478");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, -1, 10, 100]");
    }

    @Test
    public void test19479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19479");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 10, 1]");
    }

    @Test
    public void test19480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19480");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 100, 10, -1]");
    }

    @Test
    public void test19481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19481");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 10, 0, 1]");
    }

    @Test
    public void test19482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19482");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 100, 1, 100]");
    }

    @Test
    public void test19483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19483");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, -1, 100, 0]");
    }

    @Test
    public void test19484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19484");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 100, 100, 1]");
    }

    @Test
    public void test19485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19485");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 1, 0, -1]");
    }

    @Test
    public void test19486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19486");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 1, 10, 0]");
    }

    @Test
    public void test19487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19487");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, -1, 1]");
    }

    @Test
    public void test19488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19488");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, -1, 1, 100]");
    }

    @Test
    public void test19489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19489");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 10, -1, 10]");
    }

    @Test
    public void test19490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19490");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 0, 10, 100]");
    }

    @Test
    public void test19491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19491");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 0, 1, 100]");
    }

    @Test
    public void test19492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19492");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, -1, 1, 10]");
    }

    @Test
    public void test19493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19493");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 100, 10, 10]");
    }

    @Test
    public void test19494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19494");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, -1, 1, -1]");
    }

    @Test
    public void test19495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19495");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, -1, 1, -1]");
    }

    @Test
    public void test19496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19496");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 1, 0]");
    }

    @Test
    public void test19497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19497");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 0, 0, 10]");
    }

    @Test
    public void test19498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19498");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 0, 1, 1]");
    }

    @Test
    public void test19499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19499");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, -1, 100, 1]");
    }

    @Test
    public void test19500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19500");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, -1, -1, 10]");
    }
}

