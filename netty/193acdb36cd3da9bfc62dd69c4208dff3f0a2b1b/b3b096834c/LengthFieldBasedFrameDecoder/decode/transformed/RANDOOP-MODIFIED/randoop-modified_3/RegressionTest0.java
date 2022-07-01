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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext8 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
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
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (byte) 10, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) -1, channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext8 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = org.jboss.netty.channel.Channel.OP_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) 'a', channelBufferFactory2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray3 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray3, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) -1, (int) (byte) 0, 10, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = dynamicChannelBuffer1.getByte((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer8.toByteBuffer((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        java.nio.ByteBuffer byteBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer10.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) ' ', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short5 = dynamicChannelBuffer1.getShort(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = org.jboss.netty.channel.Channel.OP_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) '4', (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext18 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        lengthFieldBasedFrameDecoder7.setbytesToDiscard((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext13 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (short) 100, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.getUnsignedMedium((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer13.buffer = dynamicChannelBuffer15;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = dynamicChannelBuffer15.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dynamicChannelBuffer1.toString((int) 'a', (int) (byte) 1, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        dynamicChannelBuffer1.setBytes(1, byteArray4);
        byte[] byteArray8 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[100]");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        dynamicChannelBuffer1.setBytes(1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((-1), 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 0, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        dynamicChannelBuffer7.setBytes(1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray10, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        int int10 = lengthFieldBasedFrameDecoder7.getlengthFieldOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.readerIndex((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 100, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, -1, 10]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        dynamicChannelBuffer14.setBytes(1, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray17, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer17.getBytes((int) (byte) 1, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.readBytes(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.setByte((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.readerIndex((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) -1, 0, (int) (byte) 10, 4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes((int) (short) 0, scatteringByteChannel6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        dynamicChannelBuffer10.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer17.bytesBefore((int) ' ', 4, channelBufferIndexFinder25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short2 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        int int10 = dynamicChannelBuffer1.capacity();
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, outputStream12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        dynamicChannelBuffer1.setBytes(1, byteArray4);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) '#', inputStream7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        int int10 = lengthFieldBasedFrameDecoder7.maxFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int0 = org.jboss.netty.channel.Channel.OP_READ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 1, (int) (byte) 10, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.getInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.setbytesToDiscard((long) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) '#', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setMedium(97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        dynamicChannelBuffer10.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext23, channelEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 10, outputStream20, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer8.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            short short14 = dynamicChannelBuffer8.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dynamicChannelBuffer7.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        boolean boolean9 = dynamicChannelBuffer6.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer6.getfactory();
        dynamicChannelBuffer6.resetWriterIndex();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer6.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer16.toString(charset17);
        boolean boolean19 = dynamicChannelBuffer16.readable();
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer16.getBytes((int) (byte) 1, byteArray23);
        dynamicChannelBuffer14.writeBytes(byteArray23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean28 = dynamicChannelBuffer27.writable();
        dynamicChannelBuffer14.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(97, byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, 0, 1]");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            byte byte10 = dynamicChannelBuffer9.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(2, (int) (short) 1, (int) (byte) -1, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.nio.ByteOrder byteOrder0 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer3.toString(charset4);
        boolean boolean6 = dynamicChannelBuffer3.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory7 = dynamicChannelBuffer3.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 1, channelBufferFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext13 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        // The following exception was thrown during execution in test generation
        try {
            short short4 = dynamicChannelBuffer1.getShort(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.writeInt(1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.compareTo(channelBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer3.getendianness();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer3.writeBytes(inputStream6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        java.io.InputStream inputStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dynamicChannelBuffer22.writeBytes(inputStream25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer3.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dynamicChannelBuffer3.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer19.getBytes((int) (byte) 1, byteArray26);
        dynamicChannelBuffer19.writeBoolean(false);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0]");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer8.bytesBefore((int) (short) -1, channelBufferIndexFinder10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) -1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long7 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int0 = org.jboss.netty.channel.Channel.OP_READ_WRITE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setZero((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = null;
        dynamicChannelBuffer1.buffer = channelBuffer2;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getMedium(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        java.nio.channels.GatheringByteChannel gatheringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.getBytes(97, gatheringByteChannel12, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        java.nio.ByteBuffer byteBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) -1, byteBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(98, (int) (byte) -1, (int) (short) -1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        lengthFieldBasedFrameDecoder7.settooLongFrameLength((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        long long11 = lengthFieldBasedFrameDecoder7.tooLongFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        java.nio.ByteBuffer byteBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer7.buffer = dynamicChannelBuffer9;
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer9.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory12 = dynamicChannelBuffer9.factory;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = lengthFieldBasedFrameDecoder3.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(channelBufferFactory12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = null;
        dynamicChannelBuffer1.buffer = channelBuffer2;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) (byte) 100, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 5, 98, (int) (short) 100, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 98");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext4, writeCompletionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int7 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer10.getBytes((int) (byte) 1, byteArray17);
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer10.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder19);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        double double32 = dynamicChannelBuffer7.getDouble(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.readerIndex((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, 0, (int) (byte) -1, (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 100);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(2, (int) '4', (int) (byte) -1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext9 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer27.toString(charset28);
        boolean boolean30 = dynamicChannelBuffer27.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer27.getfactory();
        dynamicChannelBuffer27.resetWriterIndex();
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset37 = null;
        java.lang.String str38 = dynamicChannelBuffer36.toString(charset37);
        boolean boolean39 = dynamicChannelBuffer36.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory40 = dynamicChannelBuffer36.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, (int) 'a', channelBufferFactory40);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, 97);
        java.nio.ByteBuffer byteBuffer48 = dynamicChannelBuffer45.toByteBuffer((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.getBytes(5, byteBuffer48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory40);
        org.junit.Assert.assertNotNull(byteBuffer48);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer17.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer17.getInt(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer19.getfactory();
        dynamicChannelBuffer19.resetWriterIndex();
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer19.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer28.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder25, (int) 'a', channelBufferFactory32);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        int int10 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore((int) (short) 1, (int) ' ', channelBufferIndexFinder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        double double32 = dynamicChannelBuffer7.getDouble(0);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int36 = dynamicChannelBuffer7.setBytes((int) (short) -1, scatteringByteChannel34, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '4', byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, 10, 0, 100, 10]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer20.getBytes((int) (byte) 1, byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray27, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0]");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer15.setBytes((int) (short) 0, inputStream17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer7.readBytes((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, (int) 'a', channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, 97);
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer29.toByteBuffer((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', byteBuffer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer12.writeBytes(byteArray19);
        int int21 = dynamicChannelBuffer12.capacity();
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer12.getUnsignedMedium((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        long long6 = lengthFieldBasedFrameDecoder3.gettooLongFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        int int8 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder7);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer17.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setDouble((int) (short) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.getChar(98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = dynamicChannelBuffer7.bytesBefore(98, channelBufferIndexFinder32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        int int11 = lengthFieldBasedFrameDecoder7.getinitialBytesToStrip();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 10, 97, 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) -1, channelBufferFactory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        long long13 = lengthFieldBasedFrameDecoder7.gettooLongFrameLength();
        lengthFieldBasedFrameDecoder7.settooLongFrameLength((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext16 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        long long6 = lengthFieldBasedFrameDecoder3.gettooLongFrameLength();
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext8, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, channelBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        // The following exception was thrown during execution in test generation
        try {
            short short16 = dynamicChannelBuffer15.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer19.toByteBuffer((int) ' ', (int) (short) 0);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer19.writeBytes(scatteringByteChannel23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer7.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer7.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder7.lengthFieldLength;
        long long11 = lengthFieldBasedFrameDecoder7.tooLongFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) ' ', (int) (short) 0, (int) (short) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        int int20 = dynamicChannelBuffer11.capacity();
        java.lang.Object obj21 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int22 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext23 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        int int10 = lengthFieldBasedFrameDecoder7.getlengthFieldOffset();
        int int11 = lengthFieldBasedFrameDecoder7.getlengthAdjustment();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        long long13 = lengthFieldBasedFrameDecoder7.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer17.getBytes((int) (byte) 1, byteArray24);
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer17.endianness;
        java.lang.Object obj27 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext14, channel15, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext28 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer22.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setByte(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthAdjustment();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.setBytes((int) '4', inputStream11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium(2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (byte) 10, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) -1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        byte[] byteArray4 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.getChar((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        boolean boolean4 = dynamicChannelBuffer1.writable();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.getChar((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset6 = null;
        java.lang.String str7 = dynamicChannelBuffer5.toString(charset6);
        boolean boolean8 = dynamicChannelBuffer5.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(97, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, 1, 5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            float float2 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        java.nio.channels.GatheringByteChannel gatheringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.getBytes(0, gatheringByteChannel7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer12.getfactory();
        dynamicChannelBuffer12.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 100, channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer28.getfactory();
        dynamicChannelBuffer28.resetWriterIndex();
        java.nio.ByteOrder byteOrder34 = dynamicChannelBuffer28.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer37.toString(charset38);
        boolean boolean40 = dynamicChannelBuffer37.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer37.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, (int) 'a', channelBufferFactory41);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, 97);
        java.nio.ByteBuffer byteBuffer49 = dynamicChannelBuffer46.toByteBuffer((int) ' ', (int) (short) 0);
        dynamicChannelBuffer25.getBytes((int) (short) 0, byteBuffer49);
        dynamicChannelBuffer25.ensureWritableBytes(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset55 = null;
        java.lang.String str56 = dynamicChannelBuffer54.toString(charset55);
        boolean boolean57 = dynamicChannelBuffer54.readable();
        byte[] byteArray61 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer54.getBytes((int) (byte) 1, byteArray61);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer25.writeBytes(byteArray61, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory41);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 0]");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setBoolean(5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.ensureWritableBytes(1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer14.toString(charset15);
        boolean boolean17 = dynamicChannelBuffer14.readable();
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer14.writeBytes(byteArray21);
        int int23 = dynamicChannelBuffer14.capacity();
        java.lang.Object obj24 = lengthFieldBasedFrameDecoder10.decode(channelHandlerContext11, channel12, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        dynamicChannelBuffer1.writeShort(0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.bytesBefore((int) 'a', (int) (short) 100, channelBufferIndexFinder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        double double32 = dynamicChannelBuffer7.getDouble(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset36 = null;
        java.lang.String str37 = dynamicChannelBuffer35.toString(charset36);
        float float39 = dynamicChannelBuffer35.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset42 = null;
        java.lang.String str43 = dynamicChannelBuffer41.toString(charset42);
        boolean boolean44 = dynamicChannelBuffer41.readable();
        byte[] byteArray48 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer41.getBytes((int) (byte) 1, byteArray48);
        dynamicChannelBuffer41.writeBoolean(false);
        dynamicChannelBuffer35.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer41);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer41, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[0, 0]");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '#');
        java.nio.channels.ScatteringByteChannel scatteringByteChannel2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = dynamicChannelBuffer1.factory();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.writeBytes(inputStream3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBufferFactory2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        byte[] byteArray7 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        int int26 = dynamicChannelBuffer9.getUnsignedShort((int) (byte) 0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = dynamicChannelBuffer9.getBytes(1, gatheringByteChannel28, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer8.getfactory();
        long long15 = dynamicChannelBuffer8.getUnsignedInt(5);
        java.io.InputStream inputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer8.setBytes((int) (short) 0, inputStream17, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(98, (int) (short) 0, (int) (short) -1, 2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        boolean boolean9 = lengthFieldBasedFrameDecoder7.getlengthFieldIncludedInFrameLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 0, (-1), (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        long long13 = lengthFieldBasedFrameDecoder7.gettooLongFrameLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext14 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 100, 100, (int) (short) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        dynamicChannelBuffer10.writeShort((int) (byte) 1);
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = dynamicChannelBuffer9.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        boolean boolean4 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.writeChar(10);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.setBytes((int) ' ', inputStream8, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar(97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            char char2 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.ensureWritableBytes(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) -1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer3.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer3.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray12 = new byte[] { (byte) 10 };
        dynamicChannelBuffer9.setBytes(1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.setBytes((int) '4', byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10]");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 5, (int) (byte) 1);
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.writeInt(1);
        int int5 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder9.bytesToDiscard = 0;
        boolean boolean12 = lengthFieldBasedFrameDecoder9.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder9.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.Channel channel16 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        dynamicChannelBuffer18.resetWriterIndex();
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer28.getBytes((int) (byte) 1, byteArray35);
        dynamicChannelBuffer26.writeBytes(byteArray35);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean40 = dynamicChannelBuffer39.writable();
        dynamicChannelBuffer26.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39);
        dynamicChannelBuffer39.resetWriterIndex();
        dynamicChannelBuffer39.writeLong((long) (byte) 0);
        boolean boolean45 = dynamicChannelBuffer39.isDirect();
        java.lang.Object obj46 = lengthFieldBasedFrameDecoder9.decode(channelHandlerContext15, channel16, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer39, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer13.getBytes((int) (byte) 1, byteArray20);
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer13.endianness;
        java.lang.Object obj23 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext10, channel11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer13.getUnsignedShort(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 5, (int) (byte) 1);
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 10, (int) 'a', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = (short) -1;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext15 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 98, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext13 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        int int10 = dynamicChannelBuffer1.capacity();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.setBytes(0, scatteringByteChannel12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        byte[] byteArray7 = dynamicChannelBuffer1.array();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.bytesBefore((int) (byte) 10, (int) (short) 1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory4 = dynamicChannelBuffer1.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean((int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(channelBufferFactory4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.endianness;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = dynamicChannelBuffer19.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder20);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer3.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.readBytes((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        dynamicChannelBuffer6.setBytes(1, byteArray9);
        dynamicChannelBuffer6.writeChar((int) (short) 10);
        dynamicChannelBuffer6.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(5, outputStream6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer13.getfactory();
        dynamicChannelBuffer13.resetWriterIndex();
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer13.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer22.toString(charset23);
        boolean boolean25 = dynamicChannelBuffer22.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer22.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) 'a', channelBufferFactory26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, 4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer29.getbuffer();
        java.lang.Object obj31 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext10, channel11, channelBuffer30);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext32 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.Channel channel7 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer9.getfactory();
        dynamicChannelBuffer9.resetWriterIndex();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) 'a', channelBufferFactory22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, 4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer25.getbuffer();
        java.lang.Object obj27 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext6, channel7, channelBuffer26);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent29 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext28, childChannelStateEvent29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(channelBuffer26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        int int10 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setInt(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setShort(97, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            char char9 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(97, 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 4, (int) ' ', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int18 = lengthFieldBasedFrameDecoder7.getlengthFieldEndOffset();
        boolean boolean19 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        int int20 = lengthFieldBasedFrameDecoder7.getinitialBytesToStrip();
        long long21 = lengthFieldBasedFrameDecoder7.bytesToDiscard;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext22 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        dynamicChannelBuffer18.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset26 = null;
        java.lang.String str27 = dynamicChannelBuffer25.toString(charset26);
        boolean boolean28 = dynamicChannelBuffer25.readable();
        dynamicChannelBuffer18.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer25.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 10, channelBufferFactory30);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = dynamicChannelBuffer31.getUnsignedInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, 1, (int) (byte) 10, (int) (byte) 100, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.writeInt(1);
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) 'a', byteArray6, 5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        int int15 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext16, channelEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int16 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        long long17 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext18, writeCompletionEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            short short13 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeZero((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must be 0 or greater than 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder6.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        float float22 = dynamicChannelBuffer18.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset25 = null;
        java.lang.String str26 = dynamicChannelBuffer24.toString(charset25);
        boolean boolean27 = dynamicChannelBuffer24.readable();
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer24.getBytes((int) (byte) 1, byteArray31);
        dynamicChannelBuffer24.writeBoolean(false);
        dynamicChannelBuffer18.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer37.toString(charset38);
        boolean boolean40 = dynamicChannelBuffer37.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer37.getfactory();
        dynamicChannelBuffer37.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder43 = null;
        int int44 = dynamicChannelBuffer37.bytesBefore(channelBufferIndexFinder43);
        dynamicChannelBuffer24.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37, (int) (byte) 10, 0);
        dynamicChannelBuffer10.buffer = dynamicChannelBuffer37;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.setbytesToDiscard((long) '#');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.ensureWritableBytes(1);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer12.writeBytes(byteArray19);
        int int21 = dynamicChannelBuffer12.capacity();
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext23, childChannelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        dynamicChannelBuffer1.writeShort(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean12 = dynamicChannelBuffer11.writable();
        dynamicChannelBuffer11.writeInt(1);
        int int15 = dynamicChannelBuffer11.capacity();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setZero((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        int int10 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setInt(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = dynamicChannelBuffer1.getUnsignedByte((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer9.getfactory();
        dynamicChannelBuffer9.resetWriterIndex();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) 'a', channelBufferFactory22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, (int) (short) 10, channelBufferFactory22);
        java.nio.charset.Charset charset27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dynamicChannelBuffer24.toString(0, 100, charset27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (-1), (int) (short) 1, (int) (byte) 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext8 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer19.toByteBuffer((int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer19.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        dynamicChannelBuffer1.writeShort((int) ' ');
        int int6 = dynamicChannelBuffer1.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = dynamicChannelBuffer1.getByte(98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.readBytes((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer22.resetWriterIndex();
        dynamicChannelBuffer22.writeLong((long) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset31 = null;
        java.lang.String str32 = dynamicChannelBuffer30.toString(charset31);
        boolean boolean33 = dynamicChannelBuffer30.readable();
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer30.getBytes((int) (byte) 1, byteArray37);
        dynamicChannelBuffer30.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset43 = null;
        java.lang.String str44 = dynamicChannelBuffer42.toString(charset43);
        boolean boolean45 = dynamicChannelBuffer42.readable();
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer42.getBytes((int) (byte) 1, byteArray49);
        dynamicChannelBuffer30.writeBytes(byteArray49);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.getBytes(98, byteArray49, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        int int5 = dynamicChannelBuffer3.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.setLong((int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer9.bytesBefore((int) (short) -1, channelBufferIndexFinder11);
        dynamicChannelBuffer9.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) 'a', channelBufferFactory22);
        dynamicChannelBuffer23.writeFloat((float) 2);
        java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer23.toByteBuffer(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) -1, byteBuffer28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(byteBuffer28);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer17.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.readerIndex((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean7 = lengthFieldBasedFrameDecoder3.getlengthFieldIncludedInFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        boolean boolean7 = lengthFieldBasedFrameDecoder3.getlengthFieldIncludedInFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) (byte) 10, 4, 5, (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer12.getfactory();
        dynamicChannelBuffer12.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 100, channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer28.getfactory();
        dynamicChannelBuffer28.resetWriterIndex();
        java.nio.ByteOrder byteOrder34 = dynamicChannelBuffer28.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer37.toString(charset38);
        boolean boolean40 = dynamicChannelBuffer37.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer37.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, (int) 'a', channelBufferFactory41);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, 97);
        java.nio.ByteBuffer byteBuffer49 = dynamicChannelBuffer46.toByteBuffer((int) ' ', (int) (short) 0);
        dynamicChannelBuffer25.getBytes((int) (short) 0, byteBuffer49);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer25.skipBytes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory41);
        org.junit.Assert.assertNotNull(byteBuffer49);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int18 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext21, childChannelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 0, 100, 5, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) 'a', 1, 4, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (97) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        int int11 = lengthFieldBasedFrameDecoder7.getinitialBytesToStrip();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (-1), 5, (-1), (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        long long10 = lengthFieldBasedFrameDecoder7.tooLongFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer19.getfactory();
        dynamicChannelBuffer19.resetWriterIndex();
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer19.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder25, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset30 = null;
        java.lang.String str31 = dynamicChannelBuffer29.toString(charset30);
        boolean boolean32 = dynamicChannelBuffer29.readable();
        byte[] byteArray36 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer29.getBytes((int) (byte) 1, byteArray36);
        dynamicChannelBuffer27.writeBytes(byteArray36);
        dynamicChannelBuffer17.writeBytes(byteArray36);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset43 = null;
        java.lang.String str44 = dynamicChannelBuffer42.toString(charset43);
        boolean boolean45 = dynamicChannelBuffer42.readable();
        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer42.getBytes((int) (byte) 1, byteArray49);
        dynamicChannelBuffer42.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer54 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset55 = null;
        java.lang.String str56 = dynamicChannelBuffer54.toString(charset55);
        boolean boolean57 = dynamicChannelBuffer54.readable();
        byte[] byteArray61 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer54.getBytes((int) (byte) 1, byteArray61);
        dynamicChannelBuffer42.writeBytes(byteArray61);
        dynamicChannelBuffer17.getBytes(2, byteArray61);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer66 = dynamicChannelBuffer17.readSlice(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[0, 0]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer8.getfactory();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder18.bytesToDiscard = 0;
        boolean boolean21 = lengthFieldBasedFrameDecoder18.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder18.discardingTooLongFrame = false;
        long long24 = lengthFieldBasedFrameDecoder18.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        org.jboss.netty.channel.Channel channel26 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer28.getBytes((int) (byte) 1, byteArray35);
        java.nio.ByteOrder byteOrder37 = dynamicChannelBuffer28.endianness;
        java.lang.Object obj38 = lengthFieldBasedFrameDecoder18.decode(channelHandlerContext25, channel26, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.getBytes((int) (short) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.settooLongFrameLength((long) (short) 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 2, channelBufferFactory16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.setIndex((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = (byte) 10;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeShort(1);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) (short) 1);
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dynamicChannelBuffer1.toString(charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer9.getfactory();
        dynamicChannelBuffer9.resetWriterIndex();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) 'a', channelBufferFactory22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, (int) (short) 10, channelBufferFactory22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, (int) (short) 100, channelBufferFactory28);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = dynamicChannelBuffer29.bytesBefore(100, channelBufferIndexFinder31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(channelBufferFactory28);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        int int9 = dynamicChannelBuffer1.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray12 = dynamicChannelBuffer1.toByteBuffers((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer3.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int8 = dynamicChannelBuffer7.capacity();
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer7.getendianness();
        dynamicChannelBuffer7.writeShort((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 2, channelBufferFactory16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 1);
        java.io.InputStream inputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer19.writeBytes(inputStream20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.initialBytesToStrip;
        int int9 = lengthFieldBasedFrameDecoder7.initialBytesToStrip;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        long long10 = lengthFieldBasedFrameDecoder7.tooLongFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer12.writeBytes(byteArray19);
        int int21 = dynamicChannelBuffer12.capacity();
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.MessageEvent messageEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext23, messageEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        long long6 = lengthFieldBasedFrameDecoder3.gettooLongFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer15.toString(charset16);
        float float19 = dynamicChannelBuffer15.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset22 = null;
        java.lang.String str23 = dynamicChannelBuffer21.toString(charset22);
        boolean boolean24 = dynamicChannelBuffer21.readable();
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer21.getBytes((int) (byte) 1, byteArray28);
        dynamicChannelBuffer21.writeBoolean(false);
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset35 = null;
        java.lang.String str36 = dynamicChannelBuffer34.toString(charset35);
        boolean boolean37 = dynamicChannelBuffer34.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer34.getfactory();
        dynamicChannelBuffer34.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder40 = null;
        int int41 = dynamicChannelBuffer34.bytesBefore(channelBufferIndexFinder40);
        dynamicChannelBuffer21.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer34, (int) (byte) 10, 0);
        dynamicChannelBuffer7.buffer = dynamicChannelBuffer34;
        dynamicChannelBuffer34.ensureWritableBytes(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder51 = null;
        int int52 = dynamicChannelBuffer49.bytesBefore((int) (short) -1, channelBufferIndexFinder51);
        dynamicChannelBuffer49.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder55 = dynamicChannelBuffer49.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer57 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder55, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer60 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset61 = null;
        java.lang.String str62 = dynamicChannelBuffer60.toString(charset61);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory63 = dynamicChannelBuffer60.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer64 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder55, (int) (byte) 1, channelBufferFactory63);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer34.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer64, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteOrder55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(channelBufferFactory63);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        dynamicChannelBuffer10.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer17.bytesBefore(98, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(2, 4, (-1), 1, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        int int20 = dynamicChannelBuffer11.capacity();
        java.lang.Object obj21 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext22 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, 100, (int) ' ', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        int int10 = lengthFieldBasedFrameDecoder7.maxFrameLength;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0L;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext13 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.endianness;
        dynamicChannelBuffer19.discardReadBytes();
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer19.writeBytes(inputStream22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder20);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = null;
        dynamicChannelBuffer1.buffer = channelBuffer2;
        java.nio.channels.GatheringByteChannel gatheringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readBytes(gatheringByteChannel4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer9.getfactory();
        dynamicChannelBuffer9.resetWriterIndex();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) 'a', channelBufferFactory22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, (int) (short) 10, channelBufferFactory22);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer27.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder6, (int) (short) 100, channelBufferFactory28);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer29.copy();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dynamicChannelBuffer29.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertNotNull(channelBuffer30);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        dynamicChannelBuffer1.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer13.getfactory();
        dynamicChannelBuffer13.resetWriterIndex();
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer13.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer22.toString(charset23);
        boolean boolean25 = dynamicChannelBuffer22.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer22.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) 'a', channelBufferFactory26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) (short) 10);
        dynamicChannelBuffer31.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory26);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        float float10 = dynamicChannelBuffer6.getFloat((int) (byte) 0);
        dynamicChannelBuffer6.setIndex((int) (byte) 1, 5);
        dynamicChannelBuffer1.getBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        double double8 = dynamicChannelBuffer1.getDouble(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset22 = null;
        java.lang.String str23 = dynamicChannelBuffer21.toString(charset22);
        boolean boolean24 = dynamicChannelBuffer21.readable();
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer21.writeBytes(byteArray28);
        dynamicChannelBuffer19.writeBytes(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) -1, byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -1, 1]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dynamicChannelBuffer3.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.copy();
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer3;
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer3.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = dynamicChannelBuffer3.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer3.setIndex(98, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertNotNull(channelBufferFactory6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.settooLongFrameLength((long) (short) 100);
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer10.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, (int) 'a', channelBufferFactory23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = lengthFieldBasedFrameDecoder3.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeLong(10L);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.setBytes(0, scatteringByteChannel11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        dynamicChannelBuffer1.writeShort(0);
        short short11 = dynamicChannelBuffer1.getUnsignedByte(4);
        short short12 = dynamicChannelBuffer1.readShort();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder16 = null;
        int int17 = dynamicChannelBuffer14.bytesBefore((int) (short) -1, channelBufferIndexFinder16);
        dynamicChannelBuffer14.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer14.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer23.toString(charset24);
        boolean boolean26 = dynamicChannelBuffer23.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer23.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder20, (int) 'a', channelBufferFactory27);
        dynamicChannelBuffer28.writeFloat((float) 2);
        java.nio.ByteBuffer byteBuffer33 = dynamicChannelBuffer28.toByteBuffer(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertNotNull(byteBuffer33);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        int int9 = dynamicChannelBuffer1.readerIndex();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dynamicChannelBuffer1.getDouble(98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory2 = dynamicChannelBuffer1.factory();
        dynamicChannelBuffer1.resetReaderIndex();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, outputStream5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBufferFactory2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer12.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1, channelBufferFactory15);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray21 = new byte[] { (byte) 10 };
        dynamicChannelBuffer18.setBytes(1, byteArray21);
        dynamicChannelBuffer18.writeChar((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer16.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10]");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(5, 4, 5, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 5");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        int int20 = dynamicChannelBuffer11.capacity();
        java.lang.Object obj21 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext22 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 0);
        dynamicChannelBuffer1.writeShort((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray6 = dynamicChannelBuffer1.toByteBuffers(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            byte byte2 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        dynamicChannelBuffer1.writeShort(0);
        short short11 = dynamicChannelBuffer1.getUnsignedByte(4);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.slice(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext8 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.initialBytesToStrip;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        int int16 = dynamicChannelBuffer15.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer15.copy();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer15.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        int int26 = dynamicChannelBuffer20.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer20.factory;
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            float float29 = dynamicChannelBuffer15.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer17.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dynamicChannelBuffer17.getLong(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(channelBuffer18);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        int int11 = dynamicChannelBuffer8.bytesBefore((int) (short) -1, channelBufferIndexFinder10);
        dynamicChannelBuffer8.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer8.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer17.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, (int) 'a', channelBufferFactory21);
        dynamicChannelBuffer22.writeFloat((float) 2);
        java.nio.ByteBuffer byteBuffer27 = dynamicChannelBuffer22.toByteBuffer(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(byteBuffer27);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeDouble((double) (-1.0f));
        dynamicChannelBuffer1.writerIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBoolean((int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(98);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 1, (int) ' ', 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset24 = null;
        java.lang.String str25 = dynamicChannelBuffer23.toString(charset24);
        float float27 = dynamicChannelBuffer23.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer23.getbuffer();
        byte[] byteArray29 = dynamicChannelBuffer23.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.writeBytes(byteArray29, 5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.writeShort(2);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes(0, scatteringByteChannel6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer3.toString(charset4);
        boolean boolean6 = dynamicChannelBuffer3.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory7 = dynamicChannelBuffer3.getfactory();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer3.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer13.getBytes((int) (byte) 1, byteArray20);
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer13.endianness;
        java.lang.Object obj23 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext10, channel11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent25 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext24, channelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        int int16 = dynamicChannelBuffer15.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer15.copy();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer15.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        int int26 = dynamicChannelBuffer20.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory27 = dynamicChannelBuffer20.factory;
        dynamicChannelBuffer15.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset32 = null;
        java.lang.String str33 = dynamicChannelBuffer31.toString(charset32);
        boolean boolean34 = dynamicChannelBuffer31.readable();
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer31.getBytes((int) (byte) 1, byteArray38);
        dynamicChannelBuffer31.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset44 = null;
        java.lang.String str45 = dynamicChannelBuffer43.toString(charset44);
        boolean boolean46 = dynamicChannelBuffer43.readable();
        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer43.getBytes((int) (byte) 1, byteArray50);
        dynamicChannelBuffer31.writeBytes(byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.getBytes((int) (byte) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0]");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(8, 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext8 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        dynamicChannelBuffer18.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset26 = null;
        java.lang.String str27 = dynamicChannelBuffer25.toString(charset26);
        boolean boolean28 = dynamicChannelBuffer25.readable();
        dynamicChannelBuffer18.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer25.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 10, channelBufferFactory30);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.getlengthFieldIncludedInFrameLength();
        lengthFieldBasedFrameDecoder3.setdiscardingTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        float float10 = dynamicChannelBuffer6.getFloat((int) (byte) 0);
        dynamicChannelBuffer6.setIndex((int) (byte) 1, 5);
        dynamicChannelBuffer1.getBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        dynamicChannelBuffer18.resetWriterIndex();
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder29 = null;
        int int30 = dynamicChannelBuffer27.bytesBefore((int) (short) -1, channelBufferIndexFinder29);
        dynamicChannelBuffer27.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset39 = null;
        java.lang.String str40 = dynamicChannelBuffer38.toString(charset39);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer38.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, (int) (byte) 1, channelBufferFactory41);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) (short) 1, channelBufferFactory41);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(channelBufferFactory41);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer1.order();
        boolean boolean21 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset25 = null;
        java.lang.String str26 = dynamicChannelBuffer24.toString(charset25);
        float float28 = dynamicChannelBuffer24.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset31 = null;
        java.lang.String str32 = dynamicChannelBuffer30.toString(charset31);
        boolean boolean33 = dynamicChannelBuffer30.readable();
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer30.getBytes((int) (byte) 1, byteArray37);
        dynamicChannelBuffer30.writeBoolean(false);
        dynamicChannelBuffer24.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset44 = null;
        java.lang.String str45 = dynamicChannelBuffer43.toString(charset44);
        boolean boolean46 = dynamicChannelBuffer43.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory47 = dynamicChannelBuffer43.getfactory();
        dynamicChannelBuffer43.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder49 = null;
        int int50 = dynamicChannelBuffer43.bytesBefore(channelBufferIndexFinder49);
        dynamicChannelBuffer30.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer43, (int) (byte) 10, 0);
        double double55 = dynamicChannelBuffer30.getDouble(0);
        int int57 = dynamicChannelBuffer30.getMedium((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '4', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer30, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int16 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.Channel channel24 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer26.toString(charset27);
        boolean boolean29 = dynamicChannelBuffer26.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer26.getfactory();
        dynamicChannelBuffer26.resetWriterIndex();
        java.lang.Object obj32 = lengthFieldBasedFrameDecoder22.decode(channelHandlerContext23, channel24, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset35 = null;
        java.lang.String str36 = dynamicChannelBuffer34.toString(charset35);
        float float38 = dynamicChannelBuffer34.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset41 = null;
        java.lang.String str42 = dynamicChannelBuffer40.toString(charset41);
        boolean boolean43 = dynamicChannelBuffer40.readable();
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer40.getBytes((int) (byte) 1, byteArray47);
        dynamicChannelBuffer40.writeBoolean(false);
        dynamicChannelBuffer34.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer53 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset54 = null;
        java.lang.String str55 = dynamicChannelBuffer53.toString(charset54);
        boolean boolean56 = dynamicChannelBuffer53.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory57 = dynamicChannelBuffer53.getfactory();
        dynamicChannelBuffer53.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder59 = null;
        int int60 = dynamicChannelBuffer53.bytesBefore(channelBufferIndexFinder59);
        dynamicChannelBuffer40.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer53, (int) (byte) 10, 0);
        dynamicChannelBuffer26.buffer = dynamicChannelBuffer53;
        java.lang.Object obj65 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext17, channel18, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer53);
        // The following exception was thrown during execution in test generation
        try {
            float float66 = dynamicChannelBuffer53.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer22.resetWriterIndex();
        dynamicChannelBuffer22.writeLong((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setDouble(100, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        byte[] byteArray7 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer9.writeBytes(byteArray16);
        int int18 = dynamicChannelBuffer9.capacity();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer9;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dynamicChannelBuffer9.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer22.resetWriterIndex();
        dynamicChannelBuffer22.writeLong((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer22.readSlice((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int18 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = '4';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer10.bytesBefore((int) (short) -1, channelBufferIndexFinder12);
        dynamicChannelBuffer10.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer10.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset22 = null;
        java.lang.String str23 = dynamicChannelBuffer21.toString(charset22);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer21.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, (int) (byte) 1, channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (short) 1, channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer28.getBytes((int) (byte) 1, byteArray35);
        dynamicChannelBuffer28.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset41 = null;
        java.lang.String str42 = dynamicChannelBuffer40.toString(charset41);
        boolean boolean43 = dynamicChannelBuffer40.readable();
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer40.getBytes((int) (byte) 1, byteArray47);
        dynamicChannelBuffer28.writeBytes(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer26.writeBytes(byteArray47, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dynamicChannelBuffer22.writeBytes(scatteringByteChannel25, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer12.getfactory();
        dynamicChannelBuffer12.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 100, channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer28.getfactory();
        dynamicChannelBuffer28.resetWriterIndex();
        java.nio.ByteOrder byteOrder34 = dynamicChannelBuffer28.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer37.toString(charset38);
        boolean boolean40 = dynamicChannelBuffer37.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory41 = dynamicChannelBuffer37.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, (int) 'a', channelBufferFactory41);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer46 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, 97);
        java.nio.ByteBuffer byteBuffer49 = dynamicChannelBuffer46.toByteBuffer((int) ' ', (int) (short) 0);
        dynamicChannelBuffer25.getBytes((int) (short) 0, byteBuffer49);
        java.lang.Class<?> wildcardClass51 = byteBuffer49.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory41);
        org.junit.Assert.assertNotNull(byteBuffer49);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        java.nio.charset.Charset charset22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dynamicChannelBuffer19.toString(1, 8, charset22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 5, (int) (byte) 1);
        long long8 = lengthFieldBasedFrameDecoder7.gettooLongFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.maxFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) 'a', (int) (short) 1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (35) must be equal to or greater than lengthFieldOffset (97) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer9.readSlice((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean2 = dynamicChannelBuffer1.writable();
        dynamicChannelBuffer1.writeInt(1);
        int int5 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer7.order();
        dynamicChannelBuffer7.writeLong(10L);
        int int16 = dynamicChannelBuffer7.writerIndex();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer7;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setByte((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer13.getBytes((int) (byte) 1, byteArray20);
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer13.endianness;
        java.lang.Object obj23 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext10, channel11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.Channel channel25 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer27.toString(charset28);
        boolean boolean30 = dynamicChannelBuffer27.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer27.getfactory();
        dynamicChannelBuffer27.resetWriterIndex();
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer37.toString(charset38);
        boolean boolean40 = dynamicChannelBuffer37.readable();
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer37.getBytes((int) (byte) 1, byteArray44);
        dynamicChannelBuffer35.writeBytes(byteArray44);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean49 = dynamicChannelBuffer48.writable();
        dynamicChannelBuffer35.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        java.lang.Object obj51 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext24, channel25, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer48.setMedium(5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int16 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        long long17 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        int int18 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext19, channelEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        java.lang.Class<?> wildcardClass24 = lengthFieldBasedFrameDecoder23.getClass();
        boolean boolean25 = dynamicChannelBuffer1.equals((java.lang.Object) lengthFieldBasedFrameDecoder23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(100, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 5, (int) (byte) 1);
        long long4 = lengthFieldBasedFrameDecoder3.gettooLongFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext5, childChannelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        int int16 = dynamicChannelBuffer15.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer15.copy();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer15.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer15.setChar((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        dynamicChannelBuffer18.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset26 = null;
        java.lang.String str27 = dynamicChannelBuffer25.toString(charset26);
        boolean boolean28 = dynamicChannelBuffer25.readable();
        dynamicChannelBuffer18.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer25.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 10, channelBufferFactory30);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = dynamicChannelBuffer31.getUnsignedInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        java.nio.charset.Charset charset20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dynamicChannelBuffer7.toString((int) ' ', 1, charset20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        boolean boolean9 = dynamicChannelBuffer6.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer6.getfactory();
        dynamicChannelBuffer6.resetWriterIndex();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer6.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer17.getfactory();
        dynamicChannelBuffer17.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset25 = null;
        java.lang.String str26 = dynamicChannelBuffer24.toString(charset25);
        boolean boolean27 = dynamicChannelBuffer24.readable();
        dynamicChannelBuffer17.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory29 = dynamicChannelBuffer24.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 100, channelBufferFactory29);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 100, channelBufferFactory29);
        boolean boolean32 = dynamicChannelBuffer31.writable();
        // The following exception was thrown during execution in test generation
        try {
            float float34 = dynamicChannelBuffer31.getFloat((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.Channel channel14 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer16.toString(charset17);
        boolean boolean19 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer16.getfactory();
        dynamicChannelBuffer16.resetWriterIndex();
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder22, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer26.toString(charset27);
        boolean boolean29 = dynamicChannelBuffer26.readable();
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer26.getBytes((int) (byte) 1, byteArray33);
        dynamicChannelBuffer24.writeBytes(byteArray33);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean38 = dynamicChannelBuffer37.writable();
        dynamicChannelBuffer24.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37);
        dynamicChannelBuffer37.resetWriterIndex();
        dynamicChannelBuffer37.writeLong((long) (byte) 0);
        boolean boolean43 = dynamicChannelBuffer37.isDirect();
        java.lang.Object obj44 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext13, channel14, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37);
        long long45 = lengthFieldBasedFrameDecoder7.bytesToDiscard;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext46 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(2, 2, 4, (int) 'a', (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (2) must be equal to or greater than lengthFieldOffset (2) + lengthFieldLength (4).");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 0, 0, 2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset4 = null;
        java.lang.String str5 = dynamicChannelBuffer3.toString(charset4);
        boolean boolean6 = dynamicChannelBuffer3.readable();
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer3.writeBytes(byteArray10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray17 = new byte[] { (byte) 10 };
        dynamicChannelBuffer14.setBytes(1, byteArray17);
        dynamicChannelBuffer3.setBytes((int) (short) 0, byteArray17);
        short short20 = dynamicChannelBuffer3.readUnsignedByte();
        dynamicChannelBuffer3.setLong(0, (-1L));
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer3);
        // The following exception was thrown during execution in test generation
        try {
            float float25 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10]");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 10 + "'", short20 == (short) 10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.readBytes(byteArray18, (int) (short) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int16 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        long long17 = lengthFieldBasedFrameDecoder3.bytesToDiscard;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext18, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        double double32 = dynamicChannelBuffer7.getDouble(0);
        int int34 = dynamicChannelBuffer7.getMedium((int) (byte) 1);
        long long36 = dynamicChannelBuffer7.getLong(2);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.setZero(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        double double8 = dynamicChannelBuffer1.getDouble(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer10.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, (int) 'a', channelBufferFactory23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 97);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer31.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 1, channelBufferFactory32);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 2, channelBufferFactory16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset22 = null;
        java.lang.String str23 = dynamicChannelBuffer21.toString(charset22);
        boolean boolean24 = dynamicChannelBuffer21.readable();
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer21.writeBytes(byteArray28);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray35 = new byte[] { (byte) 10 };
        dynamicChannelBuffer32.setBytes(1, byteArray35);
        dynamicChannelBuffer21.setBytes((int) (short) 0, byteArray35);
        short short38 = dynamicChannelBuffer21.readUnsignedByte();
        dynamicChannelBuffer21.setLong(0, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer21, 10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10]");
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 10 + "'", short38 == (short) 10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setIndex((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder18);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        float float10 = dynamicChannelBuffer6.getFloat((int) (byte) 0);
        dynamicChannelBuffer6.setIndex((int) (byte) 1, 5);
        dynamicChannelBuffer1.getBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dynamicChannelBuffer1.readBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        long long7 = dynamicChannelBuffer1.getLong(1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int18 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = '4';
        int int21 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.Channel channel23 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset26 = null;
        java.lang.String str27 = dynamicChannelBuffer25.toString(charset26);
        boolean boolean28 = dynamicChannelBuffer25.readable();
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer25.writeBytes(byteArray32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray39 = new byte[] { (byte) 10 };
        dynamicChannelBuffer36.setBytes(1, byteArray39);
        dynamicChannelBuffer25.setBytes((int) (short) 0, byteArray39);
        short short42 = dynamicChannelBuffer25.readUnsignedByte();
        int int43 = dynamicChannelBuffer25.readableBytes();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder47 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        java.lang.Class<?> wildcardClass48 = lengthFieldBasedFrameDecoder47.getClass();
        boolean boolean49 = dynamicChannelBuffer25.equals((java.lang.Object) lengthFieldBasedFrameDecoder47);
        java.lang.Object obj50 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext22, channel23, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext51 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent52 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext51, childChannelStateEvent52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.setbytesToDiscard((long) '#');
        int int9 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer8.getfactory();
        long long15 = dynamicChannelBuffer8.getUnsignedInt(5);
        int int17 = dynamicChannelBuffer8.getUnsignedMedium((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = dynamicChannelBuffer8.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 1);
        dynamicChannelBuffer1.writeFloat((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) ' ', 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int18 = lengthFieldBasedFrameDecoder7.getlengthFieldEndOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext19 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 97, (int) (byte) 100, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        int int20 = dynamicChannelBuffer11.capacity();
        java.lang.Object obj21 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int22 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        lengthFieldBasedFrameDecoder7.tooLongFrameLength = '4';
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext25 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=0, cap=0)", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        dynamicChannelBuffer1.writeChar(0);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.writeBytes(inputStream11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeShort(1);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        boolean boolean10 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int13 = dynamicChannelBuffer12.capacity();
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer12.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer18, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(byteOrder14);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer1.toByteBuffer(5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer19.readSlice((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeShort(1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.copy((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.endianness;
        boolean boolean22 = dynamicChannelBuffer19.getBoolean((int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory25 = dynamicChannelBuffer24.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory25);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        int int5 = dynamicChannelBuffer1.bytesBefore(0, (int) (short) 1, (byte) 0);
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer9.getfactory();
        dynamicChannelBuffer9.resetWriterIndex();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer9.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder20 = null;
        int int21 = dynamicChannelBuffer18.bytesBefore((int) (short) -1, channelBufferIndexFinder20);
        dynamicChannelBuffer18.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset30 = null;
        java.lang.String str31 = dynamicChannelBuffer29.toString(charset30);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer29.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) (byte) 1, channelBufferFactory32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) (short) 1, channelBufferFactory32);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer34, 5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(channelBufferFactory32);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        boolean boolean20 = dynamicChannelBuffer19.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer19.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.endianness;
        java.io.InputStream inputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.writeBytes(inputStream10, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setZero((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeLong(10L);
        int int10 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer1.slice();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        java.lang.Object obj26 = lengthFieldBasedFrameDecoder16.decode(channelHandlerContext17, channel18, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        float float32 = dynamicChannelBuffer28.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset35 = null;
        java.lang.String str36 = dynamicChannelBuffer34.toString(charset35);
        boolean boolean37 = dynamicChannelBuffer34.readable();
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer34.getBytes((int) (byte) 1, byteArray41);
        dynamicChannelBuffer34.writeBoolean(false);
        dynamicChannelBuffer28.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer34);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset48 = null;
        java.lang.String str49 = dynamicChannelBuffer47.toString(charset48);
        boolean boolean50 = dynamicChannelBuffer47.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory51 = dynamicChannelBuffer47.getfactory();
        dynamicChannelBuffer47.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder53 = null;
        int int54 = dynamicChannelBuffer47.bytesBefore(channelBufferIndexFinder53);
        dynamicChannelBuffer34.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 10, 0);
        dynamicChannelBuffer20.buffer = dynamicChannelBuffer47;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer47, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        dynamicChannelBuffer1.setBytes(1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int18 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.tooLongFrameLength = '4';
        int int21 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.Channel channel23 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset26 = null;
        java.lang.String str27 = dynamicChannelBuffer25.toString(charset26);
        boolean boolean28 = dynamicChannelBuffer25.readable();
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer25.writeBytes(byteArray32);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray39 = new byte[] { (byte) 10 };
        dynamicChannelBuffer36.setBytes(1, byteArray39);
        dynamicChannelBuffer25.setBytes((int) (short) 0, byteArray39);
        short short42 = dynamicChannelBuffer25.readUnsignedByte();
        int int43 = dynamicChannelBuffer25.readableBytes();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder47 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        java.lang.Class<?> wildcardClass48 = lengthFieldBasedFrameDecoder47.getClass();
        boolean boolean49 = dynamicChannelBuffer25.equals((java.lang.Object) lengthFieldBasedFrameDecoder47);
        java.lang.Object obj50 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext22, channel23, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25);
        // The following exception was thrown during execution in test generation
        try {
            long long51 = dynamicChannelBuffer25.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[10]");
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(0, (long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.bytesBefore((int) (short) 0, 98, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeShort(1);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        boolean boolean10 = dynamicChannelBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer1.toByteBuffer((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        dynamicChannelBuffer1.setBytes(1, byteArray4);
        dynamicChannelBuffer1.writeChar((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.getUnsignedMedium(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.ensureWritableBytes(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer9.getUnsignedMedium((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        boolean boolean9 = dynamicChannelBuffer6.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer6.getfactory();
        dynamicChannelBuffer6.resetWriterIndex();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer6.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer15.toString(charset16);
        boolean boolean18 = dynamicChannelBuffer15.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer15.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) 'a', channelBufferFactory19);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset25 = null;
        java.lang.String str26 = dynamicChannelBuffer24.toString(charset25);
        boolean boolean27 = dynamicChannelBuffer24.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory28 = dynamicChannelBuffer24.getfactory();
        dynamicChannelBuffer24.resetWriterIndex();
        java.nio.ByteOrder byteOrder30 = dynamicChannelBuffer24.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder30, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset35 = null;
        java.lang.String str36 = dynamicChannelBuffer34.toString(charset35);
        boolean boolean37 = dynamicChannelBuffer34.readable();
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer34.getBytes((int) (byte) 1, byteArray41);
        dynamicChannelBuffer32.writeBytes(byteArray41);
        dynamicChannelBuffer22.writeBytes(byteArray41);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset48 = null;
        java.lang.String str49 = dynamicChannelBuffer47.toString(charset48);
        boolean boolean50 = dynamicChannelBuffer47.readable();
        byte[] byteArray54 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer47.getBytes((int) (byte) 1, byteArray54);
        dynamicChannelBuffer47.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset60 = null;
        java.lang.String str61 = dynamicChannelBuffer59.toString(charset60);
        boolean boolean62 = dynamicChannelBuffer59.readable();
        byte[] byteArray66 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer59.getBytes((int) (byte) 1, byteArray66);
        dynamicChannelBuffer47.writeBytes(byteArray66);
        dynamicChannelBuffer22.getBytes(2, byteArray66);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 100, byteArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory28);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[0, 0]");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int18 = lengthFieldBasedFrameDecoder7.getlengthFieldEndOffset();
        boolean boolean19 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        int int20 = lengthFieldBasedFrameDecoder7.getinitialBytesToStrip();
        long long21 = lengthFieldBasedFrameDecoder7.bytesToDiscard;
        int int22 = lengthFieldBasedFrameDecoder7.lengthAdjustment;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext23 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=0, cap=0)", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, (int) 'a', 0, 0, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int8 = lengthFieldBasedFrameDecoder7.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        int int10 = lengthFieldBasedFrameDecoder7.getlengthFieldOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 0, (-1), (int) 'a', (int) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer11.getBytes((int) (byte) 1, byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean23 = dynamicChannelBuffer22.writable();
        dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22);
        dynamicChannelBuffer22.resetWriterIndex();
        dynamicChannelBuffer22.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer22.setBoolean(4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer5.buffer = dynamicChannelBuffer7;
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer7.getendianness();
        boolean boolean10 = dynamicChannelBuffer7.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        double double32 = dynamicChannelBuffer7.getDouble(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset36 = null;
        java.lang.String str37 = dynamicChannelBuffer35.toString(charset36);
        boolean boolean38 = dynamicChannelBuffer35.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory39 = dynamicChannelBuffer35.getfactory();
        dynamicChannelBuffer35.resetWriterIndex();
        java.nio.ByteOrder byteOrder41 = dynamicChannelBuffer35.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder41, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset46 = null;
        java.lang.String str47 = dynamicChannelBuffer45.toString(charset46);
        boolean boolean48 = dynamicChannelBuffer45.readable();
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer45.writeBytes(byteArray52);
        dynamicChannelBuffer43.writeBytes(byteArray52);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer7.getBytes((int) '4', byteArray52, 0, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory39);
        org.junit.Assert.assertNotNull(byteOrder41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[-1, -1, 1]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        dynamicChannelBuffer17.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            byte byte19 = dynamicChannelBuffer17.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        dynamicChannelBuffer10.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            char char23 = dynamicChannelBuffer17.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 1, (int) '#', (int) ' ', (int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeInt((int) (byte) -1);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 10, outputStream10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer12.getfactory();
        dynamicChannelBuffer12.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        dynamicChannelBuffer12.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 100, channelBufferFactory24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer25.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        byte[] byteArray20 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer13.getBytes((int) (byte) 1, byteArray20);
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer13.endianness;
        java.lang.Object obj23 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext10, channel11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.Channel channel25 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer27.toString(charset28);
        boolean boolean30 = dynamicChannelBuffer27.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer27.getfactory();
        dynamicChannelBuffer27.resetWriterIndex();
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder33, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset38 = null;
        java.lang.String str39 = dynamicChannelBuffer37.toString(charset38);
        boolean boolean40 = dynamicChannelBuffer37.readable();
        byte[] byteArray44 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer37.getBytes((int) (byte) 1, byteArray44);
        dynamicChannelBuffer35.writeBytes(byteArray44);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer48 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean49 = dynamicChannelBuffer48.writable();
        dynamicChannelBuffer35.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        java.lang.Object obj51 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext24, channel25, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer48);
        boolean boolean52 = lengthFieldBasedFrameDecoder3.getlengthFieldIncludedInFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext53 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent54 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext53, channelStateEvent54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        dynamicChannelBuffer1.writeShort(0);
        short short11 = dynamicChannelBuffer1.getUnsignedByte(4);
        boolean boolean12 = dynamicChannelBuffer1.isDirect();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer15.toString(charset16);
        boolean boolean18 = dynamicChannelBuffer15.readable();
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer15.getBytes((int) (byte) 1, byteArray22);
        dynamicChannelBuffer15.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer27.toString(charset28);
        boolean boolean30 = dynamicChannelBuffer27.readable();
        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer27.getBytes((int) (byte) 1, byteArray34);
        dynamicChannelBuffer15.writeBytes(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) -1, byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        long long6 = lengthFieldBasedFrameDecoder3.gettooLongFrameLength();
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 2, channelBufferFactory16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer19.copy((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(5);
        java.lang.Object obj11 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer13.getfactory();
        dynamicChannelBuffer13.resetWriterIndex();
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer13.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer22.toString(charset23);
        boolean boolean25 = dynamicChannelBuffer22.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer22.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) 'a', channelBufferFactory26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder19, (int) (byte) 0);
        dynamicChannelBuffer31.writeShort(8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer10.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer31, 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory26);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset19 = null;
        java.lang.String str20 = dynamicChannelBuffer18.toString(charset19);
        boolean boolean21 = dynamicChannelBuffer18.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory22 = dynamicChannelBuffer18.getfactory();
        dynamicChannelBuffer18.resetWriterIndex();
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer18.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer27.toString(charset28);
        boolean boolean30 = dynamicChannelBuffer27.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer27.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) 'a', channelBufferFactory31);
        int int33 = dynamicChannelBuffer32.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer34 = dynamicChannelBuffer32.copy();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory35 = dynamicChannelBuffer32.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 0, channelBufferFactory35);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer36.slice((int) '\000', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory22);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(channelBuffer34);
        org.junit.Assert.assertNotNull(channelBufferFactory35);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeShort(1);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer14.toString(charset15);
        boolean boolean17 = dynamicChannelBuffer14.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer14.getfactory();
        dynamicChannelBuffer14.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        int int16 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.Channel channel24 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer26.toString(charset27);
        boolean boolean29 = dynamicChannelBuffer26.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer26.getfactory();
        dynamicChannelBuffer26.resetWriterIndex();
        java.lang.Object obj32 = lengthFieldBasedFrameDecoder22.decode(channelHandlerContext23, channel24, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset35 = null;
        java.lang.String str36 = dynamicChannelBuffer34.toString(charset35);
        float float38 = dynamicChannelBuffer34.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset41 = null;
        java.lang.String str42 = dynamicChannelBuffer40.toString(charset41);
        boolean boolean43 = dynamicChannelBuffer40.readable();
        byte[] byteArray47 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer40.getBytes((int) (byte) 1, byteArray47);
        dynamicChannelBuffer40.writeBoolean(false);
        dynamicChannelBuffer34.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer40);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer53 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset54 = null;
        java.lang.String str55 = dynamicChannelBuffer53.toString(charset54);
        boolean boolean56 = dynamicChannelBuffer53.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory57 = dynamicChannelBuffer53.getfactory();
        dynamicChannelBuffer53.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder59 = null;
        int int60 = dynamicChannelBuffer53.bytesBefore(channelBufferIndexFinder59);
        dynamicChannelBuffer40.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer53, (int) (byte) 10, 0);
        dynamicChannelBuffer26.buffer = dynamicChannelBuffer53;
        java.lang.Object obj65 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext17, channel18, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer53);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder68 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int69 = dynamicChannelBuffer53.indexOf((int) (short) 100, (int) (short) 1, channelBufferIndexFinder68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer1.order();
        java.io.InputStream inputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dynamicChannelBuffer1.setBytes((int) (byte) 10, inputStream22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(byteOrder20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 0);
        byte[] byteArray4 = dynamicChannelBuffer1.array();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray10 = new byte[] { (byte) 10 };
        dynamicChannelBuffer7.setBytes(1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(97, byteArray10, 4, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10]");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer6.toString(charset7);
        float float10 = dynamicChannelBuffer6.getFloat((int) (byte) 0);
        dynamicChannelBuffer6.setIndex((int) (byte) 1, 5);
        dynamicChannelBuffer1.getBytes((int) (short) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        dynamicChannelBuffer1.buffer = channelBuffer16;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = dynamicChannelBuffer1.array();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        dynamicChannelBuffer11.buffer = dynamicChannelBuffer13;
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.getendianness();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 2, channelBufferFactory16);
        byte[] byteArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setBytes(4, byteArray19, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int18 = lengthFieldBasedFrameDecoder7.getinitialBytesToStrip();
        int int19 = lengthFieldBasedFrameDecoder7.getlengthFieldEndOffset();
        boolean boolean20 = lengthFieldBasedFrameDecoder7.discardingTooLongFrame;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext21 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 98 + "'", int19 == 98);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) '#', 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        boolean boolean10 = lengthFieldBasedFrameDecoder7.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder7.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.Channel channel14 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer16.toString(charset17);
        boolean boolean19 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer16.getfactory();
        dynamicChannelBuffer16.resetWriterIndex();
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder22, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer26.toString(charset27);
        boolean boolean29 = dynamicChannelBuffer26.readable();
        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer26.getBytes((int) (byte) 1, byteArray33);
        dynamicChannelBuffer24.writeBytes(byteArray33);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean38 = dynamicChannelBuffer37.writable();
        dynamicChannelBuffer24.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37);
        dynamicChannelBuffer37.resetWriterIndex();
        dynamicChannelBuffer37.writeLong((long) (byte) 0);
        boolean boolean43 = dynamicChannelBuffer37.isDirect();
        java.lang.Object obj44 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext13, channel14, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37);
        long long45 = lengthFieldBasedFrameDecoder7.bytesToDiscard;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext46 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=0, cap=0)", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory20);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 5, (int) (byte) 10, (int) (byte) 100, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset22 = null;
        java.lang.String str23 = dynamicChannelBuffer21.toString(charset22);
        boolean boolean24 = dynamicChannelBuffer21.readable();
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer21.writeBytes(byteArray28);
        dynamicChannelBuffer19.writeBytes(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray28, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, -1, 1]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        dynamicChannelBuffer9.writeInt((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.setIndex((int) (short) -1, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte((int) (byte) 0, 10);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel12, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.readerIndex(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthAdjustment();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer7.writeBytes(byteArray14);
        int int16 = dynamicChannelBuffer7.capacity();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int18 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 1;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(1);
        int int2 = dynamicChannelBuffer1.readableBytes();
        // The following exception was thrown during execution in test generation
        try {
            byte byte3 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        dynamicChannelBuffer10.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj22 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext23, childChannelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(98);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) 191, (int) (byte) 10, (int) '\000', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        int int10 = lengthFieldBasedFrameDecoder7.maxFrameLength;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0L;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext15 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.endianness;
        boolean boolean22 = dynamicChannelBuffer19.getBoolean((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer19.setMedium(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset5 = null;
        java.lang.String str6 = dynamicChannelBuffer4.toString(charset5);
        boolean boolean7 = dynamicChannelBuffer4.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer4.getfactory();
        dynamicChannelBuffer4.resetWriterIndex();
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer4.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset14 = null;
        java.lang.String str15 = dynamicChannelBuffer13.toString(charset14);
        boolean boolean16 = dynamicChannelBuffer13.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory17 = dynamicChannelBuffer13.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder10, (int) 'a', channelBufferFactory17);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder10, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer22.toString(charset23);
        boolean boolean25 = dynamicChannelBuffer22.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory26 = dynamicChannelBuffer22.getfactory();
        dynamicChannelBuffer22.resetWriterIndex();
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer22.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset33 = null;
        java.lang.String str34 = dynamicChannelBuffer32.toString(charset33);
        boolean boolean35 = dynamicChannelBuffer32.readable();
        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer32.getBytes((int) (byte) 1, byteArray39);
        dynamicChannelBuffer30.writeBytes(byteArray39);
        dynamicChannelBuffer20.writeBytes(byteArray39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset46 = null;
        java.lang.String str47 = dynamicChannelBuffer45.toString(charset46);
        boolean boolean48 = dynamicChannelBuffer45.readable();
        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer45.getBytes((int) (byte) 1, byteArray52);
        dynamicChannelBuffer45.writeBoolean(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer57 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset58 = null;
        java.lang.String str59 = dynamicChannelBuffer57.toString(charset58);
        boolean boolean60 = dynamicChannelBuffer57.readable();
        byte[] byteArray64 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer57.getBytes((int) (byte) 1, byteArray64);
        dynamicChannelBuffer45.writeBytes(byteArray64);
        dynamicChannelBuffer20.getBytes(2, byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(0, byteArray64, 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory26);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, 0]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray15 = new byte[] { (byte) 10 };
        dynamicChannelBuffer12.setBytes(1, byteArray15);
        dynamicChannelBuffer1.setBytes((int) (short) 0, byteArray15);
        short short18 = dynamicChannelBuffer1.readUnsignedByte();
        int int19 = dynamicChannelBuffer1.readableBytes();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        java.lang.Class<?> wildcardClass24 = lengthFieldBasedFrameDecoder23.getClass();
        boolean boolean25 = dynamicChannelBuffer1.equals((java.lang.Object) lengthFieldBasedFrameDecoder23);
        dynamicChannelBuffer1.setInt((int) (byte) 1, 97);
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream29, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10]");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer7.getBytes((int) (byte) 1, byteArray14);
        dynamicChannelBuffer7.writeBoolean(false);
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder26 = null;
        int int27 = dynamicChannelBuffer20.bytesBefore(channelBufferIndexFinder26);
        dynamicChannelBuffer7.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, (int) (byte) 10, 0);
        dynamicChannelBuffer7.writeInt((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double33 = dynamicChannelBuffer7.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer10.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, (int) 'a', channelBufferFactory23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset28 = null;
        java.lang.String str29 = dynamicChannelBuffer27.toString(charset28);
        boolean boolean30 = dynamicChannelBuffer27.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory31 = dynamicChannelBuffer27.getfactory();
        dynamicChannelBuffer27.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset35 = null;
        java.lang.String str36 = dynamicChannelBuffer34.toString(charset35);
        boolean boolean37 = dynamicChannelBuffer34.readable();
        dynamicChannelBuffer27.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer34);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory39 = dynamicChannelBuffer34.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer40 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, (int) (byte) 10, channelBufferFactory39);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer41 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, 2, channelBufferFactory39);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer41.setDouble(0, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory39);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset9 = null;
        java.lang.String str10 = dynamicChannelBuffer8.toString(charset9);
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer14.toString(charset15);
        boolean boolean17 = dynamicChannelBuffer14.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer14.getfactory();
        int int20 = dynamicChannelBuffer14.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer14.getbuffer();
        dynamicChannelBuffer1.writeBytes(channelBuffer21);
        // The following exception was thrown during execution in test generation
        try {
            short short23 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(channelBuffer21);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        int int20 = dynamicChannelBuffer11.capacity();
        java.lang.Object obj21 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int22 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        lengthFieldBasedFrameDecoder7.setbytesToDiscard((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext25 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '\000', (int) (short) 16672, (int) (byte) 100, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(97, (int) (short) -1, (int) (byte) 1, 2, (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 1);
        dynamicChannelBuffer1.writeFloat((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            float float12 = dynamicChannelBuffer1.getFloat((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer11.writeBytes(byteArray18);
        dynamicChannelBuffer9.writeBytes(byteArray18);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer9.copy();
        java.nio.charset.Charset charset24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dynamicChannelBuffer9.toString((int) (byte) 100, (int) (short) 16672, charset24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, 1]");
        org.junit.Assert.assertNotNull(channelBuffer21);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        dynamicChannelBuffer1.writeBytes(byteArray8);
        int int10 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.setInt(0, 0);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream14, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer1.getBytes((int) (byte) 1, byteArray8);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeDouble((double) (-1.0f));
        dynamicChannelBuffer1.writerIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dynamicChannelBuffer1.getLong((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 10);
        int int2 = dynamicChannelBuffer1.capacity();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        dynamicChannelBuffer1.writeShort((int) ' ');
        int int6 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        float float13 = dynamicChannelBuffer9.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer9.getbuffer();
        double double16 = dynamicChannelBuffer9.getDouble(0);
        int int18 = dynamicChannelBuffer9.getUnsignedShort(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 2);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset21 = null;
        java.lang.String str22 = dynamicChannelBuffer20.toString(charset21);
        boolean boolean23 = dynamicChannelBuffer20.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory24 = dynamicChannelBuffer20.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, (int) 'a', channelBufferFactory24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder17, (int) (byte) 0);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer27, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer27.setIndex(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory24);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(4, 0, 2);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 100, (int) (short) 16672, 1, 4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray8 = dynamicChannelBuffer1.toByteBuffers(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        float float5 = dynamicChannelBuffer1.getFloat((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.writeShort(1);
        int int9 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer15.toString(charset16);
        boolean boolean18 = dynamicChannelBuffer15.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory19 = dynamicChannelBuffer15.getfactory();
        dynamicChannelBuffer15.resetWriterIndex();
        java.nio.ByteOrder byteOrder21 = dynamicChannelBuffer15.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder21, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer26.toString(charset27);
        boolean boolean29 = dynamicChannelBuffer26.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer26.getfactory();
        dynamicChannelBuffer26.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset34 = null;
        java.lang.String str35 = dynamicChannelBuffer33.toString(charset34);
        boolean boolean36 = dynamicChannelBuffer33.readable();
        dynamicChannelBuffer26.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory38 = dynamicChannelBuffer33.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder21, 100, channelBufferFactory38);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset43 = null;
        java.lang.String str44 = dynamicChannelBuffer42.toString(charset43);
        boolean boolean45 = dynamicChannelBuffer42.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory46 = dynamicChannelBuffer42.getfactory();
        dynamicChannelBuffer42.resetWriterIndex();
        java.nio.ByteOrder byteOrder48 = dynamicChannelBuffer42.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset52 = null;
        java.lang.String str53 = dynamicChannelBuffer51.toString(charset52);
        boolean boolean54 = dynamicChannelBuffer51.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory55 = dynamicChannelBuffer51.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer56 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder48, (int) 'a', channelBufferFactory55);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer58 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder48, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer60 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder48, 97);
        java.nio.ByteBuffer byteBuffer63 = dynamicChannelBuffer60.toByteBuffer((int) ' ', (int) (short) 0);
        dynamicChannelBuffer39.getBytes((int) (short) 0, byteBuffer63);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(98, byteBuffer63);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory19);
        org.junit.Assert.assertNotNull(byteOrder21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory46);
        org.junit.Assert.assertNotNull(byteOrder48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory55);
        org.junit.Assert.assertNotNull(byteBuffer63);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset6 = null;
        java.lang.String str7 = dynamicChannelBuffer5.toString(charset6);
        boolean boolean8 = dynamicChannelBuffer5.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer5.getfactory();
        dynamicChannelBuffer5.resetWriterIndex();
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer5.order();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = lengthFieldBasedFrameDecoder3.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertNotNull(byteOrder11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.setByte((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (short) 16672, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16672");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        int int4 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int5 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.Channel channel7 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer9.toString(charset10);
        boolean boolean12 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory13 = dynamicChannelBuffer9.getfactory();
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer9.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset18 = null;
        java.lang.String str19 = dynamicChannelBuffer17.toString(charset18);
        boolean boolean20 = dynamicChannelBuffer17.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer17.getfactory();
        dynamicChannelBuffer17.resetWriterIndex();
        java.nio.ByteOrder byteOrder23 = dynamicChannelBuffer17.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset27 = null;
        java.lang.String str28 = dynamicChannelBuffer26.toString(charset27);
        boolean boolean29 = dynamicChannelBuffer26.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory30 = dynamicChannelBuffer26.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer31 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder23, (int) 'a', channelBufferFactory30);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, (int) (short) 10, channelBufferFactory30);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory36 = dynamicChannelBuffer35.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, (int) (short) 100, channelBufferFactory36);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer38 = dynamicChannelBuffer37.copy();
        dynamicChannelBuffer37.setMedium((int) (byte) 1, (int) (byte) 1);
        java.lang.Object obj42 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext6, channel7, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer37);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer45 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        byte[] byteArray48 = new byte[] { (byte) 10 };
        dynamicChannelBuffer45.setBytes(1, byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer37.setBytes(10, byteArray48, (int) '#', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory13);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory30);
        org.junit.Assert.assertNotNull(channelBufferFactory36);
        org.junit.Assert.assertNotNull(channelBuffer38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10]");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        int int7 = dynamicChannelBuffer1.getInt((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        dynamicChannelBuffer10.resetWriterIndex();
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer10.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset20 = null;
        java.lang.String str21 = dynamicChannelBuffer19.toString(charset20);
        boolean boolean22 = dynamicChannelBuffer19.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory23 = dynamicChannelBuffer19.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, (int) 'a', channelBufferFactory23);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder16, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset29 = null;
        java.lang.String str30 = dynamicChannelBuffer28.toString(charset29);
        boolean boolean31 = dynamicChannelBuffer28.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory32 = dynamicChannelBuffer28.getfactory();
        dynamicChannelBuffer28.resetWriterIndex();
        java.nio.ByteOrder byteOrder34 = dynamicChannelBuffer28.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder34, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset39 = null;
        java.lang.String str40 = dynamicChannelBuffer38.toString(charset39);
        boolean boolean41 = dynamicChannelBuffer38.readable();
        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer38.getBytes((int) (byte) 1, byteArray45);
        dynamicChannelBuffer36.writeBytes(byteArray45);
        dynamicChannelBuffer26.writeBytes(byteArray45);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray45, 0, (int) (short) 191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory32);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0, 0]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        int int5 = dynamicChannelBuffer1.bytesBefore(0, (int) (short) 1, (byte) 0);
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteBuffer6);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) (byte) 0);
        dynamicChannelBuffer19.writeShort(8);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer19.bytesBefore(4, 98, channelBufferIndexFinder24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer7.toString(charset8);
        boolean boolean10 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory11 = dynamicChannelBuffer7.getfactory();
        dynamicChannelBuffer7.resetWriterIndex();
        java.lang.Object obj13 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext4, channel5, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int14 = lengthFieldBasedFrameDecoder3.getlengthFieldEndOffset();
        boolean boolean15 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        long long16 = lengthFieldBasedFrameDecoder3.gettooLongFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.MessageEvent messageEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext17, messageEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore((int) (short) -1, channelBufferIndexFinder3);
        dynamicChannelBuffer1.writeZero((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        dynamicChannelBuffer15.writeFloat((float) 2);
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer15.toByteBuffer(0, (int) (short) 1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer15.readBytes(gatheringByteChannel21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder3.bytesToDiscard = 0;
        boolean boolean6 = lengthFieldBasedFrameDecoder3.lengthFieldIncludedInFrameLength;
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset13 = null;
        java.lang.String str14 = dynamicChannelBuffer12.toString(charset13);
        boolean boolean15 = dynamicChannelBuffer12.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory16 = dynamicChannelBuffer12.getfactory();
        dynamicChannelBuffer12.resetWriterIndex();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer12.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset23 = null;
        java.lang.String str24 = dynamicChannelBuffer22.toString(charset23);
        boolean boolean25 = dynamicChannelBuffer22.readable();
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer22.getBytes((int) (byte) 1, byteArray29);
        dynamicChannelBuffer20.writeBytes(byteArray29);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        boolean boolean34 = dynamicChannelBuffer33.writable();
        dynamicChannelBuffer20.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
        dynamicChannelBuffer33.resetWriterIndex();
        dynamicChannelBuffer33.writeLong((long) (byte) 0);
        boolean boolean39 = dynamicChannelBuffer33.isDirect();
        java.lang.Object obj40 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer33);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset44 = null;
        java.lang.String str45 = dynamicChannelBuffer43.toString(charset44);
        boolean boolean46 = dynamicChannelBuffer43.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory47 = dynamicChannelBuffer43.getfactory();
        dynamicChannelBuffer43.resetWriterIndex();
        java.nio.ByteOrder byteOrder49 = dynamicChannelBuffer43.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer52 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset53 = null;
        java.lang.String str54 = dynamicChannelBuffer52.toString(charset53);
        boolean boolean55 = dynamicChannelBuffer52.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory56 = dynamicChannelBuffer52.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer57 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder49, (int) 'a', channelBufferFactory56);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer59 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder49, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer61 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset62 = null;
        java.lang.String str63 = dynamicChannelBuffer61.toString(charset62);
        boolean boolean64 = dynamicChannelBuffer61.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory65 = dynamicChannelBuffer61.getfactory();
        dynamicChannelBuffer61.resetWriterIndex();
        java.nio.ByteOrder byteOrder67 = dynamicChannelBuffer61.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer69 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder67, (int) (byte) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer71 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset72 = null;
        java.lang.String str73 = dynamicChannelBuffer71.toString(charset72);
        boolean boolean74 = dynamicChannelBuffer71.readable();
        byte[] byteArray78 = new byte[] { (byte) 100, (byte) 100 };
        dynamicChannelBuffer71.getBytes((int) (byte) 1, byteArray78);
        dynamicChannelBuffer69.writeBytes(byteArray78);
        dynamicChannelBuffer59.writeBytes(byteArray78);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer33.getBytes((int) ' ', byteArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory16);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory47);
        org.junit.Assert.assertNotNull(byteOrder49);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory65);
        org.junit.Assert.assertNotNull(byteOrder67);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[0, 0]");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) '4', 1);
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
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = 0;
        long long10 = lengthFieldBasedFrameDecoder7.gettooLongFrameLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext11 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) -1, (int) (short) 16672, (int) (short) 0, 5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) 'a', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset12 = null;
        java.lang.String str13 = dynamicChannelBuffer11.toString(charset12);
        boolean boolean14 = dynamicChannelBuffer11.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory15 = dynamicChannelBuffer11.getfactory();
        dynamicChannelBuffer11.resetWriterIndex();
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder7.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
        int int18 = lengthFieldBasedFrameDecoder7.getlengthFieldEndOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext19 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "hi!", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 191, 5, 97, (int) (byte) 0, 8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset2 = null;
        java.lang.String str3 = dynamicChannelBuffer1.toString(charset2);
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory5 = dynamicChannelBuffer1.getfactory();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (byte) 10);
        java.nio.charset.Charset charset11 = null;
        java.lang.String str12 = dynamicChannelBuffer10.toString(charset11);
        boolean boolean13 = dynamicChannelBuffer10.readable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = dynamicChannelBuffer10.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, (int) 'a', channelBufferFactory14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder7, 97);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.endianness;
        boolean boolean22 = dynamicChannelBuffer19.getBoolean((int) (short) 1);
        dynamicChannelBuffer19.setByte((int) (short) 10, (int) (short) 16672);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer28 = dynamicChannelBuffer19.toByteBuffer((int) '\000', (int) (short) 16672);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory5);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory14);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

