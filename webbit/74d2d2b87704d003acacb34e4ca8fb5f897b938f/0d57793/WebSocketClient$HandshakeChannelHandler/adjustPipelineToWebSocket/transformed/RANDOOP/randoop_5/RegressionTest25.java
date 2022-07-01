import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 0, 0, 0]");
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, 10, 10]");
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, -1, 100, 1]");
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 100, 100, 10]");
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 10, 1, 10]");
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 10, 1, 0]");
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 1, -1, 0]");
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 10, 10, -1]");
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 0, 10, 10]");
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 1, 1, 1]");
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 0, 1, 10]");
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 0, -1, 1]");
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 100, 100, 100]");
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 0, 10, 100]");
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 1, 100, 0]");
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 100, -1, 0]");
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 100, 10, 10]");
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 0, 0, 1]");
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 0, 10, 0]");
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 1, 1, 10]");
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, -1, 1, -1]");
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 0, -1, 10]");
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 0, 100, 1]");
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 100, 0, -1]");
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
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
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 1, 100, 1]");
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, 100, 10]");
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 0, 10, 10]");
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, -1, 0, 0]");
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 1, 0, -1]");
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 0, 100, 10]");
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, 0, 1]");
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 1, -1, 1]");
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 0, 100, 100]");
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 10, 100, -1]");
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1, 0, 1]");
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 0, -1, 1]");
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 1, 10, 10]");
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, -1, -1, 100]");
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 10, 1]");
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 10, 10, 100]");
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, -1, 100, -1]");
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 1, 0, 10]");
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 0, -1, 0]");
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 10, 0, 10]");
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, -1, 100, 10]");
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 1, 0, 1]");
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 10, 10, 0]");
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 10, 1, 10]");
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 10, 0, 10]");
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 0, 10, 100]");
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 100, -1, 100]");
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 0, 10, 100]");
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, -1, 1, 10]");
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 10, 10, 10]");
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 100, 100, -1]");
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 0, 100, 0]");
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, -1, 1, 1]");
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, -1, 100, -1]");
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 10, 1, 100]");
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
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
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 0, -1]");
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 10, -1, 0]");
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 0, 0, 0]");
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 100, -1, 100]");
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, 10, 10]");
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, 100, 10]");
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 1, 10, 0]");
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 10, 10, 0]");
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1, 10, 1]");
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 10, 0, -1]");
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 100, 100, 100]");
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, -1, 100]");
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, -1, -1]");
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 100, 1, -1]");
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 0, 100, 1]");
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 100, 0, 100]");
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 100, -1, 10]");
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
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
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 10, 1, -1]");
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
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
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, -1, 10, 0]");
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
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
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 1, 100, -1]");
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 0, 10]");
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
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
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 0, 0, 1]");
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 10, 0, 100]");
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 1, 100, -1]");
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 1, -1, 1]");
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, 1, 1]");
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 1, 10, -1]");
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 10, 0]");
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 10, 100, 10]");
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 0, 100, -1]");
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 1, 10, 100]");
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 10, 100, 1]");
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 0, 0, 1]");
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 1, 0, 0]");
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 100, -1, 1]");
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 100, 0, 0]");
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, -1, 1, -1]");
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 10, -1, 10]");
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 10, 10, 100]");
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 100, -1]");
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 0, 1, 10]");
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, -1, -1]");
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 1, 0]");
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 0, -1, 1]");
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 0, 10, 10]");
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 10, 0, 10]");
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 0, -1, 1]");
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 0, 1, 0]");
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 10, -1, -1]");
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, 0, 10]");
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 0, 100, 1]");
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, 0, 1]");
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, -1, 0, -1]");
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 100, 1, 0]");
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 10, 100, 1]");
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 0, 0, 1]");
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 100, 10, 100]");
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 100, 10, 10]");
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 1, 100, 0]");
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 0, -1, -1]");
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 0, 100, 1]");
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 0, 0, 10]");
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 1, 1, 0]");
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 100, 100, 1]");
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 100, 1]");
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 100, 10, 10]");
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 100, 1, 10]");
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 1, 1]");
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, 10, -1]");
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 10, 10, -1]");
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 1, -1, 1]");
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 10, 10, 10]");
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 1, -1, 0]");
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 10, 100, 1]");
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
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
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 1, -1, 100]");
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, -1, 100, 1]");
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 1, 10, 1]");
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 0, 0, 10]");
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, 10, -1]");
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 1, -1, 10]");
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, -1, 0, 0]");
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, 100, 100]");
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, 1, 1, 1]");
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 0, 100, 100]");
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, -1, 10, 0]");
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 100, 1, 10]");
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 10, -1, 1]");
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, -1, 100, -1]");
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 0, 100, 100]");
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 10, 0, 1]");
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 1, -1, 100]");
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 1, 100, 1]");
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, -1, 10, 1]");
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
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
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, 100, -1]");
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 100, 100]");
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
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
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, -1, -1, -1]");
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 1, 0, 0]");
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 0, 100, 0]");
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, -1, 1, 0]");
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, -1, 100, 1]");
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 100, 10, 1]");
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 0, -1, 100]");
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, -1, 10]");
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, -1, 0]");
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 10, 1, 100]");
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, -1, -1, 10]");
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 10, 1, -1]");
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
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
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 10, -1, 100]");
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 100, -1, -1]");
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 10, 10, 1]");
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 1, 100, 0]");
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, -1, 1, 10]");
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 10, 1, -1]");
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 0, 0, 1]");
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 1, 100, 0]");
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, -1, 1, 10]");
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 0, 0, 10]");
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 100, -1, 0]");
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, -1, 10, 0]");
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 10, 0]");
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 1, 1, 100]");
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
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
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 0, 0, 10]");
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 100, -1, -1]");
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 0, -1, -1]");
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 0, 1, 0]");
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 100, 10, 10]");
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 100, -1, 10]");
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 10, 10, 0]");
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 1, 1, 1]");
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, 1, 0, 10]");
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
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
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 100, 10, 10]");
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 10, -1, 1]");
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
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
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 0, 100, 0]");
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 0, 0, 10]");
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, -1, 0, 0]");
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, -1, 10, 10]");
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10, 1, -1]");
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 1, 100, 10]");
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 1, 1, 1]");
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, -1, 10, 1]");
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 10, 100, 1]");
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 1, 10, 1]");
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, -1, 0]");
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, -1, -1, 0]");
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 0, 1, 10]");
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 10, 1, 100]");
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, -1, 1, 0]");
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 0, 0, -1]");
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 1, 10, 10]");
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, -1, 1, 1]");
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 1, 100, 1]");
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 1, 1, -1]");
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 100, 100, -1]");
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 100, 100, 1]");
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, -1, 1, 10]");
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 100, -1, 0]");
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 100, -1, -1]");
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 0, -1, 10]");
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 0, -1, 10]");
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 10, 100, 10]");
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 10, 10, 10]");
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 1, 0, 10]");
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 100, 100, -1]");
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, 0, 0]");
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, 0, 1]");
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 10, 0, 0]");
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 0, 1, -1]");
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 100, 1, 1]");
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 10, 100, -1]");
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 100, 0, 100]");
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 10, 0]");
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 1, 10]");
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 0, 10, 100]");
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, -1, 100, 100]");
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, -1, -1, -1]");
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 0, 10, 1]");
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 1, 0, 1]");
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 100, 0, -1]");
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 100, 10, 100]");
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 0, 100, -1]");
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 100, 100, 10]");
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 1, -1, 1]");
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 1, 1, 1]");
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, -1, 10, 10]");
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 1, 100, 1]");
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 1, 10, 100]");
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 0, -1, 10]");
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 100, 1, 1]");
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 1, -1, 0]");
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 0, 0, 10]");
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 0, -1, 100]");
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 10, -1, 0]");
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, -1, 1, 1]");
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 100, 100]");
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 100, 10, -1]");
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 0, -1, 100]");
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, -1, 1]");
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 1, -1, -1]");
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 1, 10, 10]");
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 100, 100, 100]");
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 100, 10, 10]");
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 1, -1, 100]");
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 1, -1, -1]");
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, -1, 10, -1]");
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 100, 0, -1]");
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
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
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 0, 10, 100]");
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 1, 10]");
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 10, 100, -1]");
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 1, 10, 100]");
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 0, 1, -1]");
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 10, 1, -1]");
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 1, -1, 10]");
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 0, 10, 1]");
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 0, 1, 10]");
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, 100, -1]");
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, 100, 10]");
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 10, 10, 1]");
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 1, 100, 0]");
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 1, 0, 10]");
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 100, -1, -1]");
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 1, -1, 10]");
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 100, 100, 100]");
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 1, 100, 10]");
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 0, 1, 100]");
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, -1, -1]");
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 0, 1, -1]");
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 10, 10]");
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 1, 1, 0]");
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, 0, 100, -1]");
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 0, 1, 0]");
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
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
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 10, -1, 100]");
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 100, 1, 0]");
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 0, -1, 0]");
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 0, 1, 10]");
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, -1, 100, 100]");
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, -1, 1, 0]");
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, -1, 0, 100]");
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 1, 1, 0]");
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 10, -1, 10]");
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 10, 1, 10]");
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, -1, 1, -1]");
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 10, -1, -1]");
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 1, 100, 0]");
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 100, 0, 1]");
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 100, 10, -1]");
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 10, 0, 10]");
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 100, 1, 1]");
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 0, 1, 100]");
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 100, 1]");
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 10, 10, -1]");
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 100, -1, 100]");
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, -1, 100]");
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 10, 100, 0]");
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, -1, 100]");
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, 0, 10]");
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 0, -1, 1]");
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 10, -1, 1]");
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 1, 0, 0]");
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, -1, 100, 1]");
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 1, 1]");
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 1, 100, 100]");
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12836");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 0, 10, 100]");
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12837");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 100, 0, -1]");
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12838");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 0, -1, 10]");
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12839");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 100, -1, -1]");
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12840");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 100, 10, 1]");
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12841");
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
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12842");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, -1, 0, 0]");
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12843");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 1, -1, 10]");
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12844");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 0, -1, 0]");
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12845");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 100, 100, 1]");
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12846");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 100, 0, 0]");
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12847");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 0, 0]");
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12848");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 1, 100, 10]");
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12849");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 1, 100]");
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12850");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 100, -1, 1]");
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12851");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 10, -1, 0]");
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12852");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 0, 10, 1]");
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12853");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 100, 0, 100]");
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12854");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, -1, 0, 0]");
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12855");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 0, 10, 1]");
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12856");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10, 100, 0]");
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12857");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, -1, 1, 100]");
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12858");
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
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12859");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 1, -1, 100]");
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12860");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 100, 10]");
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12861");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 0, -1, 0]");
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12862");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 1, 10, 1]");
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12863");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 1, 10, 1]");
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12864");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 10, 100, 1]");
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12865");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 100, 10, 100]");
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12866");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 100, 1, 100]");
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12867");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 10, 100, 10]");
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12868");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, -1, 1, -1]");
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12869");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 1, 100, -1]");
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12870");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, -1, 0]");
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12871");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 1, -1]");
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12872");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 0, -1, 10]");
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12873");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, -1, 1]");
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12874");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 10, 1, 1]");
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12875");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 10, 1, 10]");
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12876");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, -1, -1, 0]");
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12877");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, -1, 10, -1]");
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12878");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 0, 1, 100]");
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12879");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 100, 100, -1]");
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12880");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 10, 0, 100]");
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12881");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 1, 100, 1]");
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12882");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 100, 10, 1]");
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12883");
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
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12884");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, -1, 10]");
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12885");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, -1, 0]");
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12886");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 1, 1, 100]");
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12887");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 0, 0, 10]");
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12888");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 1, 0, 0]");
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12889");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, 100, 0, 100]");
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12890");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, 100, 0]");
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12891");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 10, 10, 100]");
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12892");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 1, -1, 10]");
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12893");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 10, 10, 10]");
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12894");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 1, 10, 100]");
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12895");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, 1, 100]");
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12896");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 0, 1, 1]");
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12897");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 10, -1, 1]");
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12898");
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
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12899");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 100, 0]");
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12900");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 10, -1, 10]");
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12901");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 0, 0, 100]");
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12902");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 0, 10, 1]");
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12903");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 1, -1, 10]");
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12904");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 0, -1, 10]");
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12905");
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
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12906");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12907");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, -1, 1, 0]");
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12908");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 0, 0, -1]");
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12909");
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
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12910");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 100, 0, -1]");
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12911");
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
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12912");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 100, 0, 100]");
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12913");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 1, 1, 0]");
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12914");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 100, 0, 1]");
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12915");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 10, -1, 0]");
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12916");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 1, 1, 0]");
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12917");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 1, 10, 100]");
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12918");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 10, 0, 1]");
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12919");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 100, 1, 1]");
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12920");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 10, 10]");
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12921");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, -1, 10, 0]");
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12922");
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
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12923");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 10, -1, 10]");
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12924");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, -1, -1, 100]");
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12925");
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
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12926");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, 10, 0, -1]");
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12927");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 1, 10, 100]");
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12928");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 1, 1, 1]");
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12929");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 1, -1, 0]");
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12930");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 0, -1, 10]");
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12931");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 10, 10, 1]");
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12932");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 1, 100, 1]");
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12933");
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
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12934");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 0, 100, -1]");
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12935");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, -1, 10, 0]");
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12936");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 0, 1, -1]");
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12937");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 0, -1, 100]");
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12938");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 100, 1, 0]");
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12939");
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
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12940");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 0, 1, 1]");
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12941");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 0, -1, -1]");
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12942");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 10, 1, 10]");
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12943");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 100, 10, -1]");
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12944");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, -1, 1, 10]");
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12945");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 100, 0, 0]");
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12946");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 100, 100, 100]");
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12947");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 0, 1, 0]");
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12948");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 0, 0]");
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12949");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 10, 1, 100]");
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12950");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 1, 100, -1]");
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12951");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, 1, 100]");
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12952");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 0, 10, 100]");
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12953");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 0, 1, -1]");
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12954");
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
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12955");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, -1, -1, -1]");
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12956");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, -1, -1, 0]");
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12957");
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
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12958");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 10, -1, 1]");
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12959");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 10, 1, 10]");
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12960");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, -1, 10]");
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12961");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, -1, 100]");
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12962");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 1, 10, -1]");
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12963");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 0, 0, 1]");
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12964");
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
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12965");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, -1, -1, 10]");
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12966");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 10, 0]");
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12967");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 0, -1, 10]");
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12968");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, 100, 10]");
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12969");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 1, 1]");
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12970");
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
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12971");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 10, 100, 0]");
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12972");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 0, 10, -1]");
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12973");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, -1, 10, -1]");
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12974");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 10, 1]");
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12975");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 100, 10, 0]");
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12976");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 1, 0, 1]");
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12977");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, -1, 0, 1]");
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12978");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 100, -1, 1]");
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12979");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, -1, 100, -1]");
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12980");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 100, -1, 0]");
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12981");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 0, -1, 100]");
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12982");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 1, 0, -1]");
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12983");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 1, 100, 10]");
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12984");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, -1, 100, -1]");
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12985");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, 1, 100]");
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12986");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 10, 10, 0]");
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12987");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 0, 10, 10]");
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12988");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, -1, 10, 10]");
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12989");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 100, 0, 0]");
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12990");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 1, 0, 0]");
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12991");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 0, 10, 100]");
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12992");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 1, 1, 100]");
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12993");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 10, 10, 0]");
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12994");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 1, -1, 1]");
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12995");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 1, 10, -1]");
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12996");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 10, 10, -1]");
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12997");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 10, 10, -1]");
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12998");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 100, -1, -1]");
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12999");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 0, 10, 0]");
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test13000");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, -1, -1, 10]");
    }
}

