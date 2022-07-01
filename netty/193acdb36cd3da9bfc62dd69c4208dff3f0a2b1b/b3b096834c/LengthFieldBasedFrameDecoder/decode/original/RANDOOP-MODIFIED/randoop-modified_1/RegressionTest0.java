import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 10, (int) (byte) -1, (int) (short) 1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dynamicChannelBuffer1.toString(100, (int) (short) 1, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.channels.ScatteringByteChannel scatteringByteChannel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.setBytes((-1), scatteringByteChannel3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = dynamicChannelBuffer3.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float4 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '4', (int) ' ', (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (-1), (int) (byte) 10, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) -1, (int) (short) 1, (int) (byte) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        dynamicChannelBuffer1.setChar((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (short) -1, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.indexOf((int) '#', (int) (short) 100, channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dynamicChannelBuffer1.getBoolean((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.jboss.netty.channel.Channel.OP_READ_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 1, (int) (byte) -1, 52, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 1, 10, 0, 52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) -1, byteArray13, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, -1, 100]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeInt(0);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) (byte) 1, inputStream7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            char char3 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        boolean boolean4 = dynamicChannelBuffer1.hasArray();
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 10, byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 100, 52, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer3.duplicate();
        int int7 = dynamicChannelBuffer3.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer3.factory();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 0, channelBufferFactory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes((int) (short) 100, scatteringByteChannel6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) -1, byteArray4, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = org.jboss.netty.channel.Channel.OP_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        // The following exception was thrown during execution in test generation
        try {
            byte byte4 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setBoolean(4, true);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 0, 10]");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 5, (int) (byte) -1, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 5, (int) '4', 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int7 = dynamicChannelBuffer6.capacity();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer6.writeBytes(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) 'a', byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.indexOf((int) (short) 1, (int) '4', channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.indexOf(35, 52, channelBufferIndexFinder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) -1, byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray8, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, -1]");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (int) (byte) 100, 0, 52, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        java.lang.String str7 = dynamicChannelBuffer1.toString();
        java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.slice((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str7, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.setBytes((int) (byte) 10, inputStream3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setShort((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) 'a', 100, 0, 35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        int int8 = dynamicChannelBuffer1.indexOf(0, 0, (byte) 1);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.setBytes((int) (byte) -1, scatteringByteChannel10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) (byte) -1, inputStream7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer15.readSlice((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dynamicChannelBuffer6.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        int int16 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer19.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer19.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer24.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer29.duplicate();
        int int33 = dynamicChannelBuffer29.capacity();
        dynamicChannelBuffer24.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, 0, (int) (byte) 10);
        long long38 = dynamicChannelBuffer24.getUnsignedInt(10);
        dynamicChannelBuffer19.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer19.setBytes(4, byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) ' ', byteArray44, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[10, -1, 0]");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        dynamicChannelBuffer11.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 0, (int) (byte) 10);
        long long25 = dynamicChannelBuffer11.getUnsignedInt(10);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer6.setBytes(4, byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 1, byteArray31, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, -1, 0]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.slice();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer3.copy((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeChar(52);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = dynamicChannelBuffer1.getFloat((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getUnsignedShort((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer8.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (-1), (int) (byte) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 0, (int) '4', (int) (short) 1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer10.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer8.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        byte byte15 = dynamicChannelBuffer8.getByte((int) ' ');
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer8.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) ' ');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(52, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream7, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer6.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '#', channelBuffer7, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        java.nio.ByteBuffer byteBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.getBytes((int) (short) 100, byteBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.channels.ScatteringByteChannel scatteringByteChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        int int8 = dynamicChannelBuffer1.indexOf(0, 0, (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer11.writerIndex((int) (short) 0);
        dynamicChannelBuffer11.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        short short9 = dynamicChannelBuffer1.getUnsignedByte((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        short short9 = dynamicChannelBuffer1.getUnsignedByte((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore(1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        dynamicChannelBuffer1.writeInt(0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.readBytes(gatheringByteChannel18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer3.toString(charset7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        java.nio.ByteBuffer byteBuffer17 = dynamicChannelBuffer15.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer15.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 0, (int) (short) -1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder5 = null;
        int int6 = dynamicChannelBuffer1.bytesBefore(0, channelBufferIndexFinder5);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int0 = org.jboss.netty.channel.Channel.OP_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.getInt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getBytes(100, gatheringByteChannel3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar(52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dynamicChannelBuffer1.toString(100, (int) (short) 10, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer1.getMedium((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = dynamicChannelBuffer6.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer7.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer5.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        byte byte12 = dynamicChannelBuffer5.getByte((int) ' ');
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer5.order();
        dynamicChannelBuffer5.writeChar(52);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, 10, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer1.writeChar((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.bytesBefore((int) (byte) 10, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        java.nio.ByteBuffer[] byteBufferArray18 = dynamicChannelBuffer15.toByteBuffers((int) (short) 0, (int) (byte) 1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer15.readBytes(gatheringByteChannel19, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteBufferArray18);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        boolean boolean4 = dynamicChannelBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer22.factory();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = dynamicChannelBuffer22.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        dynamicChannelBuffer11.writeDouble((double) 4);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray23);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dynamicChannelBuffer11.writeBytes(scatteringByteChannel25, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 35, 64, 16, 0, 0]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        dynamicChannelBuffer1.setBoolean((int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = dynamicChannelBuffer1.getDouble((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer6.bytesBefore(1, channelBufferIndexFinder23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int5 = dynamicChannelBuffer4.capacity();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer4.writeBytes(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dynamicChannelBuffer11.getLong((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, outputStream8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            char char3 = dynamicChannelBuffer1.getChar((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 10, (int) 'a', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) '\000', 5, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream2, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeInt(0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.bytesBefore(1, 100, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.setShort((int) (short) 10, 0);
        byte byte13 = dynamicChannelBuffer1.getByte((int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer17.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        byte byte22 = dynamicChannelBuffer15.getByte((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(35);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer14.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        byte byte21 = dynamicChannelBuffer14.getByte((int) ' ');
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer14.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder22, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder22, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder22, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder22, (int) (short) 1, channelBufferFactory36);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) -1, channelBufferFactory36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        java.nio.channels.GatheringByteChannel gatheringByteChannel24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer22.getBytes((int) ' ', gatheringByteChannel24, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 0, (int) ' ', (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, (int) 'a', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (4) must be equal to or greater than lengthFieldOffset (97) + lengthFieldLength (4).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer4.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer4.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        dynamicChannelBuffer9.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, 0, (int) (byte) 10);
        long long23 = dynamicChannelBuffer9.getUnsignedInt(10);
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer4.setBytes(4, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(4, byteArray29, 4, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, -1, 0]");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.slice((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer18.duplicate();
        int int22 = dynamicChannelBuffer18.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer18.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 1, channelBufferFactory23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer24.getMedium((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer29.duplicate();
        int int33 = dynamicChannelBuffer29.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer29.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) '#', channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory34);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = dynamicChannelBuffer36.writeBytes(scatteringByteChannel37, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        dynamicChannelBuffer11.writeDouble((double) 4);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer11.copy(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 35, 64, 16, 0, 0]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.channels.GatheringByteChannel gatheringByteChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readBytes(gatheringByteChannel2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dynamicChannelBuffer1.getUnsignedInt((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer10.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer10.duplicate();
        int int14 = dynamicChannelBuffer10.capacity();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', 1, (int) '4', 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer22.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setShort((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        dynamicChannelBuffer1.setChar((int) (short) 1, 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        dynamicChannelBuffer8.writeInt(0);
        int int13 = dynamicChannelBuffer8.readUnsignedMedium();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) int13);
        java.lang.Class<?> wildcardClass15 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        java.nio.ByteBuffer byteBuffer17 = dynamicChannelBuffer15.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte22 = dynamicChannelBuffer20.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer30.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer35.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer38 = dynamicChannelBuffer35.duplicate();
        int int39 = dynamicChannelBuffer35.capacity();
        dynamicChannelBuffer30.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35, 0, (int) (byte) 10);
        long long44 = dynamicChannelBuffer30.getUnsignedInt(10);
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer25.setBytes(4, byteArray50);
        dynamicChannelBuffer20.getBytes((int) (byte) 10, byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.getBytes((int) '4', byteArray50, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertNotNull(channelBuffer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0, 0]");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.writerIndex();
        int int3 = dynamicChannelBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.readSlice((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int0 = org.jboss.netty.channel.Channel.OP_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeChar(52);
        long long13 = dynamicChannelBuffer1.getUnsignedInt(10);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer22.factory();
        dynamicChannelBuffer22.writeBoolean(true);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        byte byte34 = dynamicChannelBuffer27.getByte((int) ' ');
        java.nio.ByteOrder byteOrder35 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder35, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder35, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer42.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer45 = dynamicChannelBuffer42.duplicate();
        int int46 = dynamicChannelBuffer42.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory47 = dynamicChannelBuffer42.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder35, 52, channelBufferFactory47);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer51.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer54 = dynamicChannelBuffer51.duplicate();
        dynamicChannelBuffer48.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer51, 5, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertNotNull(channelBuffer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 35 + "'", int46 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory47);
        org.junit.Assert.assertNotNull(channelBuffer54);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.writerIndex((int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 35, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 0);
        boolean boolean22 = dynamicChannelBuffer17.readable();
        // The following exception was thrown during execution in test generation
        try {
            short short24 = dynamicChannelBuffer17.getUnsignedByte((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder5 = null;
        int int6 = dynamicChannelBuffer1.bytesBefore(0, channelBufferIndexFinder5);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel7, 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeMedium(35);
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dynamicChannelBuffer1.toString((int) (byte) -1, (int) (short) 10, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeInt(0);
        int int6 = dynamicChannelBuffer1.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dynamicChannelBuffer1.getUnsignedInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.slice();
        dynamicChannelBuffer3.writeShort((int) (short) 10);
        byte byte10 = dynamicChannelBuffer3.readByte();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.readerIndex((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        java.lang.Class<?> wildcardClass5 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        dynamicChannelBuffer1.setLong((int) (byte) 0, (long) (short) 100);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.indexOf((int) '#', 52, channelBufferIndexFinder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer22.factory();
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.readBytes(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 10, 0]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (short) -1, (int) (short) 10, 4376576, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer1.bytesBefore((int) '#', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        int int21 = dynamicChannelBuffer20.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer20.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39, (-1), 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.writerIndex();
        int int3 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        java.lang.String str12 = dynamicChannelBuffer6.toString();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str12, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            short short22 = dynamicChannelBuffer6.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer3.markReaderIndex();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer3.writeBytes(scatteringByteChannel8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = dynamicChannelBuffer15.getBoolean((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.indexOf((-1), 4, channelBufferIndexFinder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.writerIndex();
        int int3 = dynamicChannelBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer18.duplicate();
        int int22 = dynamicChannelBuffer18.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer18.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 1, channelBufferFactory23);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = dynamicChannelBuffer24.getDouble((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeMedium(35);
        dynamicChannelBuffer1.writeByte((int) (byte) 100);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.setBytes((int) '#', inputStream9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        byte byte11 = dynamicChannelBuffer4.getByte((int) ' ');
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer4.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 5);
        dynamicChannelBuffer14.writeMedium(35);
        dynamicChannelBuffer14.writeDouble((double) 4);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        dynamicChannelBuffer14.getBytes((int) (byte) 1, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray26, (int) '4', (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 35, 64, 16, 0, 0]");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer11.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer11.setBytes(100, scatteringByteChannel15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeMedium(35);
        dynamicChannelBuffer1.writeByte((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean((int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        int int15 = dynamicChannelBuffer6.getMedium(1);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer6.toString(charset16);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer6.readSlice((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        byte byte7 = dynamicChannelBuffer1.getByte(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte11 = dynamicChannelBuffer9.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer19.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer24.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer24.duplicate();
        int int28 = dynamicChannelBuffer24.capacity();
        dynamicChannelBuffer19.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, 0, (int) (byte) 10);
        long long33 = dynamicChannelBuffer19.getUnsignedInt(10);
        dynamicChannelBuffer14.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer14.setBytes(4, byteArray39);
        dynamicChannelBuffer9.getBytes((int) (byte) 10, byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0, 0]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.setShort((int) (short) 10, 0);
        byte byte13 = dynamicChannelBuffer1.getByte((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 10, (int) (short) 66, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 66");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeFloat((float) 52);
        dynamicChannelBuffer15.skipBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer15.getMedium(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.writeInt(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer14.toString(charset15);
        dynamicChannelBuffer14.writeInt(0);
        int int19 = dynamicChannelBuffer14.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 0, 100, 1, 1]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = dynamicChannelBuffer1.getByte(4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4376576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        java.nio.ByteBuffer byteBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, byteBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer38.duplicate();
        int int42 = dynamicChannelBuffer38.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory43 = dynamicChannelBuffer38.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 52, channelBufferFactory43);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory45 = dynamicChannelBuffer44.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 10, channelBufferFactory45);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer51.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer49.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer51);
        byte byte56 = dynamicChannelBuffer49.getByte((int) ' ');
        java.nio.ByteOrder byteOrder57 = dynamicChannelBuffer49.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer61 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer64 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer64.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer67 = dynamicChannelBuffer64.duplicate();
        int int68 = dynamicChannelBuffer64.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory69 = dynamicChannelBuffer64.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer70 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 52, channelBufferFactory69);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory71 = dynamicChannelBuffer70.factory();
        dynamicChannelBuffer46.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer70, (int) (short) 1, 5);
        java.nio.channels.GatheringByteChannel gatheringByteChannel76 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int78 = dynamicChannelBuffer46.getBytes(35, gatheringByteChannel76, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory43);
        org.junit.Assert.assertNotNull(channelBufferFactory45);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 0 + "'", byte56 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNotNull(channelBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory69);
        org.junit.Assert.assertNotNull(channelBufferFactory71);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = dynamicChannelBuffer1.getBoolean((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) ' ');
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.getShort((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeFloat((float) 52);
        dynamicChannelBuffer15.skipBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setBoolean((int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 10, (int) (short) 100, (int) (short) 66, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 35, 52, (int) (byte) 1, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        boolean boolean4 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore((int) (byte) -1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer5.writeLong((long) (short) 1);
        dynamicChannelBuffer5.setBoolean((int) ' ', false);
        byte byte11 = dynamicChannelBuffer5.readByte();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        boolean boolean9 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium(35, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeChar(52);
        long long13 = dynamicChannelBuffer1.getUnsignedInt(10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer3.readSlice(0);
        dynamicChannelBuffer3.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer6.toByteBuffer(5, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer44.setDouble((int) (byte) -1, (double) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int6 = dynamicChannelBuffer5.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.setFloat((int) (short) 1, (float) 1L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer10.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer8.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        byte byte15 = dynamicChannelBuffer8.getByte((int) ' ');
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer8.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 0);
        boolean boolean22 = dynamicChannelBuffer17.readable();
        // The following exception was thrown during execution in test generation
        try {
            byte byte23 = dynamicChannelBuffer17.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer43.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer41.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43);
        byte byte48 = dynamicChannelBuffer41.getByte((int) ' ');
        java.nio.ByteOrder byteOrder49 = dynamicChannelBuffer41.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder49, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder54 = null;
        int int55 = dynamicChannelBuffer51.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder54);
        dynamicChannelBuffer51.setShort((int) (short) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer39.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer51, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 0 + "'", byte48 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 1, (int) (byte) 10, 5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) -1, 4376576, (int) (short) 1, 4376576, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 4376576, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        byte byte15 = dynamicChannelBuffer11.getByte(4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer22.bytesBefore((int) (byte) 1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer15.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer22.readSlice(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setBytes(1, channelBuffer27, (int) (short) 66, 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer3.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.setFloat((int) 'a', (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, 52, 100, (int) (byte) -1, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer18.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) -1, byteBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer17.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = dynamicChannelBuffer17.duplicate();
        int int21 = dynamicChannelBuffer17.capacity();
        dynamicChannelBuffer17.writerIndex((int) (short) 0);
        dynamicChannelBuffer17.markReaderIndex();
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 1, (int) (byte) 10);
        java.io.InputStream inputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = dynamicChannelBuffer17.writeBytes(inputStream28, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            byte byte3 = dynamicChannelBuffer1.getByte(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        java.nio.charset.Charset charset23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dynamicChannelBuffer1.toString(charset23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 100, (int) '\000', (int) (short) 66, (int) '\000', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (-1), (int) (byte) 100, 4376576, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer3.readSlice(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer3.slice(1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        java.nio.ByteBuffer byteBuffer2 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.bytesBefore((int) (short) 66, channelBufferIndexFinder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer1.writeChar((int) (short) 10);
        java.nio.channels.GatheringByteChannel gatheringByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.getBytes((int) (byte) 100, gatheringByteChannel5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeMedium(35);
        dynamicChannelBuffer1.writeByte((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.duplicate();
        int int13 = dynamicChannelBuffer9.capacity();
        dynamicChannelBuffer9.writerIndex((int) (short) 0);
        dynamicChannelBuffer9.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) '4', (int) (byte) 1, 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (10) must be equal to or greater than lengthFieldOffset (52) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', (int) (short) 1, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext6, exceptionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        dynamicChannelBuffer13.setZero(10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.writerIndex(4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        boolean boolean9 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.readBytes(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        dynamicChannelBuffer13.discardReadBytes();
        int int15 = dynamicChannelBuffer13.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer13.getUnsignedShort((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        dynamicChannelBuffer1.writeFloat(1.0f);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.setBytes((int) '\000', scatteringByteChannel5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer24.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer24.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer32.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer30.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        java.lang.String str36 = dynamicChannelBuffer30.toString();
        java.nio.ByteBuffer byteBuffer37 = dynamicChannelBuffer30.toByteBuffer();
        dynamicChannelBuffer24.getBytes(4, byteBuffer37);
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer24.toByteBuffer();
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer43 = dynamicChannelBuffer24.copy(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer24.setInt((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str36, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(channelBuffer43);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer42.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44);
        byte byte49 = dynamicChannelBuffer42.getByte((int) ' ');
        java.nio.ByteOrder byteOrder50 = dynamicChannelBuffer42.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer59.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer62 = dynamicChannelBuffer59.duplicate();
        int int63 = dynamicChannelBuffer59.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory64 = dynamicChannelBuffer59.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer65 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, (int) (short) 1, channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer66 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer71.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer69.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer71);
        byte byte76 = dynamicChannelBuffer69.getByte((int) ' ');
        java.nio.ByteOrder byteOrder77 = dynamicChannelBuffer69.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer79 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer81 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer84 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer84.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer87 = dynamicChannelBuffer84.duplicate();
        int int88 = dynamicChannelBuffer84.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory89 = dynamicChannelBuffer84.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer90 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 52, channelBufferFactory89);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer91 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) ' ', channelBufferFactory89);
        // The following exception was thrown during execution in test generation
        try {
            float float92 = dynamicChannelBuffer91.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 0 + "'", byte49 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNotNull(channelBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory64);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 0 + "'", byte76 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder77);
        org.junit.Assert.assertNotNull(channelBuffer87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory89);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer18.duplicate();
        int int22 = dynamicChannelBuffer18.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer18.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 1, channelBufferFactory23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer24.setInt((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 1, (int) '\000', 4, 4376576, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 1, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 66");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        int int22 = dynamicChannelBuffer6.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int25 = dynamicChannelBuffer24.capacity();
        short short27 = dynamicChannelBuffer24.getUnsignedByte((int) (byte) 10);
        dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, (int) '\000');
        java.io.OutputStream outputStream31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.getBytes(0, outputStream31, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer24.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer24.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer32.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer30.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        java.lang.String str36 = dynamicChannelBuffer30.toString();
        java.nio.ByteBuffer byteBuffer37 = dynamicChannelBuffer30.toByteBuffer();
        dynamicChannelBuffer24.getBytes(4, byteBuffer37);
        java.nio.ByteBuffer byteBuffer39 = dynamicChannelBuffer24.toByteBuffer();
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer43 = dynamicChannelBuffer24.copy(0, (int) (byte) 0);
        dynamicChannelBuffer24.markWriterIndex();
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str36, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(byteBuffer39);
        org.junit.Assert.assertNotNull(channelBuffer43);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = dynamicChannelBuffer15.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        dynamicChannelBuffer1.setBoolean((int) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((-1), 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte byte25 = dynamicChannelBuffer18.getByte((int) ' ');
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 10);
        int int33 = dynamicChannelBuffer32.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer32.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer38.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte byte45 = dynamicChannelBuffer38.getByte((int) ' ');
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer38.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 10);
        int int53 = dynamicChannelBuffer52.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer52.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10, channelBufferFactory54);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int59 = dynamicChannelBuffer55.setBytes((int) (short) 10, scatteringByteChannel57, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer1.toByteBuffer();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.setBytes(0, inputStream8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer3.readSlice(0);
        dynamicChannelBuffer3.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer3.getUnsignedShort((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            byte byte2 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) '4', 0, 4376576, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer8.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer8.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer13);
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(byteBuffer15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(35, (int) '4', (int) (short) 100, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, 10, (int) (short) 1, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (5) must be equal to or greater than lengthFieldOffset (10) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        dynamicChannelBuffer1.setDouble(0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray14 = dynamicChannelBuffer1.toByteBuffers(4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        int int8 = dynamicChannelBuffer1.indexOf(0, 0, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.readBytes(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 52, channelBufferFactory32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 100, channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer38.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte byte45 = dynamicChannelBuffer38.getByte((int) ' ');
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer38.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 10);
        int int53 = dynamicChannelBuffer52.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer52.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 0, channelBufferFactory54);
        // The following exception was thrown during execution in test generation
        try {
            long long57 = dynamicChannelBuffer55.getLong((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer10.writeLong((long) (short) 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        int int16 = dynamicChannelBuffer10.indexOf((int) (byte) -1, (int) (byte) 0, channelBufferIndexFinder15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer19.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer19.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        java.lang.String str31 = dynamicChannelBuffer25.toString();
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer25.toByteBuffer();
        dynamicChannelBuffer19.getBytes(4, byteBuffer32);
        java.nio.ByteBuffer byteBuffer34 = dynamicChannelBuffer19.toByteBuffer();
        dynamicChannelBuffer10.getBytes(1, byteBuffer34);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str31, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertNotNull(byteBuffer34);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = dynamicChannelBuffer1.getDouble(4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4376576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        dynamicChannelBuffer1.writeLong((long) 52);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer1.copy((int) '\000', (int) (byte) 0);
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        dynamicChannelBuffer13.discardReadBytes();
        byte[] byteArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.writeBytes(byteArray15, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        dynamicChannelBuffer11.writeDouble((double) 4);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray23);
        java.io.OutputStream outputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.readBytes(outputStream25, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 35, 64, 16, 0, 0]");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 100, 35, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        byte byte15 = dynamicChannelBuffer11.getByte(4);
        int int16 = dynamicChannelBuffer11.readUnsignedMedium();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer11.setBytes((int) (short) 66, scatteringByteChannel18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        dynamicChannelBuffer1.writeFloat(1.0f);
        dynamicChannelBuffer1.writeInt((int) ' ');
        int int8 = dynamicChannelBuffer1.bytesBefore((int) (short) 1, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer3.readSlice(0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dynamicChannelBuffer3.getUnsignedInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        dynamicChannelBuffer11.writeDouble((double) 4);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray23);
        dynamicChannelBuffer11.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int30 = dynamicChannelBuffer29.capacity();
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer29.writeBytes(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.setBytes((int) (short) 0, byteArray37, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 35, 64, 16, 0, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            short short14 = dynamicChannelBuffer6.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int9 = dynamicChannelBuffer8.capacity();
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer8.writeBytes(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray16, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer17.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = dynamicChannelBuffer17.duplicate();
        int int21 = dynamicChannelBuffer17.capacity();
        dynamicChannelBuffer17.writerIndex((int) (short) 0);
        dynamicChannelBuffer17.markReaderIndex();
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 1, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer32.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer30.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        dynamicChannelBuffer30.writeBoolean(false);
        dynamicChannelBuffer30.setShort((int) (short) 10, 0);
        byte byte42 = dynamicChannelBuffer30.getByte((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 0 + "'", byte42 == (byte) 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int15 = dynamicChannelBuffer14.capacity();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.getBytes((int) (short) -1, byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, 4, 4, 4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (5) must be equal to or greater than lengthFieldOffset (4) + lengthFieldLength (4).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 52, 4376576, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 4376576");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, (int) (short) 100, (int) ' ', 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        dynamicChannelBuffer11.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 0, (int) (byte) 10);
        long long25 = dynamicChannelBuffer11.getUnsignedInt(10);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer6.setBytes(4, byteArray31);
        dynamicChannelBuffer1.getBytes((int) (byte) 10, byteArray31);
        java.nio.channels.GatheringByteChannel gatheringByteChannel35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = dynamicChannelBuffer1.getBytes((int) '\000', gatheringByteChannel35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) 'a');
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((-1), outputStream3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeChar(52);
        dynamicChannelBuffer1.writeInt((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer42.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44);
        byte byte49 = dynamicChannelBuffer42.getByte((int) ' ');
        java.nio.ByteOrder byteOrder50 = dynamicChannelBuffer42.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer59.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer62 = dynamicChannelBuffer59.duplicate();
        int int63 = dynamicChannelBuffer59.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory64 = dynamicChannelBuffer59.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer65 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, (int) (short) 1, channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer66 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer71.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer69.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer71);
        byte byte76 = dynamicChannelBuffer69.getByte((int) ' ');
        java.nio.ByteOrder byteOrder77 = dynamicChannelBuffer69.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer79 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer81 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer84 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer84.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer87 = dynamicChannelBuffer84.duplicate();
        int int88 = dynamicChannelBuffer84.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory89 = dynamicChannelBuffer84.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer90 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 52, channelBufferFactory89);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer91 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) ' ', channelBufferFactory89);
        dynamicChannelBuffer91.setFloat(1, (float) (-1));
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 0 + "'", byte49 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNotNull(channelBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory64);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 0 + "'", byte76 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder77);
        org.junit.Assert.assertNotNull(channelBuffer87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory89);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        short short9 = dynamicChannelBuffer1.getUnsignedByte((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer21.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer21.duplicate();
        int int25 = dynamicChannelBuffer21.capacity();
        dynamicChannelBuffer16.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, 0, (int) (byte) 10);
        long long30 = dynamicChannelBuffer16.getUnsignedInt(10);
        dynamicChannelBuffer11.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer11.setBytes(4, byteArray36);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[10, -1, 0]");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            float float3 = dynamicChannelBuffer1.getFloat((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 52, 0, (int) (short) 66, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        int int8 = dynamicChannelBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.getUnsignedMedium((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        boolean boolean4 = dynamicChannelBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.slice((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4376576, (int) (short) 10, 4, (int) ' ', 4);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.MessageEvent messageEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext6, messageEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setBoolean(4, true);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        dynamicChannelBuffer1.setLong((int) (byte) 0, (long) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer21.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer19.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21);
        dynamicChannelBuffer19.writeBoolean(false);
        dynamicChannelBuffer19.setShort((int) (short) 10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        dynamicChannelBuffer31.writerIndex((int) (short) 0);
        dynamicChannelBuffer31.markReaderIndex();
        dynamicChannelBuffer19.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31, 1);
        dynamicChannelBuffer1.getBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31, 1);
        java.io.OutputStream outputStream44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer31.getBytes((int) (byte) 100, outputStream44, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte byte25 = dynamicChannelBuffer18.getByte((int) ' ');
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 10);
        int int33 = dynamicChannelBuffer32.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer32.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer38.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte byte45 = dynamicChannelBuffer38.getByte((int) ' ');
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer38.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 10);
        int int53 = dynamicChannelBuffer52.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer52.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10, channelBufferFactory54);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer57 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer57.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer60 = dynamicChannelBuffer57.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer62.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer67 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer67.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer70 = dynamicChannelBuffer67.duplicate();
        int int71 = dynamicChannelBuffer67.capacity();
        dynamicChannelBuffer62.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer67, 0, (int) (byte) 10);
        long long76 = dynamicChannelBuffer62.getUnsignedInt(10);
        dynamicChannelBuffer57.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer62);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer55.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer62, (int) (byte) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
        org.junit.Assert.assertNotNull(channelBuffer60);
        org.junit.Assert.assertNotNull(channelBuffer70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 35 + "'", int71 == 35);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.setChar((int) (byte) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte byte25 = dynamicChannelBuffer18.getByte((int) ' ');
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 10);
        int int33 = dynamicChannelBuffer32.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer32.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer38.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte byte45 = dynamicChannelBuffer38.getByte((int) ' ');
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer38.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 10);
        int int53 = dynamicChannelBuffer52.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer52.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10, channelBufferFactory54);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = dynamicChannelBuffer55.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        short short7 = dynamicChannelBuffer1.readUnsignedByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        dynamicChannelBuffer10.writeMedium(35);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 66, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 4376576, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 66 + "'", short7 == (short) 66);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeFloat((float) 52);
        dynamicChannelBuffer15.writeShort((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        dynamicChannelBuffer22.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27, 0, (int) (byte) 10);
        int int36 = dynamicChannelBuffer27.getMedium(1);
        dynamicChannelBuffer27.markWriterIndex();
        byte[] byteArray38 = dynamicChannelBuffer27.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        dynamicChannelBuffer22.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 5, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setIndex((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBuffer28);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (5) must be equal to or greater than lengthFieldOffset (10) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, (int) '\000', (int) ' ', (int) (short) 1, 4376576, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dynamicChannelBuffer1.getBoolean((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer49.writeLong((long) (short) 1);
        java.nio.ByteBuffer[] byteBufferArray52 = dynamicChannelBuffer49.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer46.setBytes(100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer49, (int) '4', 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertNotNull(byteBufferArray52);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        byte byte11 = dynamicChannelBuffer4.getByte((int) ' ');
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer4.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer43 = dynamicChannelBuffer40.duplicate();
        int int44 = dynamicChannelBuffer40.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory45 = dynamicChannelBuffer40.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, (int) (short) 1, channelBufferFactory45);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 1, channelBufferFactory45);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertNotNull(channelBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory45);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        java.nio.ByteBuffer byteBuffer17 = dynamicChannelBuffer15.toByteBuffer();
        java.io.InputStream inputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer15.writeBytes(inputStream18, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(byteBuffer17);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        int int23 = dynamicChannelBuffer10.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer10.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        boolean boolean11 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 0, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer5.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer3.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        byte byte10 = dynamicChannelBuffer3.getByte((int) ' ');
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer3.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte byte25 = dynamicChannelBuffer18.getByte((int) ' ');
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer33.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer36 = dynamicChannelBuffer33.duplicate();
        int int37 = dynamicChannelBuffer33.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 52, channelBufferFactory38);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory40 = dynamicChannelBuffer39.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, 0, channelBufferFactory40);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer46.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer44.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer46);
        byte byte51 = dynamicChannelBuffer44.getByte((int) ' ');
        java.nio.ByteOrder byteOrder52 = dynamicChannelBuffer44.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder52, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder52, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer58 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder52, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer61 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer61.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer64 = dynamicChannelBuffer61.duplicate();
        int int65 = dynamicChannelBuffer61.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory66 = dynamicChannelBuffer61.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer67 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder52, (int) (short) 1, channelBufferFactory66);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer68 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) '#', channelBufferFactory66);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 10, channelBufferFactory66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNotNull(channelBuffer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertNotNull(channelBufferFactory40);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) 0 + "'", byte51 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder52);
        org.junit.Assert.assertNotNull(channelBuffer64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 35 + "'", int65 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory66);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (-1), (int) (short) -1, 5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 100, 0, (int) ' ', 4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        dynamicChannelBuffer1.writeFloat(1.0f);
        dynamicChannelBuffer1.writeInt((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.getInt(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        dynamicChannelBuffer1.writeMedium(35);
        dynamicChannelBuffer1.writeByte((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setZero(35, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        int int16 = dynamicChannelBuffer1.readerIndex();
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(2, byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel3, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', (int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 100, 2, 52, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (10) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (2).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            char char9 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar(4376576, 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4376576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray19 = dynamicChannelBuffer1.toByteBuffers(4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer50 = dynamicChannelBuffer48.readBytes((int) '\000');
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertNotNull(channelBuffer50);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (short) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 100);
        float float17 = dynamicChannelBuffer15.getFloat((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dynamicChannelBuffer15.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 2, (int) (byte) 10, (int) (short) 100, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer29.duplicate();
        int int33 = dynamicChannelBuffer29.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer29.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) '#', channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory34);
        java.io.OutputStream outputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer36.getBytes((int) '\000', outputStream38, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(52);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.writeBytes(inputStream2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        dynamicChannelBuffer11.setShort((int) (short) 1, (int) '4');
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer11.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dynamicChannelBuffer11.getLong(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        byte byte15 = dynamicChannelBuffer11.getByte(4);
        int int16 = dynamicChannelBuffer11.readUnsignedMedium();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer21.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer19.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21);
        byte byte26 = dynamicChannelBuffer19.getByte((int) ' ');
        java.nio.ByteOrder byteOrder27 = dynamicChannelBuffer19.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder27, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder32 = null;
        int int33 = dynamicChannelBuffer29.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder32);
        dynamicChannelBuffer29.setShort((int) (short) 1, (int) '4');
        java.nio.ByteBuffer byteBuffer37 = dynamicChannelBuffer29.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte41 = dynamicChannelBuffer39.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer47 = dynamicChannelBuffer44.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer49.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer54.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer57 = dynamicChannelBuffer54.duplicate();
        int int58 = dynamicChannelBuffer54.capacity();
        dynamicChannelBuffer49.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer54, 0, (int) (byte) 10);
        long long63 = dynamicChannelBuffer49.getUnsignedInt(10);
        dynamicChannelBuffer44.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer49);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer44.setBytes(4, byteArray69);
        dynamicChannelBuffer39.getBytes((int) (byte) 10, byteArray69);
        dynamicChannelBuffer29.writeBytes(byteArray69);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.setBytes(4, byteArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer47);
        org.junit.Assert.assertNotNull(channelBuffer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[0, 0, 0]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.setShort((int) (short) 10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer13.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer13.duplicate();
        int int17 = dynamicChannelBuffer13.capacity();
        dynamicChannelBuffer13.writerIndex((int) (short) 0);
        dynamicChannelBuffer13.markReaderIndex();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer26.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer24.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26);
        byte byte31 = dynamicChannelBuffer24.getByte((int) ' ');
        java.nio.ByteOrder byteOrder32 = dynamicChannelBuffer24.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder32, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder32, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder32, 10);
        int int39 = dynamicChannelBuffer38.writableBytes();
        dynamicChannelBuffer38.writeFloat((float) 52);
        dynamicChannelBuffer38.writeFloat(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.writerIndex();
        int int3 = dynamicChannelBuffer1.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean(52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) ' ');
        dynamicChannelBuffer1.resetWriterIndex();
        int int10 = dynamicChannelBuffer1.bytesBefore(0, (int) (short) 1, (byte) 0);
        dynamicChannelBuffer1.setZero(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer22.writeBytes(scatteringByteChannel23, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) 10, (int) (byte) -1, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 32, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer42.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44);
        byte byte49 = dynamicChannelBuffer42.getByte((int) ' ');
        java.nio.ByteOrder byteOrder50 = dynamicChannelBuffer42.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer59.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer62 = dynamicChannelBuffer59.duplicate();
        int int63 = dynamicChannelBuffer59.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory64 = dynamicChannelBuffer59.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer65 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, (int) (short) 1, channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer66 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer71.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer69.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer71);
        byte byte76 = dynamicChannelBuffer69.getByte((int) ' ');
        java.nio.ByteOrder byteOrder77 = dynamicChannelBuffer69.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer79 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer81 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer84 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer84.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer87 = dynamicChannelBuffer84.duplicate();
        int int88 = dynamicChannelBuffer84.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory89 = dynamicChannelBuffer84.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer90 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 52, channelBufferFactory89);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer91 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) ' ', channelBufferFactory89);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer93 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0);
        java.lang.Class<?> wildcardClass94 = byteOrder9.getClass();
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 0 + "'", byte49 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNotNull(channelBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory64);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 0 + "'", byte76 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder77);
        org.junit.Assert.assertNotNull(channelBuffer87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory89);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 52, channelBufferFactory32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 100, channelBufferFactory34);
        dynamicChannelBuffer35.writeInt((int) '#');
        long long39 = dynamicChannelBuffer35.getLong(1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 38482906972160L + "'", long39 == 38482906972160L);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer38.duplicate();
        int int42 = dynamicChannelBuffer38.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory43 = dynamicChannelBuffer38.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 52, channelBufferFactory43);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory45 = dynamicChannelBuffer44.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 10, channelBufferFactory45);
        int int47 = dynamicChannelBuffer46.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer46.readerIndex((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory43);
        org.junit.Assert.assertNotNull(channelBufferFactory45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        dynamicChannelBuffer1.writeInt(0);
        boolean boolean18 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer1.slice((int) (byte) -1, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) '4', 52, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        dynamicChannelBuffer11.writeDouble((double) 4);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray23);
        dynamicChannelBuffer11.writeBoolean(false);
        java.nio.channels.GatheringByteChannel gatheringByteChannel28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = dynamicChannelBuffer11.getBytes(10, gatheringByteChannel28, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 35, 64, 16, 0, 0]");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 66, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 1, (int) (short) -1, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 32, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        dynamicChannelBuffer1.writeLong((long) 52);
        java.nio.charset.Charset charset25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dynamicChannelBuffer1.toString(charset25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore((int) (byte) -1, (int) ' ', channelBufferIndexFinder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer5.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer3.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        byte byte10 = dynamicChannelBuffer3.getByte((int) ' ');
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer3.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        dynamicChannelBuffer1.setDouble((int) (short) 0, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer15.indexOf((int) (byte) 0, (int) (short) 10, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeFloat((float) 52);
        dynamicChannelBuffer15.markReaderIndex();
        java.nio.channels.GatheringByteChannel gatheringByteChannel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer15.readBytes(gatheringByteChannel20, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 32, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 35, (int) '\000', 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(2, 4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.writeInt(0);
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        dynamicChannelBuffer11.writeMedium(35);
        dynamicChannelBuffer11.writeDouble((double) 4);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer11.indexOf(17096, (-1), channelBufferIndexFinder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        dynamicChannelBuffer1.setBoolean((int) ' ', false);
        byte byte7 = dynamicChannelBuffer1.readByte();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer22.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        int int3 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int7 = dynamicChannelBuffer6.capacity();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer6.writeBytes(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(4376576, byteArray14, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 1, 0, 100, 1, 1]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        short short7 = dynamicChannelBuffer1.readUnsignedByte();
        int int8 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 66 + "'", short7 == (short) 66);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        int int8 = dynamicChannelBuffer1.indexOf(0, 0, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            float float10 = dynamicChannelBuffer1.getFloat((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 35, 4376576, 4376576, (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer6.writeBoolean(true);
        byte byte12 = dynamicChannelBuffer6.getByte(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(35, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        int int25 = dynamicChannelBuffer6.bytesBefore((int) (byte) 10, (int) (short) 0, (byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer6.factory();
        int int28 = dynamicChannelBuffer6.getUnsignedShort((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.readBytes(channelBuffer29, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer17.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        dynamicChannelBuffer4.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer15.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer13.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        dynamicChannelBuffer13.writeBoolean(false);
        dynamicChannelBuffer13.setShort((int) (short) 10, 0);
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer35.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer33.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35);
        java.lang.String str39 = dynamicChannelBuffer33.toString();
        java.nio.ByteBuffer byteBuffer40 = dynamicChannelBuffer33.toByteBuffer();
        dynamicChannelBuffer27.getBytes(4, byteBuffer40);
        java.nio.ByteBuffer byteBuffer42 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer13.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer45.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer50.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer53 = dynamicChannelBuffer50.duplicate();
        int int54 = dynamicChannelBuffer50.capacity();
        dynamicChannelBuffer45.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer50, 0, (int) (byte) 10);
        dynamicChannelBuffer45.setLong((int) (byte) 0, (long) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer63 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer65 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer65.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer63.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer65);
        dynamicChannelBuffer63.writeBoolean(false);
        dynamicChannelBuffer63.setShort((int) (short) 10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer75 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer75.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer78 = dynamicChannelBuffer75.duplicate();
        int int79 = dynamicChannelBuffer75.capacity();
        dynamicChannelBuffer75.writerIndex((int) (short) 0);
        dynamicChannelBuffer75.markReaderIndex();
        dynamicChannelBuffer63.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer75, 1);
        dynamicChannelBuffer45.getBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer75, 1);
        boolean boolean87 = dynamicChannelBuffer27.equals((java.lang.Object) dynamicChannelBuffer75);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str39, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertNotNull(channelBuffer53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(channelBuffer78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 35 + "'", int79 == 35);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 32, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        dynamicChannelBuffer1.setDouble((int) (short) 0, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer17.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer17.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        java.lang.String str29 = dynamicChannelBuffer23.toString();
        java.nio.ByteBuffer byteBuffer30 = dynamicChannelBuffer23.toByteBuffer();
        dynamicChannelBuffer17.getBytes(4, byteBuffer30);
        dynamicChannelBuffer1.readBytes(byteBuffer30);
        int int33 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer36.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38);
        java.lang.String str42 = dynamicChannelBuffer36.toString();
        java.nio.ByteBuffer byteBuffer43 = dynamicChannelBuffer36.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36, 17096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str29, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str42, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer43);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        dynamicChannelBuffer15.writeMedium((-1));
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = dynamicChannelBuffer15.getByte((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        dynamicChannelBuffer11.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 0, (int) (byte) 10);
        long long25 = dynamicChannelBuffer11.getUnsignedInt(10);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer6.setBytes(4, byteArray31);
        dynamicChannelBuffer1.getBytes((int) (byte) 10, byteArray31);
        java.nio.channels.GatheringByteChannel gatheringByteChannel34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = dynamicChannelBuffer1.readBytes(gatheringByteChannel34, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0, 0]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        dynamicChannelBuffer1.setBoolean((int) ' ', false);
        byte byte7 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte12 = dynamicChannelBuffer10.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer15.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer15.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        int int29 = dynamicChannelBuffer25.capacity();
        dynamicChannelBuffer20.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 0, (int) (byte) 10);
        long long34 = dynamicChannelBuffer20.getUnsignedInt(10);
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer15.setBytes(4, byteArray40);
        dynamicChannelBuffer10.getBytes((int) (byte) 10, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(0, byteArray40, 2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 0]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (byte) 10, (int) (short) 10, (int) 'a', 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 100);
        float float17 = dynamicChannelBuffer15.getFloat((int) (short) 10);
        int int19 = dynamicChannelBuffer15.getInt((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int22 = dynamicChannelBuffer21.writerIndex();
        int int23 = dynamicChannelBuffer21.arrayOffset();
        dynamicChannelBuffer21.writeFloat((float) '#');
        dynamicChannelBuffer21.setShort((int) (byte) 0, 4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, 2560, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        int int22 = dynamicChannelBuffer6.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int25 = dynamicChannelBuffer24.capacity();
        short short27 = dynamicChannelBuffer24.getUnsignedByte((int) (byte) 10);
        dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, (int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            short short30 = dynamicChannelBuffer6.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 32, 2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 100);
        float float17 = dynamicChannelBuffer15.getFloat((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setShort((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.slice();
        dynamicChannelBuffer3.writeShort((int) (short) 10);
        java.nio.ByteBuffer[] byteBufferArray10 = dynamicChannelBuffer3.toByteBuffers();
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertNotNull(byteBufferArray10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer29.duplicate();
        int int33 = dynamicChannelBuffer29.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer29.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) '#', channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory34);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer36.setInt((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        dynamicChannelBuffer1.setLong((int) (byte) 0, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = dynamicChannelBuffer1.getByte(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        dynamicChannelBuffer11.setShort((int) (short) 1, (int) '4');
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer11.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer22.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer27 = dynamicChannelBuffer22.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer22.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer33.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer31.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
        byte byte38 = dynamicChannelBuffer31.getByte((int) ' ');
        java.nio.ByteOrder byteOrder39 = dynamicChannelBuffer31.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder39, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder39, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder39, 10);
        int int46 = dynamicChannelBuffer45.writableBytes();
        java.nio.ByteBuffer byteBuffer47 = dynamicChannelBuffer45.toByteBuffer();
        dynamicChannelBuffer22.setBytes(10, byteBuffer47);
        dynamicChannelBuffer11.getBytes((int) (short) 1, byteBuffer47);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer52.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer52.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer57 = dynamicChannelBuffer52.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer58 = dynamicChannelBuffer52.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.getBytes(100, channelBuffer58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 0 + "'", byte38 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(byteBuffer47);
        org.junit.Assert.assertNotNull(byteBuffer57);
        org.junit.Assert.assertNotNull(channelBuffer58);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        dynamicChannelBuffer1.writeLong((long) 52);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer1.copy((int) '\000', (int) (byte) 0);
        dynamicChannelBuffer1.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer1.slice(32, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        short short7 = dynamicChannelBuffer1.readUnsignedByte();
        int int9 = dynamicChannelBuffer1.getUnsignedShort(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.readBytes(17096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 66 + "'", short7 == (short) 66);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17096 + "'", int9 == 17096);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer6.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        byte byte13 = dynamicChannelBuffer6.getByte((int) ' ');
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer6.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer23.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer21.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        byte byte28 = dynamicChannelBuffer21.getByte((int) ' ');
        java.nio.ByteOrder byteOrder29 = dynamicChannelBuffer21.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder29, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer34.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer37 = dynamicChannelBuffer34.duplicate();
        int int38 = dynamicChannelBuffer34.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory39 = dynamicChannelBuffer34.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder29, (int) '#', channelBufferFactory39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, 1, channelBufferFactory39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 0 + "'", byte28 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertNotNull(channelBuffer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory39);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        dynamicChannelBuffer22.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 5, 5);
        dynamicChannelBuffer25.writeLong(1L);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBuffer28);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 35, 35, (int) (byte) -1, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 100, 5, (int) (short) 66, (int) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        dynamicChannelBuffer1.writeFloat(1.0f);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer3.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer10.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer15.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer15.duplicate();
        int int19 = dynamicChannelBuffer15.capacity();
        dynamicChannelBuffer10.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 0, (int) (byte) 10);
        long long24 = dynamicChannelBuffer10.getUnsignedInt(10);
        int int25 = dynamicChannelBuffer10.readerIndex();
        java.nio.ByteBuffer byteBuffer26 = dynamicChannelBuffer10.toByteBuffer();
        dynamicChannelBuffer3.setBytes(35, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer3.toString(charset28);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.setBoolean((int) (short) 66, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuffer26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer3.readSlice(0);
        boolean boolean9 = dynamicChannelBuffer3.writable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer18.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer23 = dynamicChannelBuffer18.toByteBuffer();
        dynamicChannelBuffer11.getBytes(4, byteBuffer23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        byte byte34 = dynamicChannelBuffer27.getByte((int) ' ');
        java.nio.ByteOrder byteOrder35 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder35, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder35, (int) (short) 100);
        dynamicChannelBuffer39.discardReadBytes();
        dynamicChannelBuffer11.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39, (int) '\000', 1);
        dynamicChannelBuffer11.setDouble(10, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(byteBuffer23);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder35);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        dynamicChannelBuffer22.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 5, 5);
        dynamicChannelBuffer22.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(35);
        java.nio.ByteBuffer[] byteBufferArray37 = dynamicChannelBuffer36.toByteBuffers();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer39.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer47 = dynamicChannelBuffer44.duplicate();
        int int48 = dynamicChannelBuffer44.capacity();
        dynamicChannelBuffer39.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44, 0, (int) (byte) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer54 = dynamicChannelBuffer39.slice((int) (byte) 10, (int) (short) 1);
        int int55 = dynamicChannelBuffer39.readableBytes();
        int int56 = dynamicChannelBuffer36.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.getBytes(1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39, 9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertNotNull(byteBufferArray37);
        org.junit.Assert.assertNotNull(channelBuffer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(channelBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer2, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer18.duplicate();
        int int22 = dynamicChannelBuffer18.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer18.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 1, channelBufferFactory23);
        dynamicChannelBuffer24.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = dynamicChannelBuffer24.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer42.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44);
        byte byte49 = dynamicChannelBuffer42.getByte((int) ' ');
        java.nio.ByteOrder byteOrder50 = dynamicChannelBuffer42.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer59.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer62 = dynamicChannelBuffer59.duplicate();
        int int63 = dynamicChannelBuffer59.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory64 = dynamicChannelBuffer59.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer65 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, (int) (short) 1, channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer66 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory64);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer71.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer69.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer71);
        byte byte76 = dynamicChannelBuffer69.getByte((int) ' ');
        java.nio.ByteOrder byteOrder77 = dynamicChannelBuffer69.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer79 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer81 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer84 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer84.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer87 = dynamicChannelBuffer84.duplicate();
        int int88 = dynamicChannelBuffer84.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory89 = dynamicChannelBuffer84.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer90 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder77, 52, channelBufferFactory89);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer91 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) ' ', channelBufferFactory89);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer93 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double94 = dynamicChannelBuffer93.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 0 + "'", byte49 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertNotNull(channelBuffer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory64);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 0 + "'", byte76 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder77);
        org.junit.Assert.assertNotNull(channelBuffer87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 35 + "'", int88 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory89);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(17096, (int) (short) 100, 4376576, 17096, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 4376576");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        dynamicChannelBuffer15.writeMedium((-1));
        java.nio.channels.ScatteringByteChannel scatteringByteChannel19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer15.setBytes((-1), scatteringByteChannel19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        dynamicChannelBuffer22.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 5, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setIndex(32, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBuffer28);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        java.nio.ByteBuffer byteBuffer2 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(9, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeFloat((float) 52);
        dynamicChannelBuffer15.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer15.getInt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        short short3 = dynamicChannelBuffer1.getUnsignedByte(0);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = dynamicChannelBuffer1.toByteBuffer((int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 0);
        int int51 = dynamicChannelBuffer50.writerIndex();
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        dynamicChannelBuffer11.setShort((int) (short) 1, (int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer11.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.setChar((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer19);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        boolean boolean19 = dynamicChannelBuffer17.getBoolean((int) (short) 1);
        int int21 = dynamicChannelBuffer17.bytesBefore((byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte25 = dynamicChannelBuffer23.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer28.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer28.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer33.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer38.duplicate();
        int int42 = dynamicChannelBuffer38.capacity();
        dynamicChannelBuffer33.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38, 0, (int) (byte) 10);
        long long47 = dynamicChannelBuffer33.getUnsignedInt(10);
        dynamicChannelBuffer28.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer28.setBytes(4, byteArray53);
        dynamicChannelBuffer23.getBytes((int) (byte) 10, byteArray53);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.readBytes(byteArray53, (int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer31);
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[0, 0, 0]");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        dynamicChannelBuffer22.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 5, 5);
        dynamicChannelBuffer25.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer25.skipBytes(17096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBuffer28);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 52, channelBufferFactory32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 100, channelBufferFactory34);
        dynamicChannelBuffer35.writeInt((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer35.readBytes((int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        boolean boolean19 = dynamicChannelBuffer17.getBoolean((int) (short) 1);
        int int21 = dynamicChannelBuffer17.bytesBefore((byte) 100);
        int int22 = dynamicChannelBuffer17.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = dynamicChannelBuffer17.getDouble(4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4376576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer8.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer8.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer19.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer17.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        byte byte24 = dynamicChannelBuffer17.getByte((int) ' ');
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer17.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder25, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder25, (int) (short) 100);
        dynamicChannelBuffer29.discardReadBytes();
        dynamicChannelBuffer1.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, (int) '\000', 1);
        java.io.OutputStream outputStream34 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer29.readBytes(outputStream34, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder25);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer39.setChar(1, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0);
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer13.writeBytes(inputStream14, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(17096, (int) (byte) 1, 0, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        dynamicChannelBuffer10.writeBoolean(false);
        dynamicChannelBuffer10.setShort((int) (short) 10, 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        int int31 = dynamicChannelBuffer25.indexOf((int) '4', 0, (byte) -1);
        char char33 = dynamicChannelBuffer25.getChar(0);
        byte[] byteArray34 = dynamicChannelBuffer25.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '\000' + "'", char33 == '\000');
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 32, 2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream2, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer9.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer7.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        java.lang.String str13 = dynamicChannelBuffer7.toString();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer7.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer14);
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) '4', 17096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=35)" + "'", str13, "DynamicChannelBuffer(ridx=0, widx=0, cap=35)");
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(byteBuffer16);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        boolean boolean19 = dynamicChannelBuffer17.getBoolean((int) (short) 1);
        int int21 = dynamicChannelBuffer17.bytesBefore((byte) 100);
        int int22 = dynamicChannelBuffer17.readableBytes();
        dynamicChannelBuffer17.setDouble(0, (double) '4');
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        dynamicChannelBuffer22.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 5, 5);
        dynamicChannelBuffer22.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer36.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer36.duplicate();
        int int40 = dynamicChannelBuffer36.capacity();
        dynamicChannelBuffer36.writerIndex((int) (short) 0);
        dynamicChannelBuffer36.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.getBytes(4376576, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertNotNull(channelBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer15.getBytes((int) (short) 66, gatheringByteChannel17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 4376576, 0, (int) (byte) -1, (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer38.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte byte45 = dynamicChannelBuffer38.getByte((int) ' ');
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer38.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer53 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer53.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer56 = dynamicChannelBuffer53.duplicate();
        int int57 = dynamicChannelBuffer53.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory58 = dynamicChannelBuffer53.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 52, channelBufferFactory58);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory60 = dynamicChannelBuffer59.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer61 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 0, channelBufferFactory60);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (-1), channelBufferFactory60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertNotNull(channelBuffer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory58);
        org.junit.Assert.assertNotNull(channelBufferFactory60);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', (int) (byte) 0, 0, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.writeByte(100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer6.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        byte byte16 = dynamicChannelBuffer9.getByte((int) ' ');
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 10);
        int int24 = dynamicChannelBuffer23.writableBytes();
        java.nio.ByteBuffer byteBuffer25 = dynamicChannelBuffer23.toByteBuffer();
        dynamicChannelBuffer6.writeBytes(byteBuffer25);
        dynamicChannelBuffer1.writeBytes(byteBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(byteBuffer25);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        int int50 = dynamicChannelBuffer46.bytesBefore((int) '4', (int) (short) 10, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer46.setMedium(17096, 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17096");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        java.nio.ByteBuffer[] byteBufferArray18 = dynamicChannelBuffer15.toByteBuffers((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer20.duplicate();
        int int24 = dynamicChannelBuffer20.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer20.getBytes(4, byteBuffer32);
        dynamicChannelBuffer15.writeBytes(byteBuffer32);
        // The following exception was thrown during execution in test generation
        try {
            float float35 = dynamicChannelBuffer15.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteBufferArray18);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer5.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer3.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        byte byte10 = dynamicChannelBuffer3.getByte((int) ' ');
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer3.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, (int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.setShort((int) (short) 10, 0);
        byte byte13 = dynamicChannelBuffer1.getByte((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        dynamicChannelBuffer1.setDouble(0, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium(35, (int) (short) 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer8.setChar((int) (byte) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(4376576, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer51.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer49.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer51);
        byte byte56 = dynamicChannelBuffer49.getByte((int) ' ');
        java.nio.ByteOrder byteOrder57 = dynamicChannelBuffer49.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer62.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer65 = dynamicChannelBuffer62.duplicate();
        int int66 = dynamicChannelBuffer62.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory67 = dynamicChannelBuffer62.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer68 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, (int) '#', channelBufferFactory67);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer73 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer73.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer71.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer73);
        byte byte78 = dynamicChannelBuffer71.getByte((int) ' ');
        java.nio.ByteOrder byteOrder79 = dynamicChannelBuffer71.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer81 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder79, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer83 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder79, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer86 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer86.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer89 = dynamicChannelBuffer86.duplicate();
        int int90 = dynamicChannelBuffer86.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory91 = dynamicChannelBuffer86.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer92 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder79, 52, channelBufferFactory91);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory93 = dynamicChannelBuffer92.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer94 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, (int) (short) 10, channelBufferFactory93);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer95 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 2560, channelBufferFactory93);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 0 + "'", byte56 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNotNull(channelBuffer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory67);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 0 + "'", byte78 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder79);
        org.junit.Assert.assertNotNull(channelBuffer89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 35 + "'", int90 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory91);
        org.junit.Assert.assertNotNull(channelBufferFactory93);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 66);
        dynamicChannelBuffer1.setFloat(0, (float) (byte) 0);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\000', outputStream6, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) -1, (int) (short) 1, (int) (byte) -1, 17096, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 100, (int) (short) 100, 9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer11.slice();
        dynamicChannelBuffer11.writeShort((int) (short) 10);
        dynamicChannelBuffer3.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int19 = dynamicChannelBuffer11.writerIndex();
        dynamicChannelBuffer11.writeShort(35);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.setIndex(4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer6.writeBytes(scatteringByteChannel14, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writeFloat((float) (short) 100);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        short short7 = dynamicChannelBuffer1.readUnsignedByte();
        int int9 = dynamicChannelBuffer1.getUnsignedShort(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer11.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            char char21 = dynamicChannelBuffer11.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 66 + "'", short7 == (short) 66);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17096 + "'", int9 == 17096);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.duplicate();
        int int15 = dynamicChannelBuffer11.capacity();
        dynamicChannelBuffer6.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, 0, (int) (byte) 10);
        long long20 = dynamicChannelBuffer6.getUnsignedInt(10);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer1.setBytes(4, byteArray26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        int int32 = dynamicChannelBuffer30.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer30.ensureWritableBytes((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, (int) (short) 1, 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, -1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.slice((int) (byte) 10, (int) (short) 1);
        int int17 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer20.duplicate();
        int int24 = dynamicChannelBuffer20.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer20.getBytes(4, byteBuffer32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer36.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38);
        byte byte43 = dynamicChannelBuffer36.getByte((int) ' ');
        java.nio.ByteOrder byteOrder44 = dynamicChannelBuffer36.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder44, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder44, (int) (short) 100);
        dynamicChannelBuffer48.discardReadBytes();
        dynamicChannelBuffer20.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48, (int) '\000', 1);
        dynamicChannelBuffer1.setBytes(9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer55.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer55.writerIndex(5);
        boolean boolean60 = dynamicChannelBuffer55.isDirect();
        dynamicChannelBuffer48.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer55);
        // The following exception was thrown during execution in test generation
        try {
            double double62 = dynamicChannelBuffer55.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 0 + "'", byte43 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBoolean(true);
        byte byte7 = dynamicChannelBuffer1.getByte(1);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = dynamicChannelBuffer1.getUnsignedByte((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        byte byte25 = dynamicChannelBuffer18.getByte((int) ' ');
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder26, 10);
        int int33 = dynamicChannelBuffer32.writableBytes();
        dynamicChannelBuffer1.setBytes((int) (byte) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32, 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer36 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer38.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte byte45 = dynamicChannelBuffer38.getByte((int) ' ');
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer38.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder46, 10);
        int int53 = dynamicChannelBuffer52.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory54 = dynamicChannelBuffer52.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer52, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(channelBuffer36);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 0 + "'", byte45 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory54);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        short short22 = dynamicChannelBuffer20.getShort(5);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 52, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 4376576);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 100);
        int int27 = dynamicChannelBuffer26.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dynamicChannelBuffer26.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer15.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer20.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer30.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer33 = dynamicChannelBuffer30.duplicate();
        int int34 = dynamicChannelBuffer30.capacity();
        dynamicChannelBuffer25.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, 0, (int) (byte) 10);
        long long39 = dynamicChannelBuffer25.getUnsignedInt(10);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte[] byteArray45 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer20.setBytes(4, byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.getBytes(10, byteArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(channelBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[10, -1, 0]");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.slice();
        dynamicChannelBuffer3.writeShort((int) (short) 10);
        byte byte10 = dynamicChannelBuffer3.readByte();
        java.nio.channels.GatheringByteChannel gatheringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer3.readBytes(gatheringByteChannel11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.slice((int) (byte) 10, (int) (short) 1);
        int int17 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer20.duplicate();
        int int24 = dynamicChannelBuffer20.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer20.getBytes(4, byteBuffer32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer36.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38);
        byte byte43 = dynamicChannelBuffer36.getByte((int) ' ');
        java.nio.ByteOrder byteOrder44 = dynamicChannelBuffer36.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder44, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder44, (int) (short) 100);
        dynamicChannelBuffer48.discardReadBytes();
        dynamicChannelBuffer20.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48, (int) '\000', 1);
        dynamicChannelBuffer1.setBytes(9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer55.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer55.writerIndex(5);
        boolean boolean60 = dynamicChannelBuffer55.isDirect();
        dynamicChannelBuffer48.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer55);
        // The following exception was thrown during execution in test generation
        try {
            char char62 = dynamicChannelBuffer55.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 0 + "'", byte43 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 100);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 66, 655360, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 655360");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 1, 100, (int) (short) -1, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(52);
        java.nio.ByteBuffer byteBuffer2 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte3 = dynamicChannelBuffer1.getByte(10);
        dynamicChannelBuffer1.setChar((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 32, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 52, channelBufferFactory32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 100, channelBufferFactory34);
        dynamicChannelBuffer35.writeInt((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer43 = dynamicChannelBuffer40.duplicate();
        int int44 = dynamicChannelBuffer40.capacity();
        dynamicChannelBuffer40.writeByte((-1));
        int int48 = dynamicChannelBuffer40.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer35.getBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertNotNull(channelBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.slice((int) (byte) 10, (int) (short) 1);
        int int17 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer20.duplicate();
        int int24 = dynamicChannelBuffer20.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer27.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer20.getBytes(4, byteBuffer32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer36.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38);
        byte byte43 = dynamicChannelBuffer36.getByte((int) ' ');
        java.nio.ByteOrder byteOrder44 = dynamicChannelBuffer36.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder44, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder44, (int) (short) 100);
        dynamicChannelBuffer48.discardReadBytes();
        dynamicChannelBuffer20.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48, (int) '\000', 1);
        dynamicChannelBuffer1.setBytes(9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = dynamicChannelBuffer48.getUnsignedMedium(655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 655360");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(byteBuffer32);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 0 + "'", byte43 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder44);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.readerIndex(4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        dynamicChannelBuffer1.setLong((int) (byte) 0, (long) (short) 100);
        java.nio.channels.GatheringByteChannel gatheringByteChannel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.getBytes(655360, gatheringByteChannel18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer11.slice();
        dynamicChannelBuffer11.writeShort((int) (short) 10);
        dynamicChannelBuffer3.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int19 = dynamicChannelBuffer11.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dynamicChannelBuffer11.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.setShort((int) (short) 10, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer13.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer13.duplicate();
        int int17 = dynamicChannelBuffer13.capacity();
        dynamicChannelBuffer13.writerIndex((int) (short) 0);
        dynamicChannelBuffer13.markReaderIndex();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer24.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer29.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer29.duplicate();
        int int33 = dynamicChannelBuffer29.capacity();
        dynamicChannelBuffer24.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, 0, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer39.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer42 = dynamicChannelBuffer39.duplicate();
        int int43 = dynamicChannelBuffer39.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer46.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer46.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer51 = dynamicChannelBuffer46.toByteBuffer();
        dynamicChannelBuffer39.getBytes(4, byteBuffer51);
        dynamicChannelBuffer29.setBytes(0, byteBuffer51);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer56.ensureWritableBytes((int) (short) 0);
        int int62 = dynamicChannelBuffer56.indexOf((int) '4', 0, (byte) -1);
        char char64 = dynamicChannelBuffer56.getChar(0);
        byte[] byteArray65 = dynamicChannelBuffer56.array();
        dynamicChannelBuffer29.setBytes((int) (short) 0, byteArray65, (int) (short) 1, (int) (byte) 1);
        dynamicChannelBuffer13.writeBytes(byteArray65);
        byte byte71 = dynamicChannelBuffer13.getByte((int) (short) 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(channelBuffer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertNotNull(byteBuffer51);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + char64 + "' != '" + '\000' + "'", char64 == '\000');
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) 0 + "'", byte71 == (byte) 0);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer38.duplicate();
        int int42 = dynamicChannelBuffer38.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory43 = dynamicChannelBuffer38.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 52, channelBufferFactory43);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory45 = dynamicChannelBuffer44.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 10, channelBufferFactory45);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer51.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer49.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer51);
        byte byte56 = dynamicChannelBuffer49.getByte((int) ' ');
        java.nio.ByteOrder byteOrder57 = dynamicChannelBuffer49.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer61 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer64 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer64.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer67 = dynamicChannelBuffer64.duplicate();
        int int68 = dynamicChannelBuffer64.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory69 = dynamicChannelBuffer64.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer70 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 52, channelBufferFactory69);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory71 = dynamicChannelBuffer70.factory();
        dynamicChannelBuffer46.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer70, (int) (short) 1, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer46.setInt(52, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory43);
        org.junit.Assert.assertNotNull(channelBufferFactory45);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 0 + "'", byte56 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNotNull(channelBuffer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory69);
        org.junit.Assert.assertNotNull(channelBufferFactory71);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer23.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer23.toByteBuffer();
        dynamicChannelBuffer16.getBytes(4, byteBuffer28);
        dynamicChannelBuffer6.setBytes(0, byteBuffer28);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.setByte(17096, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17096");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer8.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer8.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer8.toByteBuffer();
        dynamicChannelBuffer1.getBytes(4, byteBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer19.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer17.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        byte byte24 = dynamicChannelBuffer17.getByte((int) ' ');
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer17.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder25, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder25, (int) (short) 100);
        dynamicChannelBuffer29.discardReadBytes();
        dynamicChannelBuffer1.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29, (int) '\000', 1);
        dynamicChannelBuffer1.setDouble(10, (double) 10L);
        short short38 = dynamicChannelBuffer1.getUnsignedByte(4);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 0 + "'", short38 == (short) 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        short short9 = dynamicChannelBuffer1.getUnsignedByte((int) (byte) 1);
        dynamicChannelBuffer1.ensureWritableBytes(35);
        // The following exception was thrown during execution in test generation
        try {
            char char13 = dynamicChannelBuffer1.getChar(17096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17096");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        int int18 = dynamicChannelBuffer15.getMedium(5);
        int int19 = dynamicChannelBuffer15.writerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        dynamicChannelBuffer21.writeFloat(1.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        int int8 = dynamicChannelBuffer1.bytesBefore((int) '\000', (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer11.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer16.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer16.duplicate();
        int int20 = dynamicChannelBuffer16.capacity();
        dynamicChannelBuffer11.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 0, (int) (byte) 10);
        int int25 = dynamicChannelBuffer16.getMedium(1);
        dynamicChannelBuffer16.markWriterIndex();
        byte[] byteArray27 = dynamicChannelBuffer16.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(35, byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 32, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext4, channelEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 32, 2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 0, (int) (short) -1, 4, 655360);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 52, channelBufferFactory32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 100, channelBufferFactory34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', 52, (int) ' ', 2, 4376576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(35, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, 4, 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer15.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer15.duplicate();
        int int19 = dynamicChannelBuffer15.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer22.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer27 = dynamicChannelBuffer22.toByteBuffer();
        dynamicChannelBuffer15.getBytes(4, byteBuffer27);
        java.nio.ByteBuffer byteBuffer29 = dynamicChannelBuffer15.toByteBuffer();
        dynamicChannelBuffer13.readBytes(byteBuffer29);
        dynamicChannelBuffer13.setLong(0, (long) (short) -1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer35.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer40.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer43 = dynamicChannelBuffer40.duplicate();
        int int44 = dynamicChannelBuffer40.capacity();
        dynamicChannelBuffer35.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40, 0, (int) (byte) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer50 = dynamicChannelBuffer35.slice((int) (byte) 10, (int) (short) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer52 = dynamicChannelBuffer35.readBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer13.readBytes(channelBuffer52, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertNotNull(channelBuffer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(channelBuffer50);
        org.junit.Assert.assertNotNull(channelBuffer52);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer18.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
        byte byte23 = dynamicChannelBuffer16.getByte((int) ' ');
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer31.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer31.duplicate();
        int int35 = dynamicChannelBuffer31.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 52, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 0, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer44.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer42.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44);
        byte byte49 = dynamicChannelBuffer42.getByte((int) ' ');
        java.nio.ByteOrder byteOrder50 = dynamicChannelBuffer42.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, (int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer57 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer59.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer57.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer59);
        byte byte64 = dynamicChannelBuffer57.getByte((int) ' ');
        java.nio.ByteOrder byteOrder65 = dynamicChannelBuffer57.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer67 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder65, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer70 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer70.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer73 = dynamicChannelBuffer70.duplicate();
        int int74 = dynamicChannelBuffer70.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory75 = dynamicChannelBuffer70.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer76 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder65, (int) '#', channelBufferFactory75);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer77 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder50, 1, channelBufferFactory75);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer78 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory75);
        // The following exception was thrown during execution in test generation
        try {
            long long80 = dynamicChannelBuffer78.getUnsignedInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 0 + "'", byte49 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 0 + "'", byte64 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder65);
        org.junit.Assert.assertNotNull(channelBuffer73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 35 + "'", int74 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory75);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        int int16 = dynamicChannelBuffer15.writableBytes();
        dynamicChannelBuffer15.writeFloat((float) 52);
        dynamicChannelBuffer15.skipBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setLong((int) (byte) 10, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 32, 2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.duplicate();
        int int31 = dynamicChannelBuffer27.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 52, channelBufferFactory32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer33.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 100, channelBufferFactory34);
        // The following exception was thrown during execution in test generation
        try {
            short short37 = dynamicChannelBuffer35.getShort(655360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 655360");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writerIndex(5);
        boolean boolean6 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(52);
        java.nio.ByteBuffer byteBuffer2 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuffer2);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder6 = null;
        int int7 = dynamicChannelBuffer1.indexOf((int) (byte) -1, (int) (byte) 0, channelBufferIndexFinder6);
        long long9 = dynamicChannelBuffer1.getLong((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer12.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer17.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = dynamicChannelBuffer17.duplicate();
        int int21 = dynamicChannelBuffer17.capacity();
        dynamicChannelBuffer12.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 0, (int) (byte) 10);
        int int26 = dynamicChannelBuffer17.getMedium(1);
        dynamicChannelBuffer17.markWriterIndex();
        byte[] byteArray28 = dynamicChannelBuffer17.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(channelBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 5, (int) '4', 1, (int) (short) 17096, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 4376576, (int) ' ', (-1), (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.duplicate();
        int int18 = dynamicChannelBuffer14.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '#', channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte byte30 = dynamicChannelBuffer23.getByte((int) ' ');
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer23.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer38.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer38.duplicate();
        int int42 = dynamicChannelBuffer38.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory43 = dynamicChannelBuffer38.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder31, 52, channelBufferFactory43);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory45 = dynamicChannelBuffer44.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (short) 10, channelBufferFactory45);
        // The following exception was thrown during execution in test generation
        try {
            short short47 = dynamicChannelBuffer46.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory43);
        org.junit.Assert.assertNotNull(channelBufferFactory45);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.writeInt(0);
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        byte byte19 = dynamicChannelBuffer17.getByte(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer25 = dynamicChannelBuffer22.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer27.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer32.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer35 = dynamicChannelBuffer32.duplicate();
        int int36 = dynamicChannelBuffer32.capacity();
        dynamicChannelBuffer27.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32, 0, (int) (byte) 10);
        long long41 = dynamicChannelBuffer27.getUnsignedInt(10);
        dynamicChannelBuffer22.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        dynamicChannelBuffer22.setBytes(4, byteArray47);
        dynamicChannelBuffer17.getBytes((int) (byte) 10, byteArray47);
        dynamicChannelBuffer1.setBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, (int) '#', (int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setByte((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 0, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer25);
        org.junit.Assert.assertNotNull(channelBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 0]");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.duplicate();
        int int5 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.writerIndex((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = dynamicChannelBuffer1.getDouble((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        int int7 = dynamicChannelBuffer1.indexOf((int) '4', 0, (byte) -1);
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer14.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        byte byte19 = dynamicChannelBuffer12.getByte((int) ' ');
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder25 = null;
        int int26 = dynamicChannelBuffer22.indexOf((int) ' ', (int) ' ', channelBufferIndexFinder25);
        dynamicChannelBuffer22.setShort((int) (short) 1, (int) '4');
        java.nio.ByteBuffer byteBuffer30 = dynamicChannelBuffer22.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(52, byteBuffer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 100);
        dynamicChannelBuffer1.setChar((int) (byte) 1, 35);
        java.nio.channels.GatheringByteChannel gatheringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.getBytes((int) (byte) 10, gatheringByteChannel6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer6.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer6.duplicate();
        int int10 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (byte) 10);
        long long15 = dynamicChannelBuffer1.getUnsignedInt(10);
        dynamicChannelBuffer1.writeInt(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer20.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer25.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer25.duplicate();
        int int29 = dynamicChannelBuffer25.capacity();
        dynamicChannelBuffer20.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 0, (int) (byte) 10);
        byte[] byteArray33 = dynamicChannelBuffer25.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, byteArray33, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer47 = dynamicChannelBuffer44.slice((int) (short) 66, 17096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.slice();
        dynamicChannelBuffer3.writeShort((int) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer13.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer11.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        byte byte18 = dynamicChannelBuffer11.getByte((int) ' ');
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, 10);
        java.nio.ByteBuffer[] byteBufferArray28 = dynamicChannelBuffer25.toByteBuffers((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer30.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer33 = dynamicChannelBuffer30.duplicate();
        int int34 = dynamicChannelBuffer30.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer37.writeBoolean(true);
        java.nio.ByteBuffer byteBuffer42 = dynamicChannelBuffer37.toByteBuffer();
        dynamicChannelBuffer30.getBytes(4, byteBuffer42);
        dynamicChannelBuffer25.writeBytes(byteBuffer42);
        dynamicChannelBuffer3.writeBytes(byteBuffer42);
        int int47 = dynamicChannelBuffer3.getUnsignedMedium((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer50 = dynamicChannelBuffer3.copy((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertNotNull(byteBufferArray28);
        org.junit.Assert.assertNotNull(channelBuffer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(byteBuffer42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 655360 + "'", int47 == 655360);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(52, 2560, 2560, (-1), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 2560");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer51.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer49.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer51);
        byte byte56 = dynamicChannelBuffer49.getByte((int) ' ');
        java.nio.ByteOrder byteOrder57 = dynamicChannelBuffer49.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer62.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer65 = dynamicChannelBuffer62.duplicate();
        int int66 = dynamicChannelBuffer62.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory67 = dynamicChannelBuffer62.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer68 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, (int) '#', channelBufferFactory67);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer73 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer73.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer71.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer73);
        byte byte78 = dynamicChannelBuffer71.getByte((int) ' ');
        java.nio.ByteOrder byteOrder79 = dynamicChannelBuffer71.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer81 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder79, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer83 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder79, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer86 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer86.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer89 = dynamicChannelBuffer86.duplicate();
        int int90 = dynamicChannelBuffer86.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory91 = dynamicChannelBuffer86.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer92 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder79, 52, channelBufferFactory91);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory93 = dynamicChannelBuffer92.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer94 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder57, (int) (short) 10, channelBufferFactory93);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer95 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 2, channelBufferFactory93);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer97 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertTrue("'" + byte56 + "' != '" + (byte) 0 + "'", byte56 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder57);
        org.junit.Assert.assertNotNull(channelBuffer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory67);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 0 + "'", byte78 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder79);
        org.junit.Assert.assertNotNull(channelBuffer89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 35 + "'", int90 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory91);
        org.junit.Assert.assertNotNull(channelBufferFactory93);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 10, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer3.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        byte byte8 = dynamicChannelBuffer1.getByte((int) ' ');
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer22.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer20.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        byte byte27 = dynamicChannelBuffer20.getByte((int) ' ');
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer20.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer37.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer37.duplicate();
        int int41 = dynamicChannelBuffer37.capacity();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (short) 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, 1, channelBufferFactory42);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short52 = dynamicChannelBuffer50.getUnsignedByte(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        dynamicChannelBuffer1.setFloat((int) (short) 1, (float) 1L);
        dynamicChannelBuffer1.writeMedium((int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        dynamicChannelBuffer10.ensureWritableBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer10.duplicate();
        int int14 = dynamicChannelBuffer10.capacity();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        int int2 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setZero((int) (short) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }
}

