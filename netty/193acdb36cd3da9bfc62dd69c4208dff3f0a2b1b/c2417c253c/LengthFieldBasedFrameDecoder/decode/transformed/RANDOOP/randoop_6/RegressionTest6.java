import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 0, (int) (byte) 1, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) ' ');
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 10, (int) (short) 100, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 1, 1, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 10, (int) (short) 100, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 0, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '4', (int) (short) 0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) 'a', (int) 'a', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 0, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 10, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 100, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 0, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 1, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 100, (int) (short) 100, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (byte) 1, (int) (short) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (52) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 1, 1, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (byte) 1, 0, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 10, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 10, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

