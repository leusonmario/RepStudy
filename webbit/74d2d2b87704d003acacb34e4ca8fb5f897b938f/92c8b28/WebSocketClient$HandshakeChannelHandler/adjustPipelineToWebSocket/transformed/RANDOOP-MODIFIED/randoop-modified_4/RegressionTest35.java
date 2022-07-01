import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test17501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17501");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 10, 100, -1]");
    }

    @Test
    public void test17502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17502");
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
    public void test17503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17503");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 0, 100, 10]");
    }

    @Test
    public void test17504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17504");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 1, 100, -1]");
    }

    @Test
    public void test17505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17505");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 100, 10]");
    }

    @Test
    public void test17506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17506");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 100, 1, 1]");
    }

    @Test
    public void test17507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17507");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 1, 100, -1]");
    }

    @Test
    public void test17508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17508");
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
    public void test17509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17509");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 0, 10, 10]");
    }

    @Test
    public void test17510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17510");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 0, 100, -1]");
    }

    @Test
    public void test17511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17511");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, -1, 1, 100]");
    }

    @Test
    public void test17512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17512");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 0, -1, -1]");
    }

    @Test
    public void test17513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17513");
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
    public void test17514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17514");
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
    public void test17515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17515");
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
    public void test17516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17516");
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
    public void test17517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17517");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, 0, 100]");
    }

    @Test
    public void test17518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17518");
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
    public void test17519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17519");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, -1, 1, 100]");
    }

    @Test
    public void test17520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17520");
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
    public void test17521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17521");
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
    public void test17522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17522");
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
    public void test17523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17523");
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
    public void test17524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17524");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, -1, -1, 0]");
    }

    @Test
    public void test17525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17525");
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
    public void test17526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17526");
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
    public void test17527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17527");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 100, 1, 100, 0]");
    }

    @Test
    public void test17528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17528");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 0, -1, 10]");
    }

    @Test
    public void test17529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17529");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 1, -1, 10]");
    }

    @Test
    public void test17530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17530");
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
    public void test17531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17531");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, 1, -1]");
    }

    @Test
    public void test17532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17532");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 100, -1, 0]");
    }

    @Test
    public void test17533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17533");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 0, 100, 1]");
    }

    @Test
    public void test17534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17534");
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
    public void test17535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17535");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, -1, 0, 10]");
    }

    @Test
    public void test17536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17536");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 10, 100, 100]");
    }

    @Test
    public void test17537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17537");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 100, 0, -1]");
    }

    @Test
    public void test17538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17538");
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
    public void test17539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17539");
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
    public void test17540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17540");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 10, 100]");
    }

    @Test
    public void test17541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17541");
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
    public void test17542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17542");
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
    public void test17543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17543");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, -1, 100, -1]");
    }

    @Test
    public void test17544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17544");
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
    public void test17545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17545");
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
    public void test17546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17546");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 10, 100, 0]");
    }

    @Test
    public void test17547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17547");
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
    public void test17548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17548");
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
    public void test17549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17549");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 1, -1, -1]");
    }

    @Test
    public void test17550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17550");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 10, 100, 0]");
    }

    @Test
    public void test17551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17551");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, -1, -1]");
    }

    @Test
    public void test17552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17552");
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
    public void test17553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17553");
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
    public void test17554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17554");
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
    public void test17555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17555");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, -1, 1]");
    }

    @Test
    public void test17556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17556");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10, 1, 1]");
    }

    @Test
    public void test17557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17557");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 100, 100, 1]");
    }

    @Test
    public void test17558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17558");
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
    public void test17559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17559");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 100, 100, 0, 0]");
    }

    @Test
    public void test17560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17560");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 10, 10, 100]");
    }

    @Test
    public void test17561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17561");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 10, 1, 10]");
    }

    @Test
    public void test17562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17562");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, -1, 0, 100]");
    }

    @Test
    public void test17563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17563");
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
    public void test17564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17564");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, 100, 1]");
    }

    @Test
    public void test17565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17565");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, -1, -1, 1]");
    }

    @Test
    public void test17566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17566");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 0, 10, 10]");
    }

    @Test
    public void test17567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17567");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, -1, -1, 0]");
    }

    @Test
    public void test17568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17568");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 10, 100, 0]");
    }

    @Test
    public void test17569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17569");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, -1, 10, 0]");
    }

    @Test
    public void test17570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17570");
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
    public void test17571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17571");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 100, 1, 10]");
    }

    @Test
    public void test17572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17572");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 1, 1, 10]");
    }

    @Test
    public void test17573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17573");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 10, 1, 100]");
    }

    @Test
    public void test17574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17574");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 10, 10, 1]");
    }

    @Test
    public void test17575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17575");
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
    public void test17576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17576");
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
    public void test17577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17577");
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
    public void test17578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17578");
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
    public void test17579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17579");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, -1, 10, 0]");
    }

    @Test
    public void test17580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17580");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 100, -1, 1]");
    }

    @Test
    public void test17581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17581");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 100, -1, 10]");
    }

    @Test
    public void test17582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17582");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 0, 0, 1]");
    }

    @Test
    public void test17583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17583");
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
    public void test17584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17584");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 10, -1, 100]");
    }

    @Test
    public void test17585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17585");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 0, 100, 10]");
    }

    @Test
    public void test17586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17586");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, 0, 100, 1]");
    }

    @Test
    public void test17587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17587");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 0, 10, 0]");
    }

    @Test
    public void test17588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17588");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 1, 1, 0]");
    }

    @Test
    public void test17589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17589");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 1, 100, 1]");
    }

    @Test
    public void test17590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17590");
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
    public void test17591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17591");
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
    public void test17592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17592");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 100, 0, 10]");
    }

    @Test
    public void test17593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17593");
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
    public void test17594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17594");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 100, 100, -1]");
    }

    @Test
    public void test17595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17595");
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
    public void test17596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17596");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 1, 1, 10]");
    }

    @Test
    public void test17597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17597");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 10, -1, 100]");
    }

    @Test
    public void test17598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17598");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 10, 0, 100]");
    }

    @Test
    public void test17599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17599");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 100, 100, -1]");
    }

    @Test
    public void test17600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17600");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 100, -1, 1, 1]");
    }

    @Test
    public void test17601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17601");
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
    public void test17602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17602");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 100, 0]");
    }

    @Test
    public void test17603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17603");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, -1, 1, -1]");
    }

    @Test
    public void test17604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17604");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 10, 0, 0]");
    }

    @Test
    public void test17605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17605");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 100, 10, 0, -1]");
    }

    @Test
    public void test17606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17606");
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
    public void test17607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17607");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, -1, 10, 100]");
    }

    @Test
    public void test17608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17608");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, 0, 10, 100]");
    }

    @Test
    public void test17609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17609");
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
    public void test17610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17610");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 0, 100, 0]");
    }

    @Test
    public void test17611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17611");
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
    public void test17612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17612");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 0, 10, 0, 100]");
    }

    @Test
    public void test17613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17613");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 100, 10, 1, 10]");
    }

    @Test
    public void test17614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17614");
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
    public void test17615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17615");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 100, -1, 10]");
    }

    @Test
    public void test17616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17616");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 100, 1, 1]");
    }

    @Test
    public void test17617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17617");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 0, 0]");
    }

    @Test
    public void test17618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17618");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 1, 10, -1]");
    }

    @Test
    public void test17619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17619");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 10, 10, -1]");
    }

    @Test
    public void test17620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17620");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, -1, -1, 100]");
    }

    @Test
    public void test17621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17621");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 10, 0, 10]");
    }

    @Test
    public void test17622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17622");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, -1, 10, 0]");
    }

    @Test
    public void test17623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17623");
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
    public void test17624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17624");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 0, 10, 0]");
    }

    @Test
    public void test17625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17625");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, -1, -1, 10]");
    }

    @Test
    public void test17626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17626");
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
    public void test17627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17627");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 0, 1, 100]");
    }

    @Test
    public void test17628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17628");
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
    public void test17629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17629");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 100, 100, 1]");
    }

    @Test
    public void test17630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17630");
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
    public void test17631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17631");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 100, 100, 1]");
    }

    @Test
    public void test17632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17632");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 100, 0, 100]");
    }

    @Test
    public void test17633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17633");
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
    public void test17634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17634");
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
    public void test17635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17635");
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
    public void test17636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17636");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, -1, -1, 0]");
    }

    @Test
    public void test17637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17637");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 0, 1, -1]");
    }

    @Test
    public void test17638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17638");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 0, 1, 0]");
    }

    @Test
    public void test17639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17639");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, 1, 0, 100]");
    }

    @Test
    public void test17640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17640");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 100, 0, -1]");
    }

    @Test
    public void test17641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17641");
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
    public void test17642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17642");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 1, 1, 100]");
    }

    @Test
    public void test17643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17643");
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
    public void test17644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17644");
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
    public void test17645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17645");
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
    public void test17646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17646");
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
    public void test17647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17647");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 10, 0, 0]");
    }

    @Test
    public void test17648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17648");
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
    public void test17649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17649");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 10, 100, 100]");
    }

    @Test
    public void test17650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17650");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 0, 1, 10]");
    }

    @Test
    public void test17651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17651");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 0, 0, 1]");
    }

    @Test
    public void test17652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17652");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, -1, 100, 100, -1]");
    }

    @Test
    public void test17653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17653");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 100, -1, 0]");
    }

    @Test
    public void test17654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17654");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 1, 10, -1]");
    }

    @Test
    public void test17655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17655");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 1, 0, 1, 100]");
    }

    @Test
    public void test17656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17656");
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
    public void test17657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17657");
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
    public void test17658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17658");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 1, 1, -1]");
    }

    @Test
    public void test17659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17659");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 10, 10, 0]");
    }

    @Test
    public void test17660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17660");
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
    public void test17661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17661");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 0, 0, -1]");
    }

    @Test
    public void test17662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17662");
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
    public void test17663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17663");
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
    public void test17664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17664");
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
    public void test17665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17665");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 0, 100, 0]");
    }

    @Test
    public void test17666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17666");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 0, 10, 1]");
    }

    @Test
    public void test17667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17667");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 10, -1, 100, 1]");
    }

    @Test
    public void test17668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17668");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 100, 10, 0]");
    }

    @Test
    public void test17669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17669");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 100, 100, 10]");
    }

    @Test
    public void test17670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17670");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, 1, -1]");
    }

    @Test
    public void test17671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17671");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 1, 100, 1]");
    }

    @Test
    public void test17672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17672");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 1, 100, 1]");
    }

    @Test
    public void test17673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17673");
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
    public void test17674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17674");
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
    public void test17675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17675");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, -1, 10, 100]");
    }

    @Test
    public void test17676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17676");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 100, -1, 0]");
    }

    @Test
    public void test17677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17677");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 0, 100, -1]");
    }

    @Test
    public void test17678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17678");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 1, 0, -1]");
    }

    @Test
    public void test17679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17679");
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
    public void test17680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17680");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, 10, 10, 0]");
    }

    @Test
    public void test17681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17681");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 100, 10, 0]");
    }

    @Test
    public void test17682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17682");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 0, -1, 0]");
    }

    @Test
    public void test17683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17683");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, 0, 10]");
    }

    @Test
    public void test17684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17684");
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
    public void test17685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17685");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 10, 0, 1]");
    }

    @Test
    public void test17686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17686");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, 100, 100]");
    }

    @Test
    public void test17687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17687");
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
    public void test17688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17688");
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
    public void test17689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17689");
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
    public void test17690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17690");
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
    public void test17691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17691");
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
    public void test17692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17692");
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
    public void test17693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17693");
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
    public void test17694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17694");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, -1, 10, -1]");
    }

    @Test
    public void test17695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17695");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 10, 10, 10, 100]");
    }

    @Test
    public void test17696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17696");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 10, 10, 0]");
    }

    @Test
    public void test17697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17697");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 0, 100]");
    }

    @Test
    public void test17698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17698");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, -1, 10, 1]");
    }

    @Test
    public void test17699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17699");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 1, -1, 1]");
    }

    @Test
    public void test17700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17700");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 1, -1, 0, 1]");
    }

    @Test
    public void test17701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17701");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 0, 0, 10, 100]");
    }

    @Test
    public void test17702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17702");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, 0, 10, 1]");
    }

    @Test
    public void test17703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17703");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 100, -1, -1]");
    }

    @Test
    public void test17704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17704");
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
    public void test17705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17705");
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
    public void test17706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17706");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 1, 10, 1]");
    }

    @Test
    public void test17707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17707");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 100, 1, 10]");
    }

    @Test
    public void test17708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17708");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 0, 100, 100]");
    }

    @Test
    public void test17709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17709");
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
    public void test17710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17710");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 10, 1, 0, -1]");
    }

    @Test
    public void test17711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17711");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 0, 1, -1]");
    }

    @Test
    public void test17712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17712");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 1, 100, -1]");
    }

    @Test
    public void test17713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17713");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 100, 10, 100]");
    }

    @Test
    public void test17714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17714");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 10, -1, 10]");
    }

    @Test
    public void test17715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17715");
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
    public void test17716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17716");
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
    public void test17717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17717");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, -1, 0, 0]");
    }

    @Test
    public void test17718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17718");
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
    public void test17719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17719");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 100, 10, 10]");
    }

    @Test
    public void test17720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17720");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 100, -1, 0]");
    }

    @Test
    public void test17721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17721");
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
    public void test17722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17722");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 10, 1, 0]");
    }

    @Test
    public void test17723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17723");
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
    public void test17724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17724");
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
    public void test17725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17725");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, 10, 100]");
    }

    @Test
    public void test17726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17726");
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
    public void test17727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17727");
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
    public void test17728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17728");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, 10, 0, 1]");
    }

    @Test
    public void test17729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17729");
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
    public void test17730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17730");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 100, 100, 1]");
    }

    @Test
    public void test17731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17731");
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
    public void test17732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17732");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, 100, 0, 100]");
    }

    @Test
    public void test17733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17733");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 100, -1]");
    }

    @Test
    public void test17734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17734");
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
    public void test17735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17735");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, -1, 100, 0]");
    }

    @Test
    public void test17736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17736");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 1, 0, 1]");
    }

    @Test
    public void test17737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17737");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 10, -1, 1]");
    }

    @Test
    public void test17738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17738");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 1, 10, -1]");
    }

    @Test
    public void test17739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17739");
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
    public void test17740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17740");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, 1, 10, -1]");
    }

    @Test
    public void test17741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17741");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, -1, 10]");
    }

    @Test
    public void test17742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17742");
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
    public void test17743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17743");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 100, 1, -1, 10]");
    }

    @Test
    public void test17744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17744");
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
    public void test17745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17745");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 1, 1, 0]");
    }

    @Test
    public void test17746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17746");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 0, 10, 0]");
    }

    @Test
    public void test17747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17747");
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
    public void test17748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17748");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 0, 100, 100]");
    }

    @Test
    public void test17749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17749");
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
    public void test17750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17750");
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
    public void test17751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17751");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 100, -1, 0]");
    }

    @Test
    public void test17752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17752");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, -1, 0, 100]");
    }

    @Test
    public void test17753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17753");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, 100, 100, 100]");
    }

    @Test
    public void test17754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17754");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 0, 1, 10]");
    }

    @Test
    public void test17755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17755");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, -1, 10, 100]");
    }

    @Test
    public void test17756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17756");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, -1, 1, 10]");
    }

    @Test
    public void test17757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17757");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, -1, 1, 1]");
    }

    @Test
    public void test17758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17758");
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
    public void test17759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17759");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 1, 1, 1, -1]");
    }

    @Test
    public void test17760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17760");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 10, 100, 100]");
    }

    @Test
    public void test17761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17761");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 0, -1, 10]");
    }

    @Test
    public void test17762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17762");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 10, 1, 0]");
    }

    @Test
    public void test17763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17763");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 100, 1, 100]");
    }

    @Test
    public void test17764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17764");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1, 100, -1]");
    }

    @Test
    public void test17765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17765");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 0, 10, -1]");
    }

    @Test
    public void test17766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17766");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, 0, 100]");
    }

    @Test
    public void test17767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17767");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, 10, 10, 10]");
    }

    @Test
    public void test17768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17768");
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
    public void test17769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17769");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, -1, 100, 10]");
    }

    @Test
    public void test17770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17770");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 100, 0, 100]");
    }

    @Test
    public void test17771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17771");
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
    public void test17772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17772");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 0, 1, 100]");
    }

    @Test
    public void test17773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17773");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 10, 10, 1]");
    }

    @Test
    public void test17774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17774");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 0, 1, 0]");
    }

    @Test
    public void test17775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17775");
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
    public void test17776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17776");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 1, 10, -1]");
    }

    @Test
    public void test17777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17777");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 0, 0, 10, 10]");
    }

    @Test
    public void test17778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17778");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 10, 1, 10]");
    }

    @Test
    public void test17779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17779");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 0, 10, -1]");
    }

    @Test
    public void test17780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17780");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 100, 100, 10, 100]");
    }

    @Test
    public void test17781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17781");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 10, 0, 100]");
    }

    @Test
    public void test17782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17782");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 10, 1, 100]");
    }

    @Test
    public void test17783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17783");
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
    public void test17784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17784");
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

    @Test
    public void test17785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17785");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 100, -1, 1]");
    }

    @Test
    public void test17786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17786");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 100, -1, -1]");
    }

    @Test
    public void test17787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17787");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 0, 100, -1]");
    }

    @Test
    public void test17788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17788");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10, 0, 10]");
    }

    @Test
    public void test17789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17789");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 10, 1, 1]");
    }

    @Test
    public void test17790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17790");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 100, 100, 0]");
    }

    @Test
    public void test17791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17791");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, 0, 100, 10]");
    }

    @Test
    public void test17792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17792");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 1, 1, 100]");
    }

    @Test
    public void test17793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17793");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 0, 1, 100]");
    }

    @Test
    public void test17794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17794");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 0, -1, 100]");
    }

    @Test
    public void test17795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17795");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 1, 1, -1]");
    }

    @Test
    public void test17796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17796");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, 0, 0, 1]");
    }

    @Test
    public void test17797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17797");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 1, 10, 100]");
    }

    @Test
    public void test17798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17798");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 0, 10, 1]");
    }

    @Test
    public void test17799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17799");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, -1, 100, 1]");
    }

    @Test
    public void test17800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17800");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, 100, 0]");
    }

    @Test
    public void test17801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17801");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 10, -1, 1]");
    }

    @Test
    public void test17802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17802");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, -1, 10, 10]");
    }

    @Test
    public void test17803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17803");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 100, -1, 10]");
    }

    @Test
    public void test17804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17804");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 0, 100, -1]");
    }

    @Test
    public void test17805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17805");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 1, 1, -1]");
    }

    @Test
    public void test17806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17806");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 100, 10, 100, 1]");
    }

    @Test
    public void test17807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17807");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 10, 1, 1]");
    }

    @Test
    public void test17808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17808");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 0, 100, 100]");
    }

    @Test
    public void test17809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17809");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 10, -1, 1, 1]");
    }

    @Test
    public void test17810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17810");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 0, 10, 10]");
    }

    @Test
    public void test17811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17811");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, -1, 10, 1]");
    }

    @Test
    public void test17812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17812");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, 0, 0]");
    }

    @Test
    public void test17813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17813");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 10, 100, 0]");
    }

    @Test
    public void test17814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17814");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 100, 100, 100, 1]");
    }

    @Test
    public void test17815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17815");
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
    public void test17816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17816");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 10, 10, 100]");
    }

    @Test
    public void test17817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17817");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 10, 1, -1]");
    }

    @Test
    public void test17818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17818");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, -1, 1, 100, 0]");
    }

    @Test
    public void test17819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17819");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 1, -1, -1]");
    }

    @Test
    public void test17820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17820");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 10, 10, 100]");
    }

    @Test
    public void test17821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17821");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 1, 0, 1]");
    }

    @Test
    public void test17822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17822");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, -1, 100, 0]");
    }

    @Test
    public void test17823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17823");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1, 0, 10, 1]");
    }

    @Test
    public void test17824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17824");
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
    public void test17825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17825");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 1, 0, 10]");
    }

    @Test
    public void test17826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17826");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 1, -1, 100]");
    }

    @Test
    public void test17827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17827");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, 1, 10, 0, 1]");
    }

    @Test
    public void test17828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17828");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, 100, 1, 10]");
    }

    @Test
    public void test17829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17829");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 1, 100, 0]");
    }

    @Test
    public void test17830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17830");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 1, -1, 100]");
    }

    @Test
    public void test17831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17831");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 100, 10, 10, 0]");
    }

    @Test
    public void test17832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17832");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, -1, -1, 1]");
    }

    @Test
    public void test17833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17833");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 1, 0, 100]");
    }

    @Test
    public void test17834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17834");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 10, 10, -1]");
    }

    @Test
    public void test17835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17835");
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
    public void test17836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17836");
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
    public void test17837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17837");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, 10, 0, 1]");
    }

    @Test
    public void test17838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17838");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 100, 1, -1]");
    }

    @Test
    public void test17839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17839");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 1, -1, 100, 0]");
    }

    @Test
    public void test17840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17840");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, -1, -1, 10]");
    }

    @Test
    public void test17841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17841");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 0, 10, -1]");
    }

    @Test
    public void test17842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17842");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, -1, 1, 1, 100]");
    }

    @Test
    public void test17843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17843");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 100, -1, 0]");
    }

    @Test
    public void test17844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17844");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 1, -1, 0, -1]");
    }

    @Test
    public void test17845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17845");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 0, 0, 1]");
    }

    @Test
    public void test17846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17846");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 100, 1, 10]");
    }

    @Test
    public void test17847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17847");
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
    public void test17848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17848");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, 0, 10]");
    }

    @Test
    public void test17849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17849");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 0, -1, 0, 10]");
    }

    @Test
    public void test17850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17850");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 1, 100, -1]");
    }

    @Test
    public void test17851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17851");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 10, 1, 1, 1]");
    }

    @Test
    public void test17852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17852");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 10, 1, 1, 1]");
    }

    @Test
    public void test17853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17853");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 100, 0, 1, 1]");
    }

    @Test
    public void test17854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17854");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, 10, 10, -1]");
    }

    @Test
    public void test17855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17855");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 100, 10, -1, 10]");
    }

    @Test
    public void test17856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17856");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 100, 10, -1]");
    }

    @Test
    public void test17857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17857");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 1, 100, 0]");
    }

    @Test
    public void test17858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17858");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 1, 0, 1, 0]");
    }

    @Test
    public void test17859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17859");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, -1, 100, -1]");
    }

    @Test
    public void test17860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17860");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 0, 0, 0, 0]");
    }

    @Test
    public void test17861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17861");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 0, -1, 1]");
    }

    @Test
    public void test17862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17862");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 100, 100, 1]");
    }

    @Test
    public void test17863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17863");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 10, 0, 10]");
    }

    @Test
    public void test17864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17864");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 0, 10, -1, 100]");
    }

    @Test
    public void test17865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17865");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 100, -1, 1, 1]");
    }

    @Test
    public void test17866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17866");
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
    public void test17867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17867");
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
    public void test17868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17868");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 0, 0, 1, 1]");
    }

    @Test
    public void test17869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17869");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 0, -1, 10, 10]");
    }

    @Test
    public void test17870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17870");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, -1, 100, 10]");
    }

    @Test
    public void test17871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17871");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 1, 1, 100, 1]");
    }

    @Test
    public void test17872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17872");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 0, 100, 0]");
    }

    @Test
    public void test17873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17873");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, -1, -1, 10, -1]");
    }

    @Test
    public void test17874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17874");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 1, -1, -1]");
    }

    @Test
    public void test17875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17875");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 0, 0, 100, 100]");
    }

    @Test
    public void test17876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17876");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 0, -1, 100, 100]");
    }

    @Test
    public void test17877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17877");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, -1, -1, 100]");
    }

    @Test
    public void test17878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17878");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 0, 0, 100, -1]");
    }

    @Test
    public void test17879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17879");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, -1, 100, -1]");
    }

    @Test
    public void test17880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17880");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 0, 10, -1, 1]");
    }

    @Test
    public void test17881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17881");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 1, 10, 100]");
    }

    @Test
    public void test17882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17882");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, 10, -1, 10, 0]");
    }

    @Test
    public void test17883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17883");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, -1, 1, 10]");
    }

    @Test
    public void test17884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17884");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, 1, 10, 100]");
    }

    @Test
    public void test17885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17885");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, 0, 10, -1]");
    }

    @Test
    public void test17886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17886");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 0, 1, 0, 100]");
    }

    @Test
    public void test17887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17887");
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
    public void test17888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17888");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 10, 100, 0, 1]");
    }

    @Test
    public void test17889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17889");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 0, 0, 100]");
    }

    @Test
    public void test17890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17890");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 0, -1, 1]");
    }

    @Test
    public void test17891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17891");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 100, -1, -1]");
    }

    @Test
    public void test17892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17892");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, 1, -1, -1]");
    }

    @Test
    public void test17893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17893");
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
    public void test17894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17894");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, 10, 10, 10]");
    }

    @Test
    public void test17895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17895");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 1, 100, -1]");
    }

    @Test
    public void test17896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17896");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, -1, 100, 1, 1]");
    }

    @Test
    public void test17897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17897");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, -1, 100, 0, -1]");
    }

    @Test
    public void test17898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17898");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 100, 0, 0]");
    }

    @Test
    public void test17899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17899");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, -1, 10, -1, -1]");
    }

    @Test
    public void test17900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17900");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, -1, 0, 100, 100]");
    }

    @Test
    public void test17901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17901");
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
    public void test17902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17902");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, -1, 10, 10, 100]");
    }

    @Test
    public void test17903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17903");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, 10, 10]");
    }

    @Test
    public void test17904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17904");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 10, 0, -1, 1]");
    }

    @Test
    public void test17905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17905");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, -1, 1, 10, 1]");
    }

    @Test
    public void test17906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17906");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 1, 100, -1, -1]");
    }

    @Test
    public void test17907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17907");
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
    public void test17908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17908");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, -1, 1, -1]");
    }

    @Test
    public void test17909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17909");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, 0, 10, -1]");
    }

    @Test
    public void test17910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17910");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 10, 10, 0]");
    }

    @Test
    public void test17911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17911");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 1, 100, 10]");
    }

    @Test
    public void test17912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17912");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 100, 10, -1, 10]");
    }

    @Test
    public void test17913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17913");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, -1, 1, -1]");
    }

    @Test
    public void test17914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17914");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 0, -1, -1]");
    }

    @Test
    public void test17915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17915");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, -1, 10, 10]");
    }

    @Test
    public void test17916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17916");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, -1, -1, 10]");
    }

    @Test
    public void test17917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17917");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, -1, 0, 10]");
    }

    @Test
    public void test17918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17918");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 100, 10, -1, 100, 100]");
    }

    @Test
    public void test17919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17919");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 0, 100, 0, 100]");
    }

    @Test
    public void test17920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17920");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 1, 0, 10, 10]");
    }

    @Test
    public void test17921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17921");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 10, 0, -1]");
    }

    @Test
    public void test17922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17922");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, -1, -1, 1]");
    }

    @Test
    public void test17923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17923");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 1, 100, 100, 10]");
    }

    @Test
    public void test17924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17924");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, -1, 10, -1]");
    }

    @Test
    public void test17925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17925");
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
    public void test17926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17926");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 10, 0, -1, 1]");
    }

    @Test
    public void test17927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17927");
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
    public void test17928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17928");
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
    public void test17929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17929");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 100, -1, 1]");
    }

    @Test
    public void test17930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17930");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 1, 0, 10]");
    }

    @Test
    public void test17931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17931");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, -1, -1, 1, 10]");
    }

    @Test
    public void test17932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17932");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 1, 10, -1, 100, 10]");
    }

    @Test
    public void test17933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17933");
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
    public void test17934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17934");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 10, 100, 0, 0]");
    }

    @Test
    public void test17935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17935");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 10, 100, 100, 1]");
    }

    @Test
    public void test17936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17936");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, -1, 0, 1]");
    }

    @Test
    public void test17937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17937");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 100, 1, 0, -1]");
    }

    @Test
    public void test17938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17938");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, 100, 10, 100, 10]");
    }

    @Test
    public void test17939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17939");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, 1, 0]");
    }

    @Test
    public void test17940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17940");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 100, 100]");
    }

    @Test
    public void test17941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17941");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 100, 1, 0]");
    }

    @Test
    public void test17942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17942");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, -1, -1, 1]");
    }

    @Test
    public void test17943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17943");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, 1, -1, -1, 0]");
    }

    @Test
    public void test17944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17944");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 0, 100, 100]");
    }

    @Test
    public void test17945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17945");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 10, -1, 1, 10, 100]");
    }

    @Test
    public void test17946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17946");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 100, 100, -1, 10]");
    }

    @Test
    public void test17947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17947");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 10, 0, -1, 100]");
    }

    @Test
    public void test17948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17948");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 10, 0, -1, 100]");
    }

    @Test
    public void test17949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17949");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 10, 1, 10, 1]");
    }

    @Test
    public void test17950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17950");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 1, -1, 1, 10]");
    }

    @Test
    public void test17951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17951");
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
    public void test17952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17952");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 0, -1, 0, 0]");
    }

    @Test
    public void test17953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17953");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 10, 100, 100, 0]");
    }

    @Test
    public void test17954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17954");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 1, 0]");
    }

    @Test
    public void test17955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17955");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 1, -1, 1]");
    }

    @Test
    public void test17956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17956");
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
    public void test17957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17957");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, 100, -1, 0]");
    }

    @Test
    public void test17958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17958");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 100, 0, 100, 0]");
    }

    @Test
    public void test17959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17959");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 10, -1, 100, 100, 10]");
    }

    @Test
    public void test17960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17960");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 0, -1, 100, 0]");
    }

    @Test
    public void test17961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17961");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, 100, 10, 1]");
    }

    @Test
    public void test17962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17962");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 10, 10, -1]");
    }

    @Test
    public void test17963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17963");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 100, 1, -1, 10]");
    }

    @Test
    public void test17964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17964");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 100, 100, 1, -1]");
    }

    @Test
    public void test17965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17965");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 0, 1, 10, 100, 10]");
    }

    @Test
    public void test17966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17966");
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
    public void test17967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17967");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0, 1, 0, 1, 0]");
    }

    @Test
    public void test17968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17968");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 100, 1, -1, 100]");
    }

    @Test
    public void test17969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17969");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 10, -1, 1, 0, 10]");
    }

    @Test
    public void test17970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17970");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 100, -1, 10]");
    }

    @Test
    public void test17971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17971");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 10, 10, 100]");
    }

    @Test
    public void test17972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17972");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, 0, 0, 100, -1]");
    }

    @Test
    public void test17973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17973");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, -1, 1, 1, 10]");
    }

    @Test
    public void test17974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17974");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 1, 1, 1, 100]");
    }

    @Test
    public void test17975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17975");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, 1, 10, 10]");
    }

    @Test
    public void test17976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17976");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, -1, -1, 100, -1]");
    }

    @Test
    public void test17977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17977");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 100, -1, 1, 1]");
    }

    @Test
    public void test17978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17978");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 10, -1, 0]");
    }

    @Test
    public void test17979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17979");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 0, 0, 1, 10]");
    }

    @Test
    public void test17980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17980");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 10, 0, 100, 100]");
    }

    @Test
    public void test17981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17981");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 100, 1, 0]");
    }

    @Test
    public void test17982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17982");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 100, 100, 0, 10]");
    }

    @Test
    public void test17983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17983");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 10, 1, 10, 10, 100]");
    }

    @Test
    public void test17984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17984");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, -1, 0, 1, 0]");
    }

    @Test
    public void test17985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17985");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 10, 100, 1, 0, 1]");
    }

    @Test
    public void test17986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17986");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 100, 1, 10, 1]");
    }

    @Test
    public void test17987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17987");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, -1, -1, 100, 0]");
    }

    @Test
    public void test17988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17988");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 100, 10, 0, 1, 0]");
    }

    @Test
    public void test17989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17989");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 1, 10, 0, 1, 1]");
    }

    @Test
    public void test17990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17990");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 1, -1, 100, 10]");
    }

    @Test
    public void test17991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17991");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 100, 1, -1, 0, -1]");
    }

    @Test
    public void test17992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17992");
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
    public void test17993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17993");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, -1, 1, 100, 1, 1]");
    }

    @Test
    public void test17994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17994");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 10, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 10, 10, 100, 1]");
    }

    @Test
    public void test17995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17995");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 0, 100, 10, 100]");
    }

    @Test
    public void test17996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17996");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, -1, -1, 100, 1, 100]");
    }

    @Test
    public void test17997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17997");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 0, 0, 1, 100]");
    }

    @Test
    public void test17998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17998");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, -1, -1, 1, 0]");
    }

    @Test
    public void test17999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test17999");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, 1, 0, 10, 1]");
    }

    @Test
    public void test18000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test18000");
        org.webbitserver.netty.WebSocketClient webSocketClient0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.webbitserver.netty.WebSocketClient.HandshakeChannelHandler handshakeChannelHandler8 = webSocketClient0.new HandshakeChannelHandler(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.webbitserver.netty.WebSocketClient$HandshakeChannelHandler with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 1, 10, 0, -1, 100]");
    }
}

