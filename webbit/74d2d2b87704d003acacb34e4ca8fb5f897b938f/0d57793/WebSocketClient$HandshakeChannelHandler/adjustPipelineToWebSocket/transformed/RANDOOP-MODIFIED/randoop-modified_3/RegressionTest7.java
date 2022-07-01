import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
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
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 100, -1]");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 0, -1, -1]");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, -1, 0]");
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, -1, 1, 1]");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, -1, 10, 0]");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 10, 0, -1]");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 0, 10, 0]");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 100, 100, 1]");
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 1, 100, 100]");
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 0, -1]");
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 10, 0]");
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 1, 10]");
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 10, 100, 0]");
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 10, 10]");
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 0, 0, 0]");
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 10, 10]");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 0, 0, 10]");
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 1, 1]");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 100, 1, -1]");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, -1, 0, 100]");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, -1, -1]");
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 0, 0, 100]");
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 0, 10, -1]");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 10, 0]");
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 10, 1, 100]");
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 0, 10, -1]");
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, -1, 0, -1]");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 0, 0]");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 0, 10, 10]");
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, -1, 100, 1]");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, -1, -1, -1]");
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 10, 1]");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
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
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
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
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 100, -1, 100]");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 100, 1, -1]");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, 1, 100]");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 1, -1]");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 10, 0, 1]");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 100, -1]");
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 1, -1]");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 10, -1, 100]");
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 100, 100]");
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 10, 1, -1]");
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
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
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 10, 10, -1]");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, -1, 1]");
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 10, 1]");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 100, 100]");
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, -1, 0]");
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, 1, 0]");
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 10, 10]");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 0, 10]");
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 1, -1, -1]");
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 1, 10]");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, -1, 0]");
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 0, 1]");
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, 100, 1]");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 10, -1, 1]");
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 10, 10, 0]");
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, -1, 1]");
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 1, 100, 10]");
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 10, 10]");
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 0, 0, 0]");
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 100, 10, -1]");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, -1]");
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 1, -1]");
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 0, 100, -1]");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 100, 100]");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 100, 1]");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 100, -1, 10]");
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, -1, 100, 1]");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, -1, 0]");
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 10, -1, -1]");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 100, 100]");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, -1, 1, -1]");
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 1, 10]");
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 1, 10, 1]");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 0, 100, 1]");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 1, 1, 0]");
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, -1, -1]");
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, -1, -1]");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10, 1, 100]");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 0, -1, 1]");
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 10, 10, 1]");
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, -1, 100]");
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 10, -1]");
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 1, 100]");
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, -1]");
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 100, 100]");
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, -1, 0]");
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, -1, 1]");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 0, 0, 10]");
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 0, 0]");
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, 100]");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 1, 1]");
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 10, 1]");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, -1, 100]");
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 1, 0, -1]");
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 100, 10, 10]");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 0, 1]");
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, -1, 100, -1]");
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 1, 1, 1]");
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 100, 10, 0]");
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 0, 100]");
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 100, 100, -1]");
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 10, 100]");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 10, 1, 0]");
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, -1, 100, 10]");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, 0, 0]");
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 100, 100]");
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, -1, -1, 0]");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 10, 0]");
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
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
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 1, 100, 10]");
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 0, -1, 10]");
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 0, 100, 10]");
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 100, 0, 10]");
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 100, 1]");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, -1, 0, -1]");
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 1, 0, 0]");
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, -1, 1]");
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 10, 100, 100]");
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 100, 0]");
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 100, 100, 0]");
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 100, 10]");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 0, 10]");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 100, 0, 100]");
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 10, 1]");
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 0, 100, -1, -1]");
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 10, -1, 10]");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, -1, 100, -1]");
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
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
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, -1, -1, -1]");
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 10, 10]");
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, -1, -1]");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 10, 100, 0]");
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 10, 10, 10]");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 0, 0, -1]");
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 100, 1, 100]");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, -1, 1, 100]");
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
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
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 100, 1, -1]");
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, -1, 10, -1]");
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, 100, 100]");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, -1, 0, -1]");
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 1, 1, 10]");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 10, -1, 10]");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, 0, 100]");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 10, -1, 0]");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, -1, 0]");
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 100, 10, 1]");
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, -1, -1]");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, 10, -1]");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, -1, -1, 10]");
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 100, 100, 0]");
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 1, 0, 1]");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 10, -1, 1]");
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 1, -1]");
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, -1, 1]");
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, 10]");
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 0, -1, 0]");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 0, 1, 100]");
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 0, 1, 0]");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, 10, -1, 1]");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 100, 0, -1]");
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 0, 0, 0]");
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 0, 10, 100]");
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 10, 10]");
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 10, 10]");
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 100, -1, 1]");
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 1, 100]");
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 1, -1]");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 0, -1]");
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, 10, 100]");
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, -1, 10]");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 1, 0, 100]");
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 1, 1]");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 0, 1]");
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 0, 100, 10]");
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 1, -1, 10]");
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 0, 100]");
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100, 1]");
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, -1, 0, 10]");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, 100, 1]");
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 0, 100]");
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
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
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
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
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 10, -1, 100]");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, -1, 100, 100]");
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 0, 100]");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, -1, 0, -1]");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, 10, 100]");
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 10, -1]");
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 100, 10, 1]");
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 10, 100, 100]");
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 0, 1, 0]");
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 10, 10]");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 100, 100]");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, -1, 0, 100]");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, -1, 10, 10]");
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 1, -1]");
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 10, -1, 10]");
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, 0, 0]");
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 10, 1, 10]");
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, -1, 100]");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 100, 10]");
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 100, 100, 0]");
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, 1, 1]");
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 10, 0, 100]");
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
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
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 10, 1]");
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 1, 1]");
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 0, 1, -1]");
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 100, 100]");
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 100, -1, 1]");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 0, 0]");
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 10, 1]");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
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
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 100, 10, -1]");
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 100, 10, 1]");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
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
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, -1, 100]");
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 10, 10]");
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 1, -1, 1]");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, -1, 0]");
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 0, 1]");
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 100, 10, 10]");
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, 10, 0]");
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 1, 10, 10]");
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
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
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 100, -1, 10]");
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 0, 1]");
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, -1, -1, 10]");
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, 1, 0]");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 100, 100, 10]");
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 100, 100]");
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, 1, 1, 0]");
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 10, 1, 10]");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 100, 0]");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, -1, 100, -1]");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 0, 100]");
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 100, 0]");
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 100, 1, -1]");
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, -1]");
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, -1]");
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 100, 0, 10]");
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, -1, 100, -1]");
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 100, 0]");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, -1, 1, -1]");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, -1, 0, 0]");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 1, 100, 1]");
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 100, 10]");
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 0, 1]");
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 10, 0]");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, 10, 1]");
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 10, 10, 1, -1]");
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, 0, 0]");
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 0, 0, 10]");
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 100, 1]");
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, 10]");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, -1, -1]");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 100, -1, 0]");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 100, 100, -1]");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 100, -1, 10]");
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, -1, 10]");
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 0, 100, 100]");
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 100, 100]");
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 1, 100, 0]");
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 1, 10, 1]");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, -1, -1]");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 0, 0, 10]");
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 1, 0]");
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, -1, -1]");
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, 0, -1]");
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 10, 1]");
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 100, 0, 10]");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 0, 100]");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, -1, 10]");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 10, 1, -1]");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 1, 0, 100]");
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 10, -1]");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, -1, 0, 10]");
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 1, -1]");
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 0, 100]");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, 100, 100]");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 100, 100]");
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 10, 10, 10]");
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, -1, 0, 1]");
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
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
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 0, 0, 100]");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
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
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 1, 100]");
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, -1, 1, 10]");
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 0, -1, 10]");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 10, -1, 10]");
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 100, 10, 1]");
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 1, 1]");
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 1, 0]");
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, 0, 100, 100]");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, -1, 100]");
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 100, 0, 0]");
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 10, 10, 100]");
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 10, 1, -1]");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 1, 1]");
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 100, 10]");
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, -1, -1]");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 1, 100]");
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 1, -1]");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 100, -1, 100]");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, -1, 1]");
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, 0, 10]");
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 1, -1]");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 100, 0]");
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, 100, 100, 10]");
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 1, 1, 10]");
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
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
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 1, 10, 100, -1]");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 100, 1, 10]");
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, -1, 100]");
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 100, 1, -1]");
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 100, 100, 0]");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 1, 0, 10]");
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 10, 100]");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 0, 0]");
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 10, 10]");
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 100, 0, 100]");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, -1, -1, 10]");
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, 1, 1, 0]");
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, -1, 0, -1]");
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 10, -1, -1]");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 10, 100, 1]");
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 1, 100, 10]");
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 100, 1]");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 1, -1, 0]");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 10, 1]");
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 1, -1]");
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, -1, 10, 100]");
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 100, 1]");
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 0, -1]");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 10, 100]");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 1, 0, 1]");
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 0, 1, 10]");
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, -1, 1, -1]");
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 100, 100]");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 10, -1, -1]");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 10, 10]");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 1, 0]");
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 100, -1, 100]");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, -1, -1, 10]");
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, -1, 1]");
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 1, 100, 100]");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, -1, 1, 10]");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, -1, 10, -1]");
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 0, -1]");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 1, -1]");
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 100, -1, 100]");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 10, 10]");
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 10, 1]");
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 100, 1]");
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 1, 10, -1]");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 10, 0, 10]");
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
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
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 1, 100, 100]");
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 100, 1, -1]");
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, -1, 100, -1]");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 100, 1]");
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, 0, 100]");
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, 10, 1]");
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 10, 1, 100]");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 10, 100, 0]");
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 10, -1, 100]");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, 1, 100]");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 1, 0]");
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, -1, 1, 1]");
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 10, 100, -1]");
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, -1, -1, 10]");
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 100, 100, 10]");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, 10, 1]");
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, -1, 100]");
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 10, 100]");
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 1, 1]");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 0, 1, 10]");
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, -1, 1]");
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, -1, 10, -1]");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, 10, 1]");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, -1, 0]");
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 0, -1]");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 1, 10]");
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
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
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 10, -1]");
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 100, 1]");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 100, -1, 0]");
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, 1, 10]");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
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
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, 0, 100]");
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 1, 1, 10]");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, -1, 0, 10]");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 1, 10]");
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 10, -1, -1]");
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 10, 0, 0]");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 100, 0]");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, 1, -1]");
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 1, 1]");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 10, -1, 10]");
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, -1]");
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, -1, 100, 10]");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, -1, -1]");
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 100, 100]");
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, -1, 100, 10]");
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 1, 1, 1]");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 10, 1, 10]");
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 1, 10, 100]");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
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
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 1, 0, -1]");
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 1, 0, 100]");
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
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
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 1, 100, 100]");
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, -1, -1, 1]");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 0, 10, 0]");
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, -1, 0, 100]");
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, 10, 0]");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 10, 0]");
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 10, -1, 100]");
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 1, -1]");
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, -1, 0, 1]");
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 1, 1]");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 0, 1, -1]");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 0, 10]");
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 1, -1]");
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, -1, 1]");
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 0, 0, 100]");
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 10, 100]");
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 0, 10]");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 10, 10]");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, 1, 1]");
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, -1, 0, 1]");
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 0, -1]");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 10, -1, 100]");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 10, 0]");
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, 0, 10]");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 10, 10, 100]");
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 100, 10]");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 1, 0, 1]");
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 1, 1]");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, -1]");
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 0, -1]");
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 10, 100, 100]");
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 1, 100]");
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 10, 0, -1]");
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 10, -1, 100]");
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 1, -1]");
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 1, 0, 1]");
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, 10]");
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 0, 100]");
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, 1, 1]");
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 100, 0]");
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 100, 100, 10]");
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 1, 100, 100]");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, -1, 1]");
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 100, 0, 0]");
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 0, 1]");
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, -1, 0, 1]");
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, -1, 1, 10, 0]");
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 1, -1, 100]");
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 10, 1, 0]");
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 0, -1]");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, -1, 0, -1]");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, -1, 10, 1]");
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 0, 1, 10]");
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 0, 0]");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 0, 1, 100]");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 100, 100, -1]");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 100, 100]");
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 100, 100, 1]");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
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
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, 100, 10, 100]");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 100, 100]");
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, -1, 1, 10, 10]");
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 1, 100, -1]");
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 0, 1, 0]");
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, -1, 10, 0]");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 0, 10]");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 1, 1, 0]");
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 10, 1, 1]");
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler6 = webSocketClient0.new HandshakeChannelHandler(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 1, 10]");
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, 0, -1]");
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 0, 10]");
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, -1, 1]");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, -1, 10]");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 0, 100, 0]");
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, 10, 10]");
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
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
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, -1, -1]");
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 10, -1, 10]");
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 100, -1, 1]");
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 100, 0, 10]");
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, 100, 100, -1]");
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler7 = webSocketClient0.new HandshakeChannelHandler(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, -1, 100]");
    }
}

