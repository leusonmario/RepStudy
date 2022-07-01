import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = org.jboss.netty.channel.Channel.OP_READ_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) '4', 5, (int) (short) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = org.jboss.netty.channel.Channel.OP_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelHandler channelHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext5 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", channelHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 100, (int) (short) -1, 1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jboss.netty.channel.ChannelFactory channelFactory0 = null;
        org.jboss.netty.channel.ChannelPipeline channelPipeline1 = null;
        org.jboss.netty.channel.ChannelSink channelSink2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.iostream.IOStreamChannel iOStreamChannel3 = new org.jboss.netty.channel.iostream.IOStreamChannel(channelFactory0, channelPipeline1, channelSink2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer4.resetReaderIndex();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer4.writeBytes(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.readSlice(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int0 = org.jboss.netty.channel.Channel.OP_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.ByteBuffer byteBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 0, byteBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelHandler channelHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext5 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", channelHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer7.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer8.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.getBytes((int) (short) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer5.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer6.writeBytes(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray8 = dynamicChannelBuffer6.array();
        int int9 = dynamicChannelBuffer6.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            short short5 = dynamicChannelBuffer1.getUnsignedByte(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset6 = null;
        java.lang.String str7 = dynamicChannelBuffer3.toString((int) (short) 1, (int) (short) 0, charset6);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer3.factory;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 5, channelBufferFactory8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setZero((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) -1, (int) (byte) 100, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.getMedium((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            short short12 = dynamicChannelBuffer1.getUnsignedByte((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer5.clear();
        dynamicChannelBuffer5.writeLong((long) 0);
        char char11 = dynamicChannelBuffer5.readChar();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore((int) (byte) -1, (int) (short) 10, channelBufferIndexFinder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        java.nio.channels.GatheringByteChannel gatheringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.getBytes((int) (byte) 1, gatheringByteChannel15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.lang.Class<?> wildcardClass3 = channelBuffer2.getClass();
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 100, (int) (short) 100, (int) (byte) -1, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble(5, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) ' ', (int) (byte) 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (32) must be equal to or greater than lengthFieldOffset (32) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 0, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.writeByte((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setChar((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.getShort((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer11.toString((int) (short) 1, (int) (short) 0, charset14);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer11.factory;
        dynamicChannelBuffer11.writeShort(4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (short) 10, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(channelBufferFactory16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer1.setBytes((int) '\000', scatteringByteChannel16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer9.getbuffer();
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer9.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.getChar((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean((int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 10, 0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer16.writeBytes(byteArray24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer16.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer16.factory();
        boolean boolean29 = dynamicChannelBuffer16.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short9 = dynamicChannelBuffer1.getUnsignedByte((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        java.io.InputStream inputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.setBytes(100, inputStream14, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.writableBytes();
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.bytesBefore(1, channelBufferIndexFinder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            char char8 = dynamicChannelBuffer1.getChar((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setByte((int) (short) 100, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        java.nio.ByteBuffer byteBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, byteBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        byte byte13 = dynamicChannelBuffer1.readByte();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer6.getbuffer();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer6.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer15.writeBytes(byteArray23);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer15.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer15.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 0, channelBufferFactory26);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertNotNull(channelBufferFactory26);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = dynamicChannelBuffer7.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 4, (int) (byte) 0, (int) ' ', (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore(8, (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.writeShort(4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeZero((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must be 0 or greater than 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        java.io.InputStream inputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer22.setBytes((int) '4', inputStream24, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        java.nio.channels.GatheringByteChannel gatheringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readBytes(gatheringByteChannel7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        int int8 = dynamicChannelBuffer5.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        java.lang.Class<?> wildcardClass7 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        // The following exception was thrown during execution in test generation
        try {
            short short11 = dynamicChannelBuffer5.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer7.toString((int) (short) 1, (int) (short) 0, charset10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer7.getbuffer();
        dynamicChannelBuffer7.writeInt((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (byte) 0, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (byte) -1, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.writeBytes(inputStream4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        java.nio.ByteBuffer byteBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.writeInt(5);
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = dynamicChannelBuffer8.getByte((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = dynamicChannelBuffer1.getDouble((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.slice(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.ensureWritableBytes(0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore(4, 10, channelBufferIndexFinder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        java.nio.channels.GatheringByteChannel gatheringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.getBytes((int) '\000', gatheringByteChannel11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelHandler channelHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext5 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)", channelHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.setLong((int) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            float float8 = dynamicChannelBuffer1.getFloat(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer10.toString((int) (short) 1, (int) (short) 0, charset13);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer10.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer10.writeBytes(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.getBytes((int) (short) 10, byteArray19, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer11.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = dynamicChannelBuffer15.readSlice(0);
        boolean boolean21 = dynamicChannelBuffer15.writable();
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer15.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes(256, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteOrder22);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        java.nio.ByteBuffer byteBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.bytesBefore(10, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.getChar(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        java.lang.Class<?> wildcardClass10 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.ensureWritableBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) '\000', (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        java.lang.Object obj12 = null;
        boolean boolean13 = dynamicChannelBuffer5.equals(obj12);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dynamicChannelBuffer1.getUnsignedInt(256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        java.nio.channels.GatheringByteChannel gatheringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.getBytes(0, gatheringByteChannel4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        java.nio.ByteBuffer byteBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setBytes(0, byteBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.ensureWritableBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer5.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int8 = dynamicChannelBuffer7.readableBytes();
        int int9 = dynamicChannelBuffer7.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        java.lang.Class<?> wildcardClass14 = byteArray13.getClass();
        boolean boolean15 = dynamicChannelBuffer7.equals((java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '#', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        // The following exception was thrown during execution in test generation
        try {
            float float13 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex(256, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        java.nio.ByteBuffer byteBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\000', byteBuffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.bytesBefore(1, (int) ' ', channelBufferIndexFinder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        dynamicChannelBuffer5.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short13 = dynamicChannelBuffer5.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        boolean boolean9 = dynamicChannelBuffer5.writable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray14 = dynamicChannelBuffer12.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer16.readSlice(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes((-1), channelBuffer21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer21);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble(720740, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer7.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeFloat((float) ' ');
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory7 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(256, channelBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBufferFactory7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer15.toString((int) (short) 1, (int) (short) 0, charset18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer15.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer22.resetReaderIndex();
        byte[] byteArray24 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer15.writeBytes(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray24, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer5.readSlice(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 100, 8, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer24.getBytes((int) '\000', outputStream26, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.readBytes((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.getMedium((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(256, byteArray22, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer7.writeBytes(byteArray15);
        dynamicChannelBuffer7.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer7.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        dynamicChannelBuffer5.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer5.readSlice((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray8 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.writeLong((long) 0);
        byte byte13 = dynamicChannelBuffer6.getByte(0);
        dynamicChannelBuffer6.writeFloat((float) 1L);
        dynamicChannelBuffer6.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.bytesBefore(5, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 0, 720740, 5, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 720740");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        dynamicChannelBuffer5.writeInt((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer5.slice(5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 5, 5, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int int0 = org.jboss.netty.channel.Channel.OP_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.setBytes((int) (short) 0, scatteringByteChannel15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        java.nio.channels.GatheringByteChannel gatheringByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer5.getBytes(256, gatheringByteChannel10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.skipBytes(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.writeInt(5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setDouble((int) (short) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer5.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.resetReaderIndex();
        byte[] byteArray11 = dynamicChannelBuffer9.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        dynamicChannelBuffer9.ensureWritableBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.getBytes((int) (short) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex(256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.bytesBefore((int) (byte) -1, 720740, channelBufferIndexFinder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer17.clear();
        java.lang.String str21 = dynamicChannelBuffer17.toString();
        dynamicChannelBuffer11.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str21, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        dynamicChannelBuffer15.writeFloat((float) 1L);
        dynamicChannelBuffer15.setShort((int) (short) 0, (int) (byte) 1);
        int int30 = dynamicChannelBuffer15.bytesBefore(5, (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer15.readSlice(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 1, 720740);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(channelBuffer32);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.readBytes(gatheringByteChannel9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes(4, inputStream7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer5.slice((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.getInt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer21.resetReaderIndex();
        byte[] byteArray23 = dynamicChannelBuffer21.array();
        dynamicChannelBuffer21.clear();
        java.lang.String str25 = dynamicChannelBuffer21.toString();
        dynamicChannelBuffer15.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str25, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, outputStream12, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = dynamicChannelBuffer1.getFloat((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dynamicChannelBuffer1.toString(charset14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        float float13 = dynamicChannelBuffer1.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        dynamicChannelBuffer15.writeDouble((double) (short) -1);
        int int23 = dynamicChannelBuffer15.readerIndex();
        byte byte24 = dynamicChannelBuffer15.readByte();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 4);
        dynamicChannelBuffer1.writeChar(8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.nio.channels.GatheringByteChannel gatheringByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readBytes(gatheringByteChannel5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        int int12 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer15.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer15.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder26);
        char char28 = dynamicChannelBuffer15.readChar();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '\000' + "'", char28 == '\000');
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte(5, 720740);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.bytesBefore(1, channelBufferIndexFinder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.compareTo(channelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            short short7 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int15 = dynamicChannelBuffer1.indexOf((int) (byte) 100, (int) (byte) 1, (byte) 100);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel16, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.indexOf((int) (short) 0, (int) (short) 100, channelBufferIndexFinder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            short short7 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeBoolean(true);
        dynamicChannelBuffer1.setDouble(0, 10.0d);
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dynamicChannelBuffer1.toString(charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore(0, channelBufferIndexFinder13);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.getBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray8 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.writeLong((long) 0);
        char char12 = dynamicChannelBuffer6.readChar();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore(10, (int) (short) 1, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        java.nio.channels.GatheringByteChannel gatheringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.readBytes(gatheringByteChannel15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readMedium();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = dynamicChannelBuffer5.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (short) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer15.getbuffer();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer15.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 0);
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer1.writeBytes(inputStream22, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 256, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        float float13 = dynamicChannelBuffer1.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        dynamicChannelBuffer15.writeDouble((double) (short) -1);
        int int23 = dynamicChannelBuffer15.readerIndex();
        byte byte24 = dynamicChannelBuffer15.readByte();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dynamicChannelBuffer15.getInt(720740);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.writeFloat((float) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer5.getUnsignedMedium((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(256, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.readSlice(720740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = dynamicChannelBuffer5.getDouble((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int15 = dynamicChannelBuffer1.indexOf((int) (byte) 100, (int) (byte) 1, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short17 = dynamicChannelBuffer1.getShort((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer1.copy((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer22.writeBytes(inputStream23, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        int int13 = dynamicChannelBuffer5.bytesBefore((byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer15.writeBytes(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.readBytes(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short4 = dynamicChannelBuffer1.getUnsignedByte((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dynamicChannelBuffer22.getLong((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer7.writeBytes(byteArray15);
        int int17 = dynamicChannelBuffer7.readUnsignedMedium();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 720740 + "'", int17 == 720740);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer1.getfactory();
        java.nio.ByteBuffer byteBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray20 = dynamicChannelBuffer18.array();
        dynamicChannelBuffer18.clear();
        dynamicChannelBuffer18.writeLong((long) 0);
        byte byte25 = dynamicChannelBuffer18.getByte(0);
        long long26 = dynamicChannelBuffer18.readUnsignedInt();
        int int27 = dynamicChannelBuffer18.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(256, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer5.bytesBefore((int) '4', 8, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer5.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 4);
        // The following exception was thrown during execution in test generation
        try {
            char char16 = dynamicChannelBuffer14.getChar(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = dynamicChannelBuffer1.getByte((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray18, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        java.nio.channels.GatheringByteChannel gatheringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.getBytes((int) (byte) 100, gatheringByteChannel14, (int) '\u640a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        char char14 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(channelBuffer15, (int) '\u0aff', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.skipBytes(256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        java.lang.String str14 = dynamicChannelBuffer1.toString();
        java.nio.ByteBuffer byteBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=12, cap=16)" + "'", str14, "DynamicChannelBuffer(ridx=0, widx=12, cap=16)");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.readBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer16.writeBytes(byteArray24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer16.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer16.factory();
        boolean boolean29 = dynamicChannelBuffer16.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = dynamicChannelBuffer24.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        double double9 = dynamicChannelBuffer1.readDouble();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int12 = dynamicChannelBuffer11.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer11.bytesBefore((int) '\000', channelBufferIndexFinder14);
        byte[] byteArray16 = dynamicChannelBuffer11.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray16, 5, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.writeBytes(inputStream6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray8 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.writeLong((long) 0);
        char char12 = dynamicChannelBuffer6.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer6.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer16.getbuffer();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, 0);
        dynamicChannelBuffer13.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        dynamicChannelBuffer13.writeDouble((double) 10.0f);
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        java.nio.channels.GatheringByteChannel gatheringByteChannel26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dynamicChannelBuffer13.getBytes((int) (byte) -1, gatheringByteChannel26, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        char char17 = dynamicChannelBuffer1.getChar(2);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer1.setBytes(0, scatteringByteChannel19, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\u640a' + "'", char17 == '\u640a');
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = dynamicChannelBuffer22.getDouble((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (byte) 100, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.resetReaderIndex();
        java.nio.ByteBuffer byteBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer15.writeBytes(byteArray23);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer15.getfactory();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer15.readBytes((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer15.getbuffer();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer15.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 0);
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        dynamicChannelBuffer19.writeByte((int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer13.writeBytes(byteArray21);
        int int23 = dynamicChannelBuffer13.readUnsignedMedium();
        boolean boolean24 = dynamicChannelBuffer13.readBoolean();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer25 = dynamicChannelBuffer13.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(720740, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 720740 + "'", int23 == 720740);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(channelBuffer25);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer12.writeBytes(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray20, 4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        java.nio.channels.GatheringByteChannel gatheringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.getBytes((int) '\u0aff', gatheringByteChannel11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        int int17 = dynamicChannelBuffer14.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (byte) 10, channelBufferFactory18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer21.toString((int) (short) 1, (int) (short) 0, charset24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer21.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer28.resetReaderIndex();
        byte[] byteArray30 = dynamicChannelBuffer28.array();
        dynamicChannelBuffer21.writeBytes(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.readBytes(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 10, 5, (int) ' ', (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        byte byte10 = dynamicChannelBuffer1.readByte();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) 'a', (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        java.lang.Class<?> wildcardClass10 = dynamicChannelBuffer8.getClass();
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        boolean boolean22 = dynamicChannelBuffer1.hasArray();
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream23, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.duplicate();
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.setBytes(0, inputStream15, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar(4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.writeChar(720740);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dynamicChannelBuffer1.getUnsignedInt((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        dynamicChannelBuffer1.writeLong((long) 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.setChar(1, (int) 'a');
        java.nio.charset.Charset charset19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dynamicChannelBuffer1.toString(100, 1, charset19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        char char17 = dynamicChannelBuffer1.getChar(2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer1.readBytes((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\u640a' + "'", char17 == '\u640a');
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer16.toString((int) (short) 1, (int) (short) 0, charset19);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer16.factory;
        int int22 = dynamicChannelBuffer16.readerIndex();
        int int23 = dynamicChannelBuffer16.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer16.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder26);
        int int28 = dynamicChannelBuffer16.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, (int) (short) 0, 720740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.getUnsignedShort((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        dynamicChannelBuffer5.writeInt((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        char char22 = dynamicChannelBuffer16.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer16.factory;
        dynamicChannelBuffer16.markReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer16.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setBytes((-4), byteArray25, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.getUnsignedShort((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.bytesBefore((int) '\u0aff', (int) '4', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2815");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        boolean boolean12 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean(5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        int int10 = dynamicChannelBuffer1.readUnsignedShort();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer1.readBytes((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, (-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.writeShort(4);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(256, outputStream10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        dynamicChannelBuffer1.writeBoolean(false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        byte byte20 = dynamicChannelBuffer13.getByte(0);
        dynamicChannelBuffer13.writeFloat((float) 1L);
        dynamicChannelBuffer13.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer27.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer30.getbuffer();
        java.nio.ByteOrder byteOrder32 = dynamicChannelBuffer30.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder32, 0);
        dynamicChannelBuffer27.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer34);
        dynamicChannelBuffer27.writeDouble((double) 10.0f);
        int int38 = dynamicChannelBuffer13.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        java.nio.ByteBuffer byteBuffer41 = dynamicChannelBuffer27.toByteBuffer(1, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(8, byteBuffer41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer31);
        org.junit.Assert.assertNotNull(byteOrder32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer41);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) 'a');
        java.nio.channels.GatheringByteChannel gatheringByteChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readBytes(gatheringByteChannel2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer21.resetReaderIndex();
        byte[] byteArray23 = dynamicChannelBuffer21.array();
        dynamicChannelBuffer17.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21);
        dynamicChannelBuffer17.ensureWritableBytes(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer17.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\u640a', channelBuffer27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        int int12 = dynamicChannelBuffer5.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        int int24 = dynamicChannelBuffer14.readUnsignedMedium();
        boolean boolean25 = dynamicChannelBuffer14.readBoolean();
        dynamicChannelBuffer14.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, 720740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 720740 + "'", int24 == 720740);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        long long14 = dynamicChannelBuffer1.getUnsignedInt((int) (short) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.duplicate();
        int int16 = dynamicChannelBuffer1.capacity();
        java.nio.channels.GatheringByteChannel gatheringByteChannel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.readBytes(gatheringByteChannel17, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        dynamicChannelBuffer1.writeFloat((float) (byte) 1);
        char char17 = dynamicChannelBuffer1.readChar();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        float float13 = dynamicChannelBuffer1.readFloat();
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream14, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = dynamicChannelBuffer1.toByteBuffer(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(720740, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        int int6 = dynamicChannelBuffer1.readableBytes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.setInt(2, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setChar((int) '\u640a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25610");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(720740, 4, (-1), (-1), (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        byte byte20 = dynamicChannelBuffer13.getByte(0);
        dynamicChannelBuffer13.writeFloat((float) 1L);
        dynamicChannelBuffer13.ensureWritableBytes((int) 'a');
        boolean boolean25 = dynamicChannelBuffer13.readable();
        dynamicChannelBuffer13.writeBoolean(true);
        int int28 = dynamicChannelBuffer13.readUnsignedShort();
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer13;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer31.resetReaderIndex();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer31.writeBytes(byteArray39);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer31.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer31.factory();
        boolean boolean44 = dynamicChannelBuffer31.equals((java.lang.Object) "");
        dynamicChannelBuffer31.writeLong(100L);
        dynamicChannelBuffer31.resetWriterIndex();
        dynamicChannelBuffer31.setBoolean((int) (byte) 10, false);
        dynamicChannelBuffer31.ensureWritableBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory41);
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(channelBuffer3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble(720740, (double) 792462055231324160L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        dynamicChannelBuffer1.skipBytes((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.setBoolean(0, false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int13 = dynamicChannelBuffer12.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        int int16 = dynamicChannelBuffer12.bytesBefore((int) '\000', channelBufferIndexFinder15);
        byte[] byteArray17 = dynamicChannelBuffer12.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 100, byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dynamicChannelBuffer1.getBoolean((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        int int13 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeShort((int) (short) -1);
        short short17 = dynamicChannelBuffer1.getShort(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        byte byte23 = dynamicChannelBuffer15.readByte();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer4.resetReaderIndex();
        byte[] byteArray6 = dynamicChannelBuffer4.array();
        dynamicChannelBuffer4.clear();
        dynamicChannelBuffer4.writeLong((long) 0);
        byte byte11 = dynamicChannelBuffer4.getByte(0);
        dynamicChannelBuffer4.writeFloat((float) 1L);
        dynamicChannelBuffer4.ensureWritableBytes((int) 'a');
        boolean boolean16 = dynamicChannelBuffer4.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer4.readSlice((int) (byte) 0);
        dynamicChannelBuffer1.getBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, 10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer14.getbuffer();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer14.endianness;
        dynamicChannelBuffer7.buffer = dynamicChannelBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer7.getUnsignedShort((int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        boolean boolean22 = dynamicChannelBuffer1.hasArray();
        short short23 = dynamicChannelBuffer1.readUnsignedByte();
        int int24 = dynamicChannelBuffer1.writerIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        dynamicChannelBuffer1.writeFloat((float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex(2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        int int13 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeShort((int) (short) -1);
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer19.resetReaderIndex();
        byte[] byteArray21 = dynamicChannelBuffer19.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer19.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer19.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '4', channelBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer11.toString(charset15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer11.getUnsignedMedium(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        float float13 = dynamicChannelBuffer1.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        dynamicChannelBuffer15.writeDouble((double) (short) -1);
        int int23 = dynamicChannelBuffer15.readerIndex();
        byte byte24 = dynamicChannelBuffer15.readByte();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 4);
        int int27 = dynamicChannelBuffer1.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer30.resetReaderIndex();
        byte[] byteArray32 = dynamicChannelBuffer30.array();
        dynamicChannelBuffer30.clear();
        dynamicChannelBuffer30.writeLong((long) 0);
        char char36 = dynamicChannelBuffer30.readChar();
        int int38 = dynamicChannelBuffer30.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset43 = null;
        java.lang.String str44 = dynamicChannelBuffer40.toString((int) (short) 1, (int) (short) 0, charset43);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer45 = dynamicChannelBuffer40.getbuffer();
        dynamicChannelBuffer40.writeInt((int) (short) 100);
        boolean boolean48 = dynamicChannelBuffer40.readable();
        int int49 = dynamicChannelBuffer30.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte[] byteArray50 = dynamicChannelBuffer30.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), byteArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '\000' + "'", char36 == '\000');
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(channelBuffer45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        short short11 = dynamicChannelBuffer1.getUnsignedByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer15.toString((int) (short) 1, (int) (short) 0, charset18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer15.factory;
        int int21 = dynamicChannelBuffer15.readerIndex();
        int int22 = dynamicChannelBuffer15.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder25 = null;
        int int26 = dynamicChannelBuffer15.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder25);
        int int27 = dynamicChannelBuffer15.readerIndex();
        dynamicChannelBuffer15.writeShort((int) (short) -1);
        dynamicChannelBuffer15.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        int int11 = dynamicChannelBuffer5.readerIndex();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer5.endianness;
        boolean boolean13 = dynamicChannelBuffer5.hasArray();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        int int25 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer1.readBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer1.copy(4, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        boolean boolean11 = dynamicChannelBuffer1.writable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.writableBytes();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.writeBytes(inputStream3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dynamicChannelBuffer1.getUnsignedInt((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.readSlice((int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.readBytes(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        int int11 = dynamicChannelBuffer1.arrayOffset();
        dynamicChannelBuffer1.writeByte((int) '\u0aff');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        byte byte20 = dynamicChannelBuffer13.getByte(0);
        dynamicChannelBuffer13.writeFloat((float) 1L);
        dynamicChannelBuffer13.ensureWritableBytes((int) 'a');
        boolean boolean25 = dynamicChannelBuffer13.readable();
        dynamicChannelBuffer13.writeBoolean(true);
        int int28 = dynamicChannelBuffer13.readUnsignedShort();
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer13;
        byte byte31 = dynamicChannelBuffer5.getByte(2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset37 = null;
        java.lang.String str38 = dynamicChannelBuffer34.toString((int) (short) 1, (int) (short) 0, charset37);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory39 = dynamicChannelBuffer34.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer41.resetReaderIndex();
        byte[] byteArray43 = dynamicChannelBuffer41.array();
        dynamicChannelBuffer34.writeBytes(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.getBytes(1, byteArray43, 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + byte31 + "' != '" + (byte) 0 + "'", byte31 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(channelBufferFactory39);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(2, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer24.getMedium(720740);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.resetReaderIndex();
        byte[] byteArray11 = dynamicChannelBuffer9.array();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.writeLong((long) 0);
        byte byte16 = dynamicChannelBuffer9.getByte(0);
        int int17 = dynamicChannelBuffer9.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer9.buffer;
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer9.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) -1, byteBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertNotNull(byteBuffer19);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        char char14 = dynamicChannelBuffer1.readChar();
        int int15 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.bytesBefore(0, (-1), channelBufferIndexFinder18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex(720740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int10 = dynamicChannelBuffer9.readableBytes();
        int int11 = dynamicChannelBuffer9.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        java.lang.Class<?> wildcardClass16 = byteArray15.getClass();
        boolean boolean17 = dynamicChannelBuffer9.equals((java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', 100, (int) '\u640a', (int) (short) 10, 1076101120, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 25610");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        char char27 = dynamicChannelBuffer15.readChar();
        dynamicChannelBuffer15.setDouble(0, (double) '#');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + '\u4024' + "'", char27 == '\u4024');
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        dynamicChannelBuffer1.clear();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\u640a', (int) '\u0aff', (-4), (int) '\u640a', 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer1.getfactory();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray20 = dynamicChannelBuffer18.array();
        dynamicChannelBuffer1.writeBytes(byteArray20);
        dynamicChannelBuffer1.setShort((int) (byte) 0, (-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer11.toString((int) (short) 1, (int) (short) 0, charset14);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer11.factory;
        dynamicChannelBuffer11.writeShort(4);
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer23.writeBytes(byteArray31);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory33 = dynamicChannelBuffer23.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer23.factory();
        boolean boolean36 = dynamicChannelBuffer23.equals((java.lang.Object) "");
        dynamicChannelBuffer1.getBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) '#', (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory33);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer27.resetReaderIndex();
        byte[] byteArray29 = dynamicChannelBuffer27.array();
        dynamicChannelBuffer23.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        int int32 = dynamicChannelBuffer27.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory33 = dynamicChannelBuffer27.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer35.resetReaderIndex();
        byte[] byteArray37 = dynamicChannelBuffer35.array();
        dynamicChannelBuffer35.clear();
        dynamicChannelBuffer35.writeLong((long) 0);
        byte byte42 = dynamicChannelBuffer35.getByte(0);
        dynamicChannelBuffer35.writeFloat((float) 1L);
        dynamicChannelBuffer35.ensureWritableBytes((int) 'a');
        boolean boolean47 = dynamicChannelBuffer35.readable();
        dynamicChannelBuffer35.writeBoolean(true);
        int int50 = dynamicChannelBuffer35.readUnsignedShort();
        dynamicChannelBuffer27.buffer = dynamicChannelBuffer35;
        byte byte53 = dynamicChannelBuffer27.getByte(2);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer27;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory33);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0]");
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 0 + "'", byte42 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 0 + "'", byte53 == (byte) 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer11.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        boolean boolean19 = dynamicChannelBuffer15.writable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer8.toString((int) (short) 1, (int) (short) 0, charset11);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer8.factory;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer8.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer8.writeBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 100, byteArray18, (int) (byte) -1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        java.nio.ByteBuffer byteBuffer29 = dynamicChannelBuffer15.toByteBuffer(1, 5);
        int int30 = dynamicChannelBuffer15.readInt();
        short short31 = dynamicChannelBuffer15.readShort();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1076101120 + "'", int30 == 1076101120);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 0 + "'", short31 == (short) 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer17.clear();
        dynamicChannelBuffer17.writeLong((long) 0);
        char char23 = dynamicChannelBuffer17.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer17.factory;
        dynamicChannelBuffer17.markReaderIndex();
        byte[] byteArray26 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer1.writeBytes(byteArray26);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer1.readSlice((int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer32.resetReaderIndex();
        byte[] byteArray34 = dynamicChannelBuffer32.array();
        dynamicChannelBuffer32.clear();
        dynamicChannelBuffer32.writeLong((long) 0);
        byte byte39 = dynamicChannelBuffer32.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory40 = dynamicChannelBuffer32.factory();
        dynamicChannelBuffer32.setInt(2, 5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory40);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short4 = dynamicChannelBuffer1.getShort((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer11.toString((int) (short) 1, (int) (short) 0, charset14);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer11.getbuffer();
        dynamicChannelBuffer11.writeInt((int) (short) 100);
        boolean boolean19 = dynamicChannelBuffer11.readable();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        byte[] byteArray21 = dynamicChannelBuffer11.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer23.buffer;
        dynamicChannelBuffer23.writeFloat((float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23, 1076101120, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(channelBuffer26);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int12 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.slice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.setBytes((int) (byte) 0, scatteringByteChannel4, 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        int int13 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeShort((int) (short) -1);
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short18 = dynamicChannelBuffer1.getUnsignedByte((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer5.endianness;
        boolean boolean13 = dynamicChannelBuffer5.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer5.bytesBefore(256, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) '\u0aff', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(7, 0, 1, 2, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        int int25 = dynamicChannelBuffer1.arrayOffset();
        java.nio.charset.Charset charset26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dynamicChannelBuffer1.toString(charset26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.getbuffer();
        java.nio.channels.GatheringByteChannel gatheringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.getBytes((int) (byte) 0, gatheringByteChannel12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer5.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray12 = dynamicChannelBuffer5.toByteBuffers((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBufferFactory9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer29.resetReaderIndex();
        byte[] byteArray31 = dynamicChannelBuffer29.array();
        dynamicChannelBuffer25.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer29);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory33 = dynamicChannelBuffer29.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5, channelBufferFactory33);
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0]");
        org.junit.Assert.assertNotNull(channelBufferFactory33);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeBoolean(true);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer17.toString((int) (short) 1, (int) (short) 0, charset20);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer17.factory;
        int int23 = dynamicChannelBuffer17.readerIndex();
        int int24 = dynamicChannelBuffer17.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder27 = null;
        int int28 = dynamicChannelBuffer17.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder27);
        int int29 = dynamicChannelBuffer17.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        char char14 = dynamicChannelBuffer1.readChar();
        java.io.InputStream inputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.writeBytes(inputStream15, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer13.toString((int) (short) 1, (int) (short) 0, charset16);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer20.resetReaderIndex();
        byte[] byteArray22 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer13.writeBytes(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\u640a', byteArray22, (int) '\u4024', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(5, outputStream8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        long long14 = dynamicChannelBuffer1.getUnsignedInt((int) (short) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.duplicate();
        int int16 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer1.getUnsignedMedium((int) '\u640a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25610");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        char char11 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.writeInt(100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        int int13 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeShort((int) (short) -1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeMedium(0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        long long14 = dynamicChannelBuffer1.getLong(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray20 = dynamicChannelBuffer18.array();
        dynamicChannelBuffer18.clear();
        dynamicChannelBuffer18.writeLong((long) 0);
        byte byte25 = dynamicChannelBuffer18.getByte(0);
        int int26 = dynamicChannelBuffer18.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer18.buffer;
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer18.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(720740, byteBuffer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 792462055231324160L + "'", long14 == 792462055231324160L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (short) -1, channelBufferIndexFinder12);
        char char14 = dynamicChannelBuffer1.readChar();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer5.factory;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBufferFactory9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        byte byte20 = dynamicChannelBuffer13.getByte(0);
        dynamicChannelBuffer13.writeFloat((float) 1L);
        dynamicChannelBuffer13.ensureWritableBytes((int) 'a');
        boolean boolean25 = dynamicChannelBuffer13.readable();
        dynamicChannelBuffer13.writeBoolean(true);
        int int28 = dynamicChannelBuffer13.readUnsignedShort();
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer13;
        int int33 = dynamicChannelBuffer13.bytesBefore(5, (int) 'a', (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = dynamicChannelBuffer13.getInt(1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        byte byte22 = dynamicChannelBuffer15.getByte(0);
        dynamicChannelBuffer15.writeFloat((float) 1L);
        dynamicChannelBuffer15.setShort((int) (short) 0, (int) (byte) 1);
        int int28 = dynamicChannelBuffer15.readUnsignedMedium();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 256 + "'", int28 == 256);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        int int11 = dynamicChannelBuffer5.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setShort(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            float float18 = dynamicChannelBuffer1.getFloat(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        boolean boolean22 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.resetReaderIndex();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer24.writeBytes(byteArray32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer24.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory35 = dynamicChannelBuffer24.factory();
        boolean boolean37 = dynamicChannelBuffer24.equals((java.lang.Object) "");
        dynamicChannelBuffer24.writeLong(100L);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer42.resetReaderIndex();
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer42.writeBytes(byteArray50);
        dynamicChannelBuffer42.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer56.resetReaderIndex();
        byte[] byteArray58 = dynamicChannelBuffer56.array();
        dynamicChannelBuffer56.clear();
        dynamicChannelBuffer56.writeLong((long) 0);
        char char62 = dynamicChannelBuffer56.readChar();
        int int64 = dynamicChannelBuffer56.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer66 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset69 = null;
        java.lang.String str70 = dynamicChannelBuffer66.toString((int) (short) 1, (int) (short) 0, charset69);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer71 = dynamicChannelBuffer66.getbuffer();
        dynamicChannelBuffer66.writeInt((int) (short) 100);
        boolean boolean74 = dynamicChannelBuffer66.readable();
        int int75 = dynamicChannelBuffer56.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer66);
        byte[] byteArray76 = dynamicChannelBuffer56.array();
        dynamicChannelBuffer42.readBytes(byteArray76, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer24.readBytes(byteArray76, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertNotNull(channelBufferFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[0]");
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + '\000' + "'", char62 == '\000');
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(channelBuffer71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[0, 66, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.getMedium((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore(4, (int) (byte) 10, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeBoolean(true);
        dynamicChannelBuffer1.setDouble(0, 10.0d);
        dynamicChannelBuffer1.writeLong((long) 0);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer1.setBytes((int) (byte) 10, scatteringByteChannel22, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray18 = dynamicChannelBuffer1.toByteBuffers((int) '\u4024', 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        dynamicChannelBuffer1.writeFloat((float) (byte) 1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.readBytes(gatheringByteChannel17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(16, (int) ' ', (int) (short) 100, (int) (short) 10, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer16.getbuffer();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, 0);
        dynamicChannelBuffer13.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        dynamicChannelBuffer13.writeDouble((double) 10.0f);
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer26.resetReaderIndex();
        byte[] byteArray28 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer26.clear();
        dynamicChannelBuffer26.writeLong((long) 0);
        byte byte33 = dynamicChannelBuffer26.getByte(0);
        dynamicChannelBuffer26.writeFloat((float) 1L);
        dynamicChannelBuffer26.ensureWritableBytes((int) 'a');
        boolean boolean38 = dynamicChannelBuffer26.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer26.readSlice((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, (int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(channelBuffer40);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        dynamicChannelBuffer5.discardReadBytes();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer5.endianness;
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteOrder12);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getMedium((int) '\u4024');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16420");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        int int11 = dynamicChannelBuffer1.readMedium();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        dynamicChannelBuffer1.writeChar(5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer1.getfactory();
        int int16 = dynamicChannelBuffer1.readUnsignedShort();
        int int17 = dynamicChannelBuffer1.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer1.bytesBefore(100, (int) (short) 100, channelBufferIndexFinder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int12 = dynamicChannelBuffer1.readerIndex();
        int int13 = dynamicChannelBuffer1.capacity();
        java.nio.channels.GatheringByteChannel gatheringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.readBytes(gatheringByteChannel14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        int int11 = dynamicChannelBuffer1.readMedium();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        dynamicChannelBuffer13.writeDouble((double) (short) -1);
        float float21 = dynamicChannelBuffer13.readFloat();
        char char22 = dynamicChannelBuffer13.readChar();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) '\000');
        java.io.InputStream inputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dynamicChannelBuffer13.writeBytes(inputStream25, (int) '\u4024');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (byte) 10, (long) '\u640a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        int int10 = dynamicChannelBuffer1.readUnsignedShort();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.bytesBefore(8, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.writeShort((-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = dynamicChannelBuffer1.getDouble((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer1.writeDouble((double) 10.0f);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(6, outputStream13, (int) '\u4024');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        boolean boolean10 = dynamicChannelBuffer1.hasArray();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        boolean boolean22 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.resetReaderIndex();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer24.writeBytes(byteArray32);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer24.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory35 = dynamicChannelBuffer24.factory();
        boolean boolean37 = dynamicChannelBuffer24.equals((java.lang.Object) "");
        dynamicChannelBuffer24.writeLong(100L);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int43 = dynamicChannelBuffer1.bytesBefore(720740, channelBufferIndexFinder42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertNotNull(channelBufferFactory35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.channel.ChannelHandler channelHandler4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext5 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=12, cap=16)", channelHandler4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer15.getbuffer();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer15.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 0);
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        int int22 = dynamicChannelBuffer19.arrayOffset();
        boolean boolean23 = dynamicChannelBuffer19.readable();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        dynamicChannelBuffer11.writeZero((int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer25.resetReaderIndex();
        byte[] byteArray27 = dynamicChannelBuffer25.array();
        dynamicChannelBuffer25.clear();
        dynamicChannelBuffer25.writeLong((long) 0);
        char char31 = dynamicChannelBuffer25.readChar();
        int int33 = dynamicChannelBuffer25.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer35.toString((int) (short) 1, (int) (short) 0, charset38);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer35.getbuffer();
        dynamicChannelBuffer35.writeInt((int) (short) 100);
        boolean boolean43 = dynamicChannelBuffer35.readable();
        int int44 = dynamicChannelBuffer25.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35);
        byte[] byteArray45 = dynamicChannelBuffer25.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer11.readBytes(byteArray45, (int) '\u640a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0]");
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\000' + "'", char31 == '\000');
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            float float23 = dynamicChannelBuffer11.getFloat((int) '\u4024');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        int int12 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dynamicChannelBuffer1.getLong(720740);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        int int10 = dynamicChannelBuffer1.readUnsignedMedium();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        int int17 = dynamicChannelBuffer14.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (byte) 10, channelBufferFactory18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        int int9 = dynamicChannelBuffer1.readerIndex();
        byte byte10 = dynamicChannelBuffer1.readByte();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = dynamicChannelBuffer1.getFloat((int) '\u0aff');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.writeZero((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray15);
        byte[] byteArray17 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int20 = dynamicChannelBuffer19.readableBytes();
        int int21 = dynamicChannelBuffer19.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        java.lang.Class<?> wildcardClass26 = byteArray25.getClass();
        boolean boolean27 = dynamicChannelBuffer19.equals((java.lang.Object) wildcardClass26);
        int int28 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer31 = dynamicChannelBuffer19.toByteBuffer((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            float float14 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBufferFactory13);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeFloat((float) ' ');
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory7 = dynamicChannelBuffer1.getfactory();
        int int8 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.indexOf(0, 0, channelBufferIndexFinder11);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBufferFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        int int11 = dynamicChannelBuffer1.readMedium();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        dynamicChannelBuffer13.writeDouble((double) (short) -1);
        float float21 = dynamicChannelBuffer13.readFloat();
        char char22 = dynamicChannelBuffer13.readChar();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset30 = null;
        java.lang.String str31 = dynamicChannelBuffer27.toString((int) (short) 1, (int) (short) 0, charset30);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory;
        dynamicChannelBuffer27.writeShort(4);
        java.nio.ByteBuffer byteBuffer35 = dynamicChannelBuffer27.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\u640a', byteBuffer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(byteBuffer35);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        int int17 = dynamicChannelBuffer14.writableBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer14.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (byte) 10, channelBufferFactory18);
        byte byte21 = dynamicChannelBuffer19.getByte(5);
        double double23 = dynamicChannelBuffer19.getDouble(0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream11, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        char char13 = dynamicChannelBuffer1.readChar();
        short short14 = dynamicChannelBuffer1.readUnsignedByte();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\u0aff' + "'", char13 == '\u0aff');
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray15);
        byte[] byteArray17 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int20 = dynamicChannelBuffer19.readableBytes();
        int int21 = dynamicChannelBuffer19.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        java.lang.Class<?> wildcardClass26 = byteArray25.getClass();
        boolean boolean27 = dynamicChannelBuffer19.equals((java.lang.Object) wildcardClass26);
        int int28 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        dynamicChannelBuffer1.setDouble(0, (double) 0.0f);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 4, (int) (byte) 10, 16, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        long long14 = dynamicChannelBuffer1.getUnsignedInt((int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray18 = dynamicChannelBuffer16.array();
        dynamicChannelBuffer16.clear();
        dynamicChannelBuffer16.writeLong((long) 0);
        byte byte23 = dynamicChannelBuffer16.getByte(0);
        dynamicChannelBuffer16.writeFloat((float) 1L);
        dynamicChannelBuffer16.setShort((int) (short) 0, (int) (byte) 1);
        int int29 = dynamicChannelBuffer16.readUnsignedMedium();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer16.getfactory();
        java.nio.ByteOrder byteOrder31 = dynamicChannelBuffer16.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer33.resetReaderIndex();
        byte[] byteArray35 = dynamicChannelBuffer33.array();
        dynamicChannelBuffer16.writeBytes(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray35, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 256 + "'", int29 == 256);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertNotNull(byteOrder31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        dynamicChannelBuffer1.writeZero(720740);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer11.getbuffer();
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer11;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = dynamicChannelBuffer5.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer4.resetReaderIndex();
        byte[] byteArray6 = dynamicChannelBuffer4.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer4.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer8.readSlice(0);
        boolean boolean14 = dynamicChannelBuffer8.writable();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer8.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteOrder15);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.resetReaderIndex();
        byte[] byteArray11 = dynamicChannelBuffer9.array();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.writeLong((long) 0);
        dynamicChannelBuffer9.writeDouble((double) (short) -1);
        float float17 = dynamicChannelBuffer9.readFloat();
        dynamicChannelBuffer9.setZero(5, 5);
        float float21 = dynamicChannelBuffer9.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray25 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer23.clear();
        dynamicChannelBuffer23.writeLong((long) 0);
        dynamicChannelBuffer23.writeDouble((double) (short) -1);
        int int31 = dynamicChannelBuffer23.readerIndex();
        byte byte32 = dynamicChannelBuffer23.readByte();
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23, 4);
        int int35 = dynamicChannelBuffer9.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int38 = dynamicChannelBuffer37.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder40 = null;
        int int41 = dynamicChannelBuffer37.bytesBefore((int) '\000', channelBufferIndexFinder40);
        byte[] byteArray42 = dynamicChannelBuffer37.array();
        dynamicChannelBuffer9.writeBytes(byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(65536, byteArray42, (int) '\000', 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 0 + "'", byte32 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0]");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer9.setBytes((int) (byte) 10, scatteringByteChannel15, 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        int int11 = dynamicChannelBuffer1.readMedium();
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray12, 256, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray14 = dynamicChannelBuffer12.array();
        dynamicChannelBuffer12.clear();
        dynamicChannelBuffer12.writeLong((long) 0);
        byte byte19 = dynamicChannelBuffer12.getByte(0);
        int int20 = dynamicChannelBuffer12.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer12.buffer;
        boolean boolean22 = dynamicChannelBuffer1.equals((java.lang.Object) channelBuffer21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.resetReaderIndex();
        byte[] byteArray26 = dynamicChannelBuffer24.array();
        dynamicChannelBuffer24.clear();
        dynamicChannelBuffer24.writeLong((long) 0);
        char char30 = dynamicChannelBuffer24.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer24.factory;
        dynamicChannelBuffer24.markReaderIndex();
        byte[] byteArray33 = dynamicChannelBuffer24.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray33, 1076101120, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0]");
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer16.getbuffer();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, 0);
        dynamicChannelBuffer13.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        dynamicChannelBuffer20.writeInt(5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder25 = null;
        int int26 = dynamicChannelBuffer20.bytesBefore(0, channelBufferIndexFinder25);
        dynamicChannelBuffer1.getBytes((int) (byte) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = dynamicChannelBuffer1.bytesBefore(720740, 65536, channelBufferIndexFinder31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            float float3 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer11.toString((int) (short) 1, (int) (short) 0, charset14);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer11.factory;
        dynamicChannelBuffer11.writeShort(4);
        java.nio.ByteBuffer byteBuffer19 = dynamicChannelBuffer11.toByteBuffer();
        dynamicChannelBuffer1.writeBytes(byteBuffer19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer23.resetReaderIndex();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer23.writeBytes(byteArray31);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory33 = dynamicChannelBuffer23.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory34 = dynamicChannelBuffer23.factory();
        boolean boolean36 = dynamicChannelBuffer23.equals((java.lang.Object) "");
        dynamicChannelBuffer1.getBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) '\u640a', (double) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertNotNull(byteBuffer19);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory33);
        org.junit.Assert.assertNotNull(channelBufferFactory34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.slice((int) '\u640a', (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeFloat((float) ' ');
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory7 = dynamicChannelBuffer1.getfactory();
        int int8 = dynamicChannelBuffer1.readableBytes();
        boolean boolean9 = dynamicChannelBuffer1.writable();
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBufferFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.writeBoolean(false);
        int int14 = dynamicChannelBuffer1.readableBytes();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer4.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer4.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(2, channelBuffer7, 65536, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        int int13 = dynamicChannelBuffer1.indexOf(100, (int) (short) 0, (byte) 0);
        dynamicChannelBuffer1.writeZero((int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer17.writeBytes(byteArray25);
        dynamicChannelBuffer17.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer17.setChar(1, (int) 'a');
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer17;
        // The following exception was thrown during execution in test generation
        try {
            long long35 = dynamicChannelBuffer1.getLong(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int14 = dynamicChannelBuffer1.readUnsignedMedium();
        dynamicChannelBuffer1.writeLong((long) 1);
        int int17 = dynamicChannelBuffer1.arrayOffset();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 256 + "'", int14 == 256);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dynamicChannelBuffer1.getLong((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray12 = dynamicChannelBuffer10.array();
        dynamicChannelBuffer10.clear();
        dynamicChannelBuffer10.writeLong((long) 0);
        dynamicChannelBuffer10.writeDouble((double) (short) -1);
        float float18 = dynamicChannelBuffer10.readFloat();
        dynamicChannelBuffer10.setZero(5, 5);
        float float22 = dynamicChannelBuffer10.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer24.resetReaderIndex();
        byte[] byteArray26 = dynamicChannelBuffer24.array();
        dynamicChannelBuffer24.clear();
        dynamicChannelBuffer24.writeLong((long) 0);
        dynamicChannelBuffer24.writeDouble((double) (short) -1);
        int int32 = dynamicChannelBuffer24.readerIndex();
        byte byte33 = dynamicChannelBuffer24.readByte();
        dynamicChannelBuffer10.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, 4);
        int int36 = dynamicChannelBuffer10.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int39 = dynamicChannelBuffer38.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder41 = null;
        int int42 = dynamicChannelBuffer38.bytesBefore((int) '\000', channelBufferIndexFinder41);
        byte[] byteArray43 = dynamicChannelBuffer38.array();
        dynamicChannelBuffer10.writeBytes(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray43, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.writeByte((int) '\u4024');
        java.nio.channels.ScatteringByteChannel scatteringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        int int14 = dynamicChannelBuffer5.bytesBefore((int) (short) 10, (int) (byte) 0, (byte) 100);
        dynamicChannelBuffer5.writeByte((int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dynamicChannelBuffer1.toString((-1), 720740, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        dynamicChannelBuffer1.setFloat(1, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.indexOf((int) (byte) 0, (int) (byte) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        int int12 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.indexOf((int) (short) 1, (int) ' ', channelBufferIndexFinder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.writeShort(4);
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer1.toByteBuffer();
        dynamicChannelBuffer1.writeByte(10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteBuffer9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.slice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer10.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer10.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0, channelBufferFactory21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer24.getMedium((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        boolean boolean22 = dynamicChannelBuffer1.hasArray();
        int int23 = dynamicChannelBuffer1.readUnsignedShort();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        java.nio.ByteBuffer byteBuffer29 = dynamicChannelBuffer15.toByteBuffer(1, 5);
        int int30 = dynamicChannelBuffer15.readInt();
        long long32 = dynamicChannelBuffer15.getUnsignedInt(0);
        int int33 = dynamicChannelBuffer15.writableBytes();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1076101120 + "'", int30 == 1076101120);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1076101120L + "'", long32 == 1076101120L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer5.duplicate();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer5.buffer;
        // The following exception was thrown during execution in test generation
        try {
            float float8 = dynamicChannelBuffer5.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        java.nio.channels.GatheringByteChannel gatheringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.getBytes(7, gatheringByteChannel11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        int int13 = dynamicChannelBuffer1.indexOf(100, (int) (short) 0, (byte) 0);
        dynamicChannelBuffer1.writeZero((int) '\000');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(100, channelBuffer17, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.writeZero((int) (short) 0);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer17.clear();
        dynamicChannelBuffer17.writeLong((long) 0);
        byte byte24 = dynamicChannelBuffer17.getByte(0);
        long long25 = dynamicChannelBuffer17.readUnsignedInt();
        int int26 = dynamicChannelBuffer17.writableBytes();
        dynamicChannelBuffer17.setShort(0, 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer31.resetReaderIndex();
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer31.writeBytes(byteArray39);
        dynamicChannelBuffer31.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer45.resetReaderIndex();
        byte[] byteArray47 = dynamicChannelBuffer45.array();
        dynamicChannelBuffer45.clear();
        dynamicChannelBuffer45.writeLong((long) 0);
        char char51 = dynamicChannelBuffer45.readChar();
        int int53 = dynamicChannelBuffer45.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset58 = null;
        java.lang.String str59 = dynamicChannelBuffer55.toString((int) (short) 1, (int) (short) 0, charset58);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer60 = dynamicChannelBuffer55.getbuffer();
        dynamicChannelBuffer55.writeInt((int) (short) 100);
        boolean boolean63 = dynamicChannelBuffer55.readable();
        int int64 = dynamicChannelBuffer45.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer55);
        byte[] byteArray65 = dynamicChannelBuffer45.array();
        dynamicChannelBuffer31.readBytes(byteArray65, 1, (int) (byte) 1);
        dynamicChannelBuffer17.readBytes(byteArray65, 7, 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer12.readBytes(byteArray65, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0]");
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '\000' + "'", char51 == '\000');
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(channelBuffer60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 66, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.readSlice(0);
        boolean boolean11 = dynamicChannelBuffer5.writable();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer5.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer17.resetReaderIndex();
        byte[] byteArray19 = dynamicChannelBuffer17.array();
        dynamicChannelBuffer17.clear();
        dynamicChannelBuffer17.writeLong((long) 0);
        char char23 = dynamicChannelBuffer17.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer17.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer14.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory24);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        int int11 = dynamicChannelBuffer1.readMedium();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        byte[] byteArray15 = dynamicChannelBuffer13.array();
        dynamicChannelBuffer13.clear();
        dynamicChannelBuffer13.writeLong((long) 0);
        dynamicChannelBuffer13.writeDouble((double) (short) -1);
        float float21 = dynamicChannelBuffer13.readFloat();
        char char22 = dynamicChannelBuffer13.readChar();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer13.readSlice((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '\000' + "'", char22 == '\000');
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 100, (int) '\000', (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        boolean boolean10 = dynamicChannelBuffer1.isDirect();
        dynamicChannelBuffer1.writeFloat((float) (short) 0);
        dynamicChannelBuffer1.writeZero(8);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer14.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer14.factory();
        boolean boolean27 = dynamicChannelBuffer14.equals((java.lang.Object) "");
        int int28 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        java.nio.ByteOrder byteOrder29 = dynamicChannelBuffer14.order();
        boolean boolean30 = dynamicChannelBuffer14.isDirect();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        int int3 = dynamicChannelBuffer1.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        boolean boolean9 = dynamicChannelBuffer1.equals((java.lang.Object) wildcardClass8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium(16, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer14.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer14.factory();
        boolean boolean27 = dynamicChannelBuffer14.equals((java.lang.Object) "");
        int int28 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer1.copy(6, (int) (short) 2815);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        int int5 = dynamicChannelBuffer1.bytesBefore((int) '\000', channelBufferIndexFinder4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        int int10 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        long long14 = dynamicChannelBuffer1.getUnsignedInt((int) (short) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int19 = dynamicChannelBuffer18.readableBytes();
        int int20 = dynamicChannelBuffer18.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer22.resetReaderIndex();
        byte[] byteArray24 = dynamicChannelBuffer22.array();
        java.lang.Class<?> wildcardClass25 = byteArray24.getClass();
        boolean boolean26 = dynamicChannelBuffer18.equals((java.lang.Object) wildcardClass25);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer28.writeByte((int) (byte) 0);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer18.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer34.resetReaderIndex();
        byte[] byteArray36 = dynamicChannelBuffer34.array();
        dynamicChannelBuffer34.clear();
        dynamicChannelBuffer34.writeLong((long) 0);
        char char40 = dynamicChannelBuffer34.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer34.factory;
        dynamicChannelBuffer34.markReaderIndex();
        byte[] byteArray43 = dynamicChannelBuffer34.array();
        dynamicChannelBuffer18.writeBytes(byteArray43);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\u640a', byteArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\000' + "'", char40 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean13 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeBoolean(true);
        dynamicChannelBuffer1.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setFloat((int) ' ', (float) 4);
        double double24 = dynamicChannelBuffer1.getDouble((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        char char10 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.ensureWritableBytes(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer14.writeBytes(byteArray22);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer14.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer14.factory();
        boolean boolean27 = dynamicChannelBuffer14.equals((java.lang.Object) "");
        int int28 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        java.nio.ByteOrder byteOrder29 = dynamicChannelBuffer14.order();
        dynamicChannelBuffer14.writeZero(0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNotNull(channelBufferFactory25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(byteOrder29);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        int int6 = dynamicChannelBuffer1.readerIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        int int13 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeShort((int) (short) -1);
        dynamicChannelBuffer1.markReaderIndex();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer20.resetReaderIndex();
        byte[] byteArray22 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer20.clear();
        dynamicChannelBuffer20.writeLong((long) 0);
        char char26 = dynamicChannelBuffer20.readChar();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(720740, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        dynamicChannelBuffer1.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = dynamicChannelBuffer1.getFloat((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer11.toString((int) (short) 1, (int) (short) 0, charset14);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer11.getbuffer();
        dynamicChannelBuffer11.writeInt((int) (short) 100);
        boolean boolean19 = dynamicChannelBuffer11.readable();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        byte[] byteArray21 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.resetReaderIndex();
        dynamicChannelBuffer11.setShort(0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, 0, 100]");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer14.getbuffer();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer14.endianness;
        dynamicChannelBuffer7.buffer = dynamicChannelBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer7.getMedium(65536);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65536");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        dynamicChannelBuffer1.writeLong(100L);
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setBoolean((int) (byte) 10, false);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        boolean boolean23 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer25.toString((int) (short) 1, (int) (short) 0, charset28);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer25.factory;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer25.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer33.resetReaderIndex();
        byte[] byteArray35 = dynamicChannelBuffer33.array();
        dynamicChannelBuffer25.writeBytes(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray35, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertNotNull(channelBuffer31);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0]");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        int int25 = dynamicChannelBuffer1.arrayOffset();
        java.io.OutputStream outputStream26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream26, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeByte((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeFloat((float) ' ');
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        java.nio.ByteBuffer byteBuffer29 = dynamicChannelBuffer15.toByteBuffer(1, 5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = dynamicChannelBuffer15.indexOf((int) (short) 0, 1, channelBufferIndexFinder32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer29);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.writeByte((int) '\u4024');
        dynamicChannelBuffer1.writeShort((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setShort((int) '\u0aff', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2815");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        char char13 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.setMedium(0, (int) (byte) 100);
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer1.order();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\u0aff' + "'", char13 == '\u0aff');
        org.junit.Assert.assertNotNull(byteOrder17);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.slice((-1), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer10, (int) '\u4024');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        int int11 = dynamicChannelBuffer1.readMedium();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer13.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) "");
        dynamicChannelBuffer1.writeLong(100L);
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setBoolean((int) (byte) 10, false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer22.resetReaderIndex();
        byte[] byteArray24 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.clear();
        dynamicChannelBuffer22.writeLong((long) 0);
        byte byte29 = dynamicChannelBuffer22.getByte(0);
        dynamicChannelBuffer22.writeFloat((float) 1L);
        dynamicChannelBuffer22.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer36.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer39.getbuffer();
        java.nio.ByteOrder byteOrder41 = dynamicChannelBuffer39.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder41, 0);
        dynamicChannelBuffer36.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43);
        dynamicChannelBuffer36.writeDouble((double) 10.0f);
        int int47 = dynamicChannelBuffer22.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36);
        java.nio.ByteBuffer byteBuffer50 = dynamicChannelBuffer36.toByteBuffer(1, 5);
        dynamicChannelBuffer1.writeBytes(byteBuffer50);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertNotNull(byteOrder41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer50);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.writeShort((int) (short) 1);
        int int4 = dynamicChannelBuffer1.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer1.factory;
        java.io.OutputStream outputStream28 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream28, (int) (short) 2815);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory27);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        float float13 = dynamicChannelBuffer1.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        dynamicChannelBuffer15.writeDouble((double) (short) -1);
        int int23 = dynamicChannelBuffer15.readerIndex();
        byte byte24 = dynamicChannelBuffer15.readByte();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, 4);
        dynamicChannelBuffer1.setInt((int) (short) 0, (int) '\u0aff');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer31.toString((int) (short) 1, (int) (short) 0, charset34);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer31.factory;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer37 = dynamicChannelBuffer31.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(channelBuffer37, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBuffer37);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer6.toString((int) (short) 1, (int) (short) 0, charset9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer6.factory;
        int int12 = dynamicChannelBuffer6.readerIndex();
        int int13 = dynamicChannelBuffer6.readerIndex();
        dynamicChannelBuffer6.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 65536, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        dynamicChannelBuffer1.writeDouble((double) (short) -1);
        float float9 = dynamicChannelBuffer1.readFloat();
        dynamicChannelBuffer1.setZero(5, 5);
        dynamicChannelBuffer1.setLong(5, 1L);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.setBytes((int) '4', scatteringByteChannel17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.clear();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer25.toString((int) (short) 1, (int) (short) 0, charset28);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer25.getbuffer();
        dynamicChannelBuffer25.writeInt((int) (short) 100);
        boolean boolean33 = dynamicChannelBuffer25.readable();
        int int34 = dynamicChannelBuffer15.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        byte[] byteArray35 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer1.readBytes(byteArray35, 1, (int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer1.slice(1, 4);
        int int42 = dynamicChannelBuffer1.readableBytes();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 66, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        int int12 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex(2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(256, (int) (short) -1, channelBufferIndexFinder11);
        int int13 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        int int9 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 0);
        java.lang.String str10 = dynamicChannelBuffer1.toString();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DynamicChannelBuffer(ridx=2, widx=8, cap=8)" + "'", str10, "DynamicChannelBuffer(ridx=2, widx=8, cap=8)");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer23.writeFloat((float) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset30 = null;
        java.lang.String str31 = dynamicChannelBuffer27.toString((int) (short) 1, (int) (short) 0, charset30);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer27.factory;
        int int33 = dynamicChannelBuffer27.readerIndex();
        int int34 = dynamicChannelBuffer27.readerIndex();
        dynamicChannelBuffer27.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset40 = null;
        java.lang.String str41 = dynamicChannelBuffer37.toString((int) (short) 1, (int) (short) 0, charset40);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory42 = dynamicChannelBuffer37.factory;
        dynamicChannelBuffer37.writeShort(4);
        java.nio.ByteBuffer byteBuffer45 = dynamicChannelBuffer37.toByteBuffer();
        dynamicChannelBuffer27.writeBytes(byteBuffer45);
        dynamicChannelBuffer23.readBytes(byteBuffer45);
        dynamicChannelBuffer1.readBytes(byteBuffer45);
        dynamicChannelBuffer1.resetReaderIndex();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(channelBufferFactory42);
        org.junit.Assert.assertNotNull(byteBuffer45);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer16.getbuffer();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, 0);
        dynamicChannelBuffer13.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        dynamicChannelBuffer13.writeDouble((double) 10.0f);
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer26.resetReaderIndex();
        byte[] byteArray28 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer26.clear();
        dynamicChannelBuffer26.writeLong((long) 0);
        byte byte33 = dynamicChannelBuffer26.getByte(0);
        dynamicChannelBuffer26.writeFloat((float) 1L);
        dynamicChannelBuffer26.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer44 = dynamicChannelBuffer43.getbuffer();
        java.nio.ByteOrder byteOrder45 = dynamicChannelBuffer43.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder45, 0);
        dynamicChannelBuffer40.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47);
        dynamicChannelBuffer40.writeDouble((double) 10.0f);
        int int51 = dynamicChannelBuffer26.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        java.nio.ByteBuffer byteBuffer54 = dynamicChannelBuffer40.toByteBuffer(1, 5);
        int int55 = dynamicChannelBuffer40.readInt();
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        // The following exception was thrown during execution in test generation
        try {
            char char58 = dynamicChannelBuffer5.getChar((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1076101120 + "'", int55 == 1076101120);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        boolean boolean15 = dynamicChannelBuffer1.getBoolean(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar(65536, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65536");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.slice();
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer1.toString(256, 0, charset17);
        boolean boolean19 = dynamicChannelBuffer1.isDirect();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        boolean boolean10 = dynamicChannelBuffer1.readable();
        long long11 = dynamicChannelBuffer1.readLong();
        int int15 = dynamicChannelBuffer1.bytesBefore((-4), 0, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte(5, 720740);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble(16, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer5.duplicate();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer5.buffer;
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = dynamicChannelBuffer5.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        int int8 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeDouble(0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer27.resetReaderIndex();
        byte[] byteArray29 = dynamicChannelBuffer27.array();
        dynamicChannelBuffer27.clear();
        dynamicChannelBuffer27.writeLong((long) 0);
        byte byte34 = dynamicChannelBuffer27.getByte(0);
        dynamicChannelBuffer27.setMedium((int) '\000', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0]");
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        dynamicChannelBuffer5.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.setZero(720740, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must be 0 or greater than 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer10.readerIndex((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore(0, channelBufferIndexFinder13);
        int int17 = dynamicChannelBuffer1.bytesBefore(0, (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer1.getbuffer();
        java.nio.channels.GatheringByteChannel gatheringByteChannel19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer1.readBytes(gatheringByteChannel19, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        int int12 = dynamicChannelBuffer1.arrayOffset();
        long long13 = dynamicChannelBuffer1.readLong();
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer1.getUnsignedShort(1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1076101120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1099511627776L) + "'", long13 == (-1099511627776L));
        org.junit.Assert.assertNotNull(byteOrder14);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        dynamicChannelBuffer5.discardReadBytes();
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer5.writeBytes(inputStream12, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        int int12 = dynamicChannelBuffer1.readerIndex();
        int int13 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.getUnsignedShort(5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        int int11 = dynamicChannelBuffer1.readUnsignedMedium();
        boolean boolean12 = dynamicChannelBuffer1.readBoolean();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer16.getbuffer();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, (int) '\u4024', (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 720740 + "'", int11 == 720740);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer13.getbuffer();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, 0);
        dynamicChannelBuffer10.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        dynamicChannelBuffer17.writeInt(5);
        dynamicChannelBuffer17.writeByte(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setBytes(4, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(byteOrder15);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte(5, 720740);
        dynamicChannelBuffer1.writeBoolean(false);
        short short17 = dynamicChannelBuffer1.readUnsignedByte();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 0);
        int int7 = dynamicChannelBuffer5.bytesBefore((byte) -1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer5.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int11 = dynamicChannelBuffer10.readableBytes();
        int int12 = dynamicChannelBuffer10.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer14.resetReaderIndex();
        byte[] byteArray16 = dynamicChannelBuffer14.array();
        java.lang.Class<?> wildcardClass17 = byteArray16.getClass();
        boolean boolean18 = dynamicChannelBuffer10.equals((java.lang.Object) wildcardClass17);
        dynamicChannelBuffer10.writeLong((long) 5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer22.resetReaderIndex();
        byte[] byteArray24 = dynamicChannelBuffer22.array();
        dynamicChannelBuffer22.clear();
        dynamicChannelBuffer22.writeLong((long) 0);
        byte byte29 = dynamicChannelBuffer22.getByte(0);
        byte byte30 = dynamicChannelBuffer22.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer32.resetReaderIndex();
        byte[] byteArray34 = dynamicChannelBuffer32.array();
        dynamicChannelBuffer32.clear();
        dynamicChannelBuffer32.writeLong((long) 0);
        dynamicChannelBuffer32.writeDouble((double) (short) -1);
        int int40 = dynamicChannelBuffer32.readerIndex();
        byte byte41 = dynamicChannelBuffer32.readByte();
        dynamicChannelBuffer22.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer44.writeFloat((float) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset51 = null;
        java.lang.String str52 = dynamicChannelBuffer48.toString((int) (short) 1, (int) (short) 0, charset51);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory53 = dynamicChannelBuffer48.factory;
        int int54 = dynamicChannelBuffer48.readerIndex();
        int int55 = dynamicChannelBuffer48.readerIndex();
        dynamicChannelBuffer48.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer58 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset61 = null;
        java.lang.String str62 = dynamicChannelBuffer58.toString((int) (short) 1, (int) (short) 0, charset61);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory63 = dynamicChannelBuffer58.factory;
        dynamicChannelBuffer58.writeShort(4);
        java.nio.ByteBuffer byteBuffer66 = dynamicChannelBuffer58.toByteBuffer();
        dynamicChannelBuffer48.writeBytes(byteBuffer66);
        dynamicChannelBuffer44.readBytes(byteBuffer66);
        dynamicChannelBuffer22.readBytes(byteBuffer66);
        dynamicChannelBuffer10.readBytes(byteBuffer66);
        dynamicChannelBuffer5.writeBytes(byteBuffer66);
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0]");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 0 + "'", byte29 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 0 + "'", byte30 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(channelBufferFactory53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(channelBufferFactory63);
        org.junit.Assert.assertNotNull(byteBuffer66);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        long long9 = dynamicChannelBuffer1.readUnsignedInt();
        dynamicChannelBuffer1.setFloat(1, (float) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(256);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte(5, 720740);
        // The following exception was thrown during execution in test generation
        try {
            byte byte16 = dynamicChannelBuffer1.getByte((int) (short) 2815);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2815");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.readBytes((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer16.resetReaderIndex();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer16.writeBytes(byteArray24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer16.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer16.factory();
        boolean boolean29 = dynamicChannelBuffer16.equals((java.lang.Object) "");
        dynamicChannelBuffer16.writeLong(100L);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer34.resetReaderIndex();
        byte[] byteArray36 = dynamicChannelBuffer34.array();
        dynamicChannelBuffer34.clear();
        dynamicChannelBuffer34.writeLong((long) 0);
        byte byte41 = dynamicChannelBuffer34.getByte(0);
        dynamicChannelBuffer34.writeFloat((float) 1L);
        dynamicChannelBuffer34.ensureWritableBytes((int) 'a');
        boolean boolean46 = dynamicChannelBuffer34.readable();
        dynamicChannelBuffer34.writeBoolean(true);
        dynamicChannelBuffer34.setDouble(0, 10.0d);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer52 = dynamicChannelBuffer34.slice();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset57 = null;
        java.lang.String str58 = dynamicChannelBuffer54.toString((int) (short) 1, (int) (short) 0, charset57);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory59 = dynamicChannelBuffer54.factory;
        int int60 = dynamicChannelBuffer54.readerIndex();
        int int61 = dynamicChannelBuffer54.readerIndex();
        dynamicChannelBuffer54.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer64 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset67 = null;
        java.lang.String str68 = dynamicChannelBuffer64.toString((int) (short) 1, (int) (short) 0, charset67);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory69 = dynamicChannelBuffer64.factory;
        dynamicChannelBuffer64.writeShort(4);
        java.nio.ByteBuffer byteBuffer72 = dynamicChannelBuffer64.toByteBuffer();
        dynamicChannelBuffer54.writeBytes(byteBuffer72);
        dynamicChannelBuffer34.readBytes(byteBuffer72);
        dynamicChannelBuffer16.getBytes((int) (short) 1, byteBuffer72);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\u640a', byteBuffer72);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(channelBuffer52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(channelBufferFactory59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(channelBufferFactory69);
        org.junit.Assert.assertNotNull(byteBuffer72);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) '\000', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        char char13 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.setMedium(0, (int) (byte) 100);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer20.resetReaderIndex();
        byte[] byteArray22 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer20.clear();
        dynamicChannelBuffer20.writeLong((long) 0);
        byte byte27 = dynamicChannelBuffer20.getByte(0);
        long long28 = dynamicChannelBuffer20.readUnsignedInt();
        int int29 = dynamicChannelBuffer20.writableBytes();
        dynamicChannelBuffer20.writeLong((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\u0aff' + "'", char13 == '\u0aff');
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 0 + "'", byte27 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        java.lang.String str11 = dynamicChannelBuffer7.toString();
        dynamicChannelBuffer1.setBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer14.getbuffer();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer14.endianness;
        dynamicChannelBuffer7.buffer = dynamicChannelBuffer14;
        dynamicChannelBuffer7.clear();
        java.io.InputStream inputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer7.writeBytes(inputStream19, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str11, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeShort((int) (short) 10);
        int int11 = dynamicChannelBuffer1.arrayOffset();
        java.lang.Class<?> wildcardClass12 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.readerIndex();
        dynamicChannelBuffer1.writeInt((int) 'a');
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer1.toByteBuffer(7, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 10]");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer18.getbuffer();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer18.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, 0);
        dynamicChannelBuffer15.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer15.writeDouble((double) 10.0f);
        int int26 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        dynamicChannelBuffer1.discardReadBytes();
        int int28 = dynamicChannelBuffer1.readMedium();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 256 + "'", int28 == 256);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.resetReaderIndex();
        byte[] byteArray11 = dynamicChannelBuffer9.array();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.writeLong((long) 0);
        dynamicChannelBuffer9.writeDouble((double) (short) -1);
        float float17 = dynamicChannelBuffer9.readFloat();
        dynamicChannelBuffer9.setZero(5, 5);
        float float21 = dynamicChannelBuffer9.readFloat();
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer9.endianness;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer9.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer11.getbuffer();
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer11;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer5.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        dynamicChannelBuffer1.setByte((int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        int int7 = dynamicChannelBuffer1.readableBytes();
        dynamicChannelBuffer1.setBoolean((int) (byte) 0, false);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore(720740, (int) (short) 100, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 720740");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.writeInt(5);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer8.bytesBefore(0, channelBufferIndexFinder13);
        java.lang.String str15 = dynamicChannelBuffer8.toString();
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=4, cap=4)" + "'", str15, "DynamicChannelBuffer(ridx=0, widx=4, cap=4)");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        byte byte9 = dynamicChannelBuffer1.readByte();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer11.resetReaderIndex();
        byte[] byteArray13 = dynamicChannelBuffer11.array();
        dynamicChannelBuffer11.clear();
        dynamicChannelBuffer11.writeLong((long) 0);
        dynamicChannelBuffer11.writeDouble((double) (short) -1);
        int int19 = dynamicChannelBuffer11.readerIndex();
        byte byte20 = dynamicChannelBuffer11.readByte();
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer1.getUnsignedMedium(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        dynamicChannelBuffer1.discardReadBytes();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.getfactory();
        boolean boolean9 = dynamicChannelBuffer1.readable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer6.resetReaderIndex();
        byte[] byteArray8 = dynamicChannelBuffer6.array();
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.writeLong((long) 0);
        int int12 = dynamicChannelBuffer6.writerIndex();
        byte[] byteArray13 = dynamicChannelBuffer6.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (short) 100);
        dynamicChannelBuffer1.writeChar((int) '\u4024');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.setShort((int) (short) 0, (int) (byte) 1);
        int int16 = dynamicChannelBuffer1.bytesBefore(5, (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer18.resetReaderIndex();
        byte[] byteArray20 = dynamicChannelBuffer18.array();
        dynamicChannelBuffer18.clear();
        dynamicChannelBuffer18.writeLong((long) 0);
        dynamicChannelBuffer18.writeDouble((double) (short) -1);
        float float26 = dynamicChannelBuffer18.readFloat();
        dynamicChannelBuffer18.setZero(5, 5);
        float float30 = dynamicChannelBuffer18.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer32.resetReaderIndex();
        byte[] byteArray34 = dynamicChannelBuffer32.array();
        dynamicChannelBuffer32.clear();
        dynamicChannelBuffer32.writeLong((long) 0);
        dynamicChannelBuffer32.writeDouble((double) (short) -1);
        int int40 = dynamicChannelBuffer32.readerIndex();
        byte byte41 = dynamicChannelBuffer32.readByte();
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32, 4);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer32);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 0 + "'", byte41 == (byte) 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        int int9 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.buffer;
        java.nio.ByteBuffer byteBuffer11 = dynamicChannelBuffer1.toByteBuffer();
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.setBytes(0, inputStream13, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteBuffer11);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int7 = dynamicChannelBuffer6.readableBytes();
        int int8 = dynamicChannelBuffer6.writableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer10.resetReaderIndex();
        byte[] byteArray12 = dynamicChannelBuffer10.array();
        java.lang.Class<?> wildcardClass13 = byteArray12.getClass();
        boolean boolean14 = dynamicChannelBuffer6.equals((java.lang.Object) wildcardClass13);
        boolean boolean15 = dynamicChannelBuffer6.hasArray();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer6;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer6.bytesBefore(8, (int) '\u4024', (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer4.getbuffer();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer4.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, 0);
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        dynamicChannelBuffer8.writeInt(5);
        dynamicChannelBuffer8.writeByte(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setByte((int) (byte) 100, (int) (short) 2815);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(byteOrder6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.resetReaderIndex();
        java.nio.ByteBuffer[] byteBufferArray15 = dynamicChannelBuffer1.toByteBuffers();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(byteBufferArray15);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        dynamicChannelBuffer1.ensureWritableBytes(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeLong((long) (byte) 100);
        int int14 = dynamicChannelBuffer1.readMedium();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer7.resetReaderIndex();
        byte[] byteArray9 = dynamicChannelBuffer7.array();
        dynamicChannelBuffer7.clear();
        dynamicChannelBuffer7.writeLong((long) 0);
        byte byte14 = dynamicChannelBuffer7.getByte(0);
        long long15 = dynamicChannelBuffer7.readUnsignedInt();
        int int16 = dynamicChannelBuffer7.writableBytes();
        int int17 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer7.indexOf((int) '#', 5, channelBufferIndexFinder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=1)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=0, cap=1)");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-4) + "'", int17 == (-4));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        boolean boolean9 = dynamicChannelBuffer5.writable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer12.resetReaderIndex();
        byte[] byteArray14 = dynamicChannelBuffer12.array();
        dynamicChannelBuffer12.clear();
        dynamicChannelBuffer12.writeLong((long) 0);
        dynamicChannelBuffer12.writeDouble((double) (short) -1);
        float float20 = dynamicChannelBuffer12.readFloat();
        dynamicChannelBuffer12.setZero(5, 5);
        float float24 = dynamicChannelBuffer12.readFloat();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer26.resetReaderIndex();
        byte[] byteArray28 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer26.clear();
        dynamicChannelBuffer26.writeLong((long) 0);
        dynamicChannelBuffer26.writeDouble((double) (short) -1);
        int int34 = dynamicChannelBuffer26.readerIndex();
        byte byte35 = dynamicChannelBuffer26.readByte();
        dynamicChannelBuffer12.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, 4);
        int int38 = dynamicChannelBuffer12.readUnsignedShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int41 = dynamicChannelBuffer40.readableBytes();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder43 = null;
        int int44 = dynamicChannelBuffer40.bytesBefore((int) '\000', channelBufferIndexFinder43);
        byte[] byteArray45 = dynamicChannelBuffer40.array();
        dynamicChannelBuffer12.writeBytes(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer5.getBytes((int) (short) 100, byteArray45, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        dynamicChannelBuffer1.setFloat((int) (short) 0, 100.0f);
        dynamicChannelBuffer1.resetReaderIndex();
        long long15 = dynamicChannelBuffer1.readUnsignedInt();
        byte byte16 = dynamicChannelBuffer1.readByte();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1120403456L + "'", long15 == 1120403456L);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (int) (short) 1, (int) (short) -1, 10, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer8.resetReaderIndex();
        byte[] byteArray10 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray10);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore(0, channelBufferIndexFinder13);
        int int17 = dynamicChannelBuffer1.bytesBefore(0, (byte) 0);
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 10, outputStream19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.setMedium((int) '\000', (int) (short) -1);
        int int12 = dynamicChannelBuffer1.arrayOffset();
        int int13 = dynamicChannelBuffer1.readInt();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-256) + "'", int13 == (-256));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer5.resetReaderIndex();
        byte[] byteArray7 = dynamicChannelBuffer5.array();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
        int int10 = dynamicChannelBuffer5.bytesBefore((byte) 100);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer5.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer13.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer16.getbuffer();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, 0);
        dynamicChannelBuffer13.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        dynamicChannelBuffer13.writeDouble((double) 10.0f);
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer26.resetReaderIndex();
        byte[] byteArray28 = dynamicChannelBuffer26.array();
        dynamicChannelBuffer26.clear();
        dynamicChannelBuffer26.writeLong((long) 0);
        byte byte33 = dynamicChannelBuffer26.getByte(0);
        dynamicChannelBuffer26.writeFloat((float) 1L);
        dynamicChannelBuffer26.setShort((int) (short) 0, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer40.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer44 = dynamicChannelBuffer43.getbuffer();
        java.nio.ByteOrder byteOrder45 = dynamicChannelBuffer43.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder45, 0);
        dynamicChannelBuffer40.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47);
        dynamicChannelBuffer40.writeDouble((double) 10.0f);
        int int51 = dynamicChannelBuffer26.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        java.nio.ByteBuffer byteBuffer54 = dynamicChannelBuffer40.toByteBuffer(1, 5);
        int int55 = dynamicChannelBuffer40.readInt();
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        byte[] byteArray58 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer40.getBytes((-1), byteArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0]");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBuffer44);
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1076101120 + "'", int55 == 1076101120);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer4.toString((int) (short) 1, (int) (short) 0, charset7);
        dynamicChannelBuffer4.discardReadBytes();
        int int10 = dynamicChannelBuffer4.readerIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer4.getfactory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer4.bytesBefore((int) '\000', channelBufferIndexFinder13);
        dynamicChannelBuffer1.setBytes(5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4);
        java.nio.channels.GatheringByteChannel gatheringByteChannel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer1.readBytes(gatheringByteChannel16, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        char char7 = dynamicChannelBuffer1.readChar();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        short short10 = dynamicChannelBuffer1.getUnsignedByte((int) (short) 1);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 10 };
        dynamicChannelBuffer1.writeBytes(byteArray9);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer1.factory();
        char char13 = dynamicChannelBuffer1.readChar();
        dynamicChannelBuffer1.setMedium(0, (int) (byte) 100);
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, -1, 100, 10, 100, 10]");
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\u0aff' + "'", char13 == '\u0aff');
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        byte byte8 = dynamicChannelBuffer1.getByte(0);
        dynamicChannelBuffer1.writeFloat((float) 1L);
        dynamicChannelBuffer1.ensureWritableBytes((int) 'a');
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.slice(100, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer1.toString((int) (short) 1, (int) (short) 0, charset4);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer1.factory;
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        int int11 = dynamicChannelBuffer10.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        int int25 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer1.readBytes((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = dynamicChannelBuffer1.indexOf(4, 256, channelBufferIndexFinder30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(channelBuffer27);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.getbuffer();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.setBytes((int) (byte) 10, inputStream4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer1.resetReaderIndex();
        byte[] byteArray3 = dynamicChannelBuffer1.array();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.writeLong((long) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer9.writeByte((int) (byte) 0);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 1);
        dynamicChannelBuffer15.resetReaderIndex();
        byte[] byteArray17 = dynamicChannelBuffer15.array();
        dynamicChannelBuffer15.clear();
        dynamicChannelBuffer15.writeLong((long) 0);
        char char21 = dynamicChannelBuffer15.readChar();
        int int23 = dynamicChannelBuffer15.getUnsignedMedium((int) (byte) 0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer15.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setShort((int) (short) 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(byteOrder25);
    }
}

