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
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.nio.ByteOrder byteOrder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer2 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: endianness");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getMedium((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.bytesBefore((int) ' ', channelBufferIndexFinder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.setBytes(0, scatteringByteChannel5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.getInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            short short3 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dynamicChannelBuffer1.toString(10, (int) (short) 1, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(100, outputStream3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dynamicChannelBuffer1.toString(10, (int) (short) 10, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            char char3 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            char char4 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer4.order();
        int int6 = dynamicChannelBuffer4.capacity();
        java.nio.ByteBuffer byteBuffer7 = dynamicChannelBuffer4.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuffer7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int8 = dynamicChannelBuffer7.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer7.bytesBefore(channelBufferIndexFinder9);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 100, outputStream6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.copy(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            char char6 = dynamicChannelBuffer1.getChar((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        // The following exception was thrown during execution in test generation
        try {
            short short6 = dynamicChannelBuffer1.getUnsignedByte((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getUnsignedShort((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (int) '4', (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.channels.GatheringByteChannel gatheringByteChannel3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readBytes(gatheringByteChannel3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            float float4 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.writeBytes(inputStream6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.slice((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int9 = dynamicChannelBuffer8.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int6 = dynamicChannelBuffer5.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer5.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(0, channelBuffer7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer15.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteOrder16);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer3 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer3.order();
        int int5 = dynamicChannelBuffer3.capacity();
        java.nio.ByteBuffer byteBuffer6 = dynamicChannelBuffer3.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer3.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(byteBuffer6);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer1.toByteBuffer(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            byte byte9 = dynamicChannelBuffer1.getByte((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.setBytes(10, inputStream6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeLong((long) (byte) 0);
        byte[] byteArray10 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray10, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        java.nio.channels.GatheringByteChannel gatheringByteChannel11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.getBytes((int) (short) 0, gatheringByteChannel11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int8 = dynamicChannelBuffer7.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer7.bytesBefore(channelBufferIndexFinder9);
        dynamicChannelBuffer7.writerIndex(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer1.toByteBuffer((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(10, byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 1, -1, -1]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getMedium((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) (short) 0, scatteringByteChannel7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.readBytes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dynamicChannelBuffer1.toString((int) (byte) 100, (int) (short) 1, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) '#', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setByte((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeLong((long) (byte) 0);
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.setBytes((int) (byte) 100, inputStream11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        byte[] byteArray10 = new byte[] {};
        dynamicChannelBuffer1.writeBytes(byteArray10);
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.setBytes(0, inputStream13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.writeBytes(inputStream4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.getBytes((int) (byte) 100, gatheringByteChannel10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 0, (int) (byte) 0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            char char2 = dynamicChannelBuffer1.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.setBytes(100, scatteringByteChannel8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, byteArray14, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, 100]");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.channels.GatheringByteChannel gatheringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.getBytes((int) ' ', gatheringByteChannel4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeLong((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int11 = dynamicChannelBuffer10.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        int int13 = dynamicChannelBuffer10.bytesBefore(channelBufferIndexFinder12);
        dynamicChannelBuffer10.writerIndex(1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        // The following exception was thrown during execution in test generation
        try {
            short short10 = dynamicChannelBuffer1.getShort((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder6 = null;
        int int7 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, 0, channelBufferIndexFinder6);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        byte[] byteArray10 = new byte[] {};
        dynamicChannelBuffer1.writeBytes(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int12 = dynamicChannelBuffer11.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer11.slice();
        dynamicChannelBuffer11.setDouble(0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) 10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.getMedium((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.bytesBefore((int) '4', (int) (short) 100, channelBufferIndexFinder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeDouble(10.0d);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.setBytes((-1), scatteringByteChannel9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (short) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            short short9 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (int) (byte) 10, channelBufferFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.lang.String str7 = dynamicChannelBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=10)" + "'", str7, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dynamicChannelBuffer1.toString((int) (short) 0, 10, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        byte[] byteArray10 = new byte[] {};
        dynamicChannelBuffer1.writeBytes(byteArray10);
        dynamicChannelBuffer1.writeMedium(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean16 = dynamicChannelBuffer15.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer15.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(channelBuffer17);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int9 = dynamicChannelBuffer8.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer8.getbuffer();
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer14.order();
        dynamicChannelBuffer14.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer14.buffer;
        dynamicChannelBuffer14.writeChar((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(channelBuffer17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        int int6 = dynamicChannelBuffer1.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.bytesBefore(100, channelBufferIndexFinder8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 100);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.writeBytes(inputStream7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        java.nio.charset.Charset charset6 = null;
        java.lang.String str7 = dynamicChannelBuffer1.toString(charset6);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray13, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, -1, 10, 1, 10]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.setMedium((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = dynamicChannelBuffer1.getFloat((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.bytesBefore(100, (int) (short) 100, channelBufferIndexFinder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.readBytes(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean17 = dynamicChannelBuffer16.readable();
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer16.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder18, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder23 = dynamicChannelBuffer22.order();
        int int24 = dynamicChannelBuffer22.capacity();
        java.nio.ByteBuffer byteBuffer25 = dynamicChannelBuffer22.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer22.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer22.copy();
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer22.setBytes((int) (short) 1, byteArray34);
        dynamicChannelBuffer20.writeBytes(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteOrder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(byteBuffer25);
        org.junit.Assert.assertNotNull(channelBuffer26);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer6.order();
        int int8 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer6.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            byte byte5 = dynamicChannelBuffer1.getByte((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        java.nio.channels.GatheringByteChannel gatheringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readBytes(gatheringByteChannel4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = dynamicChannelBuffer1.getFloat((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setShort((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dynamicChannelBuffer1.getDouble((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore((int) ' ', channelBufferIndexFinder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int9 = dynamicChannelBuffer8.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer8.getbuffer();
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        java.nio.channels.GatheringByteChannel gatheringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer8.getBytes((int) (short) -1, gatheringByteChannel14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer5.readSlice((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteBuffer byteBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        int int9 = dynamicChannelBuffer7.capacity();
        java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer7.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer7.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer7.copy();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer7.setBytes((int) (short) 1, byteArray19);
        dynamicChannelBuffer5.writeBytes(byteArray19);
        java.lang.Class<?> wildcardClass22 = byteArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        int int14 = dynamicChannelBuffer1.bytesBefore((byte) 100);
        java.lang.Class<?> wildcardClass15 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.indexOf(100, 1, channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        dynamicChannelBuffer1.writeChar((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.indexOf((int) (byte) 100, 0, channelBufferIndexFinder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        int int9 = dynamicChannelBuffer7.capacity();
        java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer7.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer7.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer7.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(10, channelBuffer12, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int11 = dynamicChannelBuffer9.capacity();
        java.nio.ByteBuffer byteBuffer12 = dynamicChannelBuffer9.toByteBuffer();
        boolean boolean13 = dynamicChannelBuffer9.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            char char4 = dynamicChannelBuffer1.getChar((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder11, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        int int10 = dynamicChannelBuffer8.capacity();
        dynamicChannelBuffer8.resetWriterIndex();
        dynamicChannelBuffer8.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.duplicate();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer8.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer8.readBytes(0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int27 = dynamicChannelBuffer26.writerIndex();
        dynamicChannelBuffer26.ensureWritableBytes(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 1, outputStream4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer1.slice(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        boolean boolean5 = dynamicChannelBuffer1.readable();
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dynamicChannelBuffer1.toString((-1), (int) (short) 100, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.getInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.getbuffer();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 100, outputStream6, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setByte((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.getMedium(0);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore((int) (short) 1, (int) (short) 1, channelBufferIndexFinder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        int int10 = dynamicChannelBuffer8.capacity();
        dynamicChannelBuffer8.resetWriterIndex();
        dynamicChannelBuffer8.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.duplicate();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer8.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer8.readBytes(0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.getMedium(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer6.order();
        int int8 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer6.resetWriterIndex();
        dynamicChannelBuffer6.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer6.duplicate();
        int int14 = dynamicChannelBuffer6.writerIndex();
        byte[] byteArray15 = new byte[] {};
        dynamicChannelBuffer6.writeBytes(byteArray15);
        dynamicChannelBuffer1.readBytes(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer1.readBytes((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.lang.String str7 = dynamicChannelBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer1.readBytes((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=10)" + "'", str7, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readBytes(gatheringByteChannel7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer5.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        java.nio.ByteBuffer[] byteBufferArray3 = dynamicChannelBuffer1.toByteBuffers();
        java.nio.channels.GatheringByteChannel gatheringByteChannel4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.readBytes(gatheringByteChannel4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteBufferArray3);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) 'a', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.getUnsignedMedium((int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.markWriterIndex();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray9, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 10]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeDouble(10.0d);
        java.lang.Class<?> wildcardClass8 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.getUnsignedMedium((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.duplicate();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer5.order();
        int int7 = dynamicChannelBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer5.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 100, byteBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(byteBuffer8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeDouble(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer1.toByteBuffer(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        boolean boolean7 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.lang.String str7 = dynamicChannelBuffer1.toString();
        boolean boolean8 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer11 = dynamicChannelBuffer1.toByteBuffer((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=10)" + "'", str7, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray17 = dynamicChannelBuffer1.toByteBuffers((-1), (int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean10 = lengthFieldBasedFrameDecoder7.failImmediatelyOnTooLongFrame;
        lengthFieldBasedFrameDecoder7.bytesToDiscard = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext13 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=3, cap=10)", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        dynamicChannelBuffer1.ensureWritableBytes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext9, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dynamicChannelBuffer1.toString((int) (short) -1, (int) (byte) 100, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dynamicChannelBuffer1.getUnsignedInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        byte byte8 = dynamicChannelBuffer1.getByte((int) (short) 1);
        dynamicChannelBuffer1.setMedium(1, (-1));
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.writeBytes(inputStream12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -16 + "'", byte8 == (byte) -16);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        byte byte8 = dynamicChannelBuffer1.getByte((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -16 + "'", byte8 == (byte) -16);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext6, exceptionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.copy((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore(0, 100, channelBufferIndexFinder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.readBytes(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.getMedium(0);
        long long6 = dynamicChannelBuffer1.getUnsignedInt(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int11 = dynamicChannelBuffer9.capacity();
        java.nio.ByteBuffer byteBuffer12 = dynamicChannelBuffer9.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer9.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer9.copy();
        java.nio.charset.Charset charset15 = null;
        java.lang.String str16 = dynamicChannelBuffer9.toString(charset15);
        java.nio.ByteBuffer[] byteBufferArray17 = dynamicChannelBuffer9.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(97, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(byteBuffer12);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(byteBufferArray17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.failIfNecessary(channelHandlerContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dynamicChannelBuffer1.getDouble((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray17 = dynamicChannelBuffer16.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray17, (int) (byte) -16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = dynamicChannelBuffer4.readChar();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dynamicChannelBuffer1.getLong(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        int int31 = dynamicChannelBuffer8.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = dynamicChannelBuffer8.writeBytes(scatteringByteChannel32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        dynamicChannelBuffer1.writeLong((long) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(channelBuffer10, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        int int10 = dynamicChannelBuffer8.capacity();
        dynamicChannelBuffer8.resetWriterIndex();
        dynamicChannelBuffer8.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.duplicate();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer8.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer8.readBytes(0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer27.order();
        int int29 = dynamicChannelBuffer27.capacity();
        java.nio.ByteBuffer byteBuffer30 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer8.getBytes((int) (byte) 10, byteBuffer30);
        java.nio.channels.GatheringByteChannel gatheringByteChannel32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = dynamicChannelBuffer8.readBytes(gatheringByteChannel32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(byteBuffer30);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer12 = dynamicChannelBuffer1.toByteBuffer((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.getUnsignedMedium((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) 'a', (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=3, cap=10)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=3, cap=10)");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.getMedium(0);
        long long6 = dynamicChannelBuffer1.getUnsignedInt(0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.getUnsignedMedium(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer6.order();
        int int8 = dynamicChannelBuffer6.capacity();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer6.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer6.buffer;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer1.indexOf((int) (byte) 100, (int) '4', channelBufferIndexFinder9);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.markWriterIndex();
        int int4 = dynamicChannelBuffer1.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer7 = dynamicChannelBuffer1.toByteBuffer((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int17 = dynamicChannelBuffer16.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        int int19 = dynamicChannelBuffer16.bytesBefore(channelBufferIndexFinder18);
        dynamicChannelBuffer16.writerIndex(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray24 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer16.writeBytes(byteArray24, 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.ensureWritableBytes(0);
        boolean boolean12 = dynamicChannelBuffer1.writable();
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = dynamicChannelBuffer1.getByte((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray9 = dynamicChannelBuffer8.array();
        dynamicChannelBuffer1.writeBytes(byteArray9, 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer1.readBytes((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.duplicate();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.readBytes(0);
        java.lang.Class<?> wildcardClass17 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int8 = dynamicChannelBuffer7.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer7.bytesBefore(channelBufferIndexFinder9);
        float float12 = dynamicChannelBuffer7.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer7.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) ' ', channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        int int31 = dynamicChannelBuffer8.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setBytes((int) (short) -1, channelBuffer33, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int15 = dynamicChannelBuffer14.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer14.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) ' ', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer7.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        int int13 = dynamicChannelBuffer11.capacity();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer11.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer11.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer11.copy();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer11.setBytes((int) (short) 1, byteArray23);
        dynamicChannelBuffer7.writeBytes(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(1, byteArray23, (int) (byte) -16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        // The following exception was thrown during execution in test generation
        try {
            short short6 = dynamicChannelBuffer1.getShort((int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        byte[] byteArray10 = new byte[] {};
        dynamicChannelBuffer1.writeBytes(byteArray10);
        dynamicChannelBuffer1.writeMedium(0);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        boolean boolean7 = dynamicChannelBuffer1.equals((java.lang.Object) (byte) 0);
        dynamicChannelBuffer1.discardReadBytes();
        dynamicChannelBuffer1.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            float float10 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        int int6 = dynamicChannelBuffer1.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer10.buffer;
        dynamicChannelBuffer10.resetReaderIndex();
        dynamicChannelBuffer10.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer18.order();
        int int20 = dynamicChannelBuffer18.capacity();
        java.nio.ByteBuffer byteBuffer21 = dynamicChannelBuffer18.toByteBuffer();
        dynamicChannelBuffer10.getBytes((int) (short) 10, byteBuffer21);
        dynamicChannelBuffer1.writeBytes(byteBuffer21);
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        boolean boolean5 = dynamicChannelBuffer1.readable();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteArray13);
        java.nio.channels.GatheringByteChannel gatheringByteChannel15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer1.readBytes(gatheringByteChannel15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.setInt((int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.copy((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = dynamicChannelBuffer1.getUnsignedMedium((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writerIndex((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        dynamicChannelBuffer7.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer7.buffer;
        dynamicChannelBuffer7.resetReaderIndex();
        dynamicChannelBuffer7.markWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray13 = dynamicChannelBuffer7.toByteBuffers();
        boolean boolean14 = dynamicChannelBuffer7.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (-1048576), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteBufferArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        int int6 = dynamicChannelBuffer1.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            byte byte6 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        char char7 = dynamicChannelBuffer1.getChar(0);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 100);
        dynamicChannelBuffer14.readerIndex(0);
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            short short18 = dynamicChannelBuffer14.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        lengthFieldBasedFrameDecoder5.settooLongFrameLength((long) (byte) -1);
        int int20 = lengthFieldBasedFrameDecoder5.lengthFieldLength;
        lengthFieldBasedFrameDecoder5.bytesToDiscard = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.MessageEvent messageEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext23, messageEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        boolean boolean4 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((-1), outputStream5, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int9 = dynamicChannelBuffer8.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer8.getbuffer();
        boolean boolean11 = dynamicChannelBuffer8.readable();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        java.nio.channels.GatheringByteChannel gatheringByteChannel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dynamicChannelBuffer8.getBytes((int) (byte) 0, gatheringByteChannel14, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext10 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "DynamicChannelBuffer(ridx=0, widx=3, cap=10)", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readBytes(gatheringByteChannel7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        int int6 = dynamicChannelBuffer1.getMedium((int) (short) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int10 = dynamicChannelBuffer9.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer9.copy();
        dynamicChannelBuffer9.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.skipBytes((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder4, (int) (byte) 1, channelBufferFactory6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: factory");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        short short16 = dynamicChannelBuffer1.getShort((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat((int) (byte) 100, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer1.indexOf((int) (byte) 100, (int) '4', channelBufferIndexFinder9);
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.setBytes((int) (byte) -1, inputStream12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.readSlice((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.bytesBefore((int) (short) 100, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        dynamicChannelBuffer7.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer7.buffer;
        dynamicChannelBuffer7.resetReaderIndex();
        dynamicChannelBuffer7.writeDouble(10.0d);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dynamicChannelBuffer1.getUnsignedInt(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.markWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray7 = dynamicChannelBuffer1.toByteBuffers();
        boolean boolean8 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong(10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        boolean boolean15 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        int int20 = dynamicChannelBuffer17.bytesBefore(channelBufferIndexFinder19);
        float float22 = dynamicChannelBuffer17.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer17.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17, (int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) '4', (int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -16");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer12.bytesBefore(channelBufferIndexFinder14);
        float float17 = dynamicChannelBuffer12.getFloat(0);
        dynamicChannelBuffer12.writeLong((long) (short) 0);
        dynamicChannelBuffer12.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory21 = dynamicChannelBuffer12.factory();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\000', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory21);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), byteBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer1.indexOf((int) (byte) 100, (int) '4', channelBufferIndexFinder9);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.endianness;
        dynamicChannelBuffer13.writeChar((int) 'a');
        boolean boolean18 = dynamicChannelBuffer13.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder21 = dynamicChannelBuffer20.order();
        int int22 = dynamicChannelBuffer20.capacity();
        dynamicChannelBuffer20.resetWriterIndex();
        dynamicChannelBuffer20.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer20.duplicate();
        dynamicChannelBuffer20.clear();
        dynamicChannelBuffer20.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer20.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer35 = dynamicChannelBuffer20.readBytes(0);
        int int36 = dynamicChannelBuffer13.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder40 = dynamicChannelBuffer39.order();
        int int41 = dynamicChannelBuffer39.capacity();
        java.nio.ByteBuffer byteBuffer42 = dynamicChannelBuffer39.toByteBuffer();
        dynamicChannelBuffer20.getBytes((int) (byte) 10, byteBuffer42);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) -16, byteBuffer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteOrder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(channelBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(byteBuffer42);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.writeChar((int) '#');
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.buffer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        int int14 = dynamicChannelBuffer12.capacity();
        dynamicChannelBuffer12.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray16 = dynamicChannelBuffer12.toByteBuffers();
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer12.toString(charset17);
        java.lang.Object obj19 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        int int31 = dynamicChannelBuffer8.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.setChar((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int4 = dynamicChannelBuffer1.getMedium(0);
        long long6 = dynamicChannelBuffer1.getUnsignedInt(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        int int13 = dynamicChannelBuffer1.getMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeByte(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) '#', (long) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1048576) + "'", int13 == (-1048576));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        int int31 = dynamicChannelBuffer8.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer34 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder35 = dynamicChannelBuffer34.order();
        int int36 = dynamicChannelBuffer34.capacity();
        java.nio.ByteBuffer byteBuffer37 = dynamicChannelBuffer34.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer38 = dynamicChannelBuffer34.buffer;
        boolean boolean40 = dynamicChannelBuffer34.equals((java.lang.Object) (byte) 0);
        java.nio.ByteBuffer byteBuffer43 = dynamicChannelBuffer34.toByteBuffer(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.getBytes((-1048576), byteBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(byteOrder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(byteBuffer37);
        org.junit.Assert.assertNotNull(channelBuffer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteBuffer43);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray7 = dynamicChannelBuffer6.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        int int9 = dynamicChannelBuffer7.capacity();
        java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer7.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer7.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer7.copy();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer7.setBytes((int) (short) 1, byteArray19);
        dynamicChannelBuffer5.writeBytes(byteArray19);
        int int25 = dynamicChannelBuffer5.indexOf(0, (int) (short) 10, (byte) -1);
        java.nio.charset.Charset charset26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dynamicChannelBuffer5.toString(charset26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        dynamicChannelBuffer12.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.buffer;
        dynamicChannelBuffer12.resetReaderIndex();
        dynamicChannelBuffer12.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(channelBuffer15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.endianness;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer1.writeLong((-1L));
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0]");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        java.nio.ByteBuffer byteBuffer5 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        int int9 = dynamicChannelBuffer7.capacity();
        dynamicChannelBuffer7.resetWriterIndex();
        dynamicChannelBuffer7.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer7.duplicate();
        int int15 = dynamicChannelBuffer7.writerIndex();
        dynamicChannelBuffer7.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteBuffer5);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.markWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray7 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteBufferArray7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer7.writeLong((-1L));
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dynamicChannelBuffer5.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        int int14 = dynamicChannelBuffer1.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short15 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.getInt((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (byte) -16, (-1048576));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.skipBytes(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        int int13 = dynamicChannelBuffer1.getMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeByte(10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dynamicChannelBuffer1.readLong();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1048576) + "'", int13 == (-1048576));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dynamicChannelBuffer1.bytesBefore(2, (int) (short) -1, channelBufferIndexFinder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = dynamicChannelBuffer1.getDouble((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore(2, (int) (short) 10, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        dynamicChannelBuffer1.ensureWritableBytes((int) (byte) -1);
        java.nio.charset.Charset charset8 = null;
        java.lang.String str9 = dynamicChannelBuffer1.toString((int) (byte) 1, (int) (short) 0, charset8);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, outputStream11, (-1048576));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.readerIndex(0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.getBytes(100, gatheringByteChannel13, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        lengthFieldBasedFrameDecoder5.settooLongFrameLength((long) 11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int8 = dynamicChannelBuffer7.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer7.bytesBefore(channelBufferIndexFinder9);
        float float12 = dynamicChannelBuffer7.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer7.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean16 = dynamicChannelBuffer15.readable();
        dynamicChannelBuffer15.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer15.getendianness();
        boolean boolean20 = dynamicChannelBuffer7.equals((java.lang.Object) byteOrder19);
        dynamicChannelBuffer7.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray24 = dynamicChannelBuffer23.array();
        dynamicChannelBuffer7.writeBytes(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (short) 1, byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        dynamicChannelBuffer1.markReaderIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        java.nio.channels.GatheringByteChannel gatheringByteChannel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.readBytes(gatheringByteChannel6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) (short) 0);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.getUnsignedShort((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.lang.String str5 = dynamicChannelBuffer1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.readSlice(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=3, cap=10)" + "'", str5, "DynamicChannelBuffer(ridx=0, widx=3, cap=10)");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        long long7 = lengthFieldBasedFrameDecoder3.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer10.endianness;
        dynamicChannelBuffer10.writeChar((int) 'a');
        boolean boolean15 = dynamicChannelBuffer10.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        dynamicChannelBuffer17.resetWriterIndex();
        dynamicChannelBuffer17.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer17.duplicate();
        dynamicChannelBuffer17.clear();
        dynamicChannelBuffer17.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer17.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer17.readBytes(0);
        int int33 = dynamicChannelBuffer10.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj34 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.fail(channelHandlerContext35, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        dynamicChannelBuffer1.setInt((int) (byte) 0, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int11 = dynamicChannelBuffer9.capacity();
        dynamicChannelBuffer9.resetWriterIndex();
        dynamicChannelBuffer9.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer9.duplicate();
        int int17 = dynamicChannelBuffer9.writerIndex();
        byte[] byteArray18 = new byte[] {};
        dynamicChannelBuffer9.writeBytes(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray18, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        int int7 = lengthFieldBasedFrameDecoder5.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int7 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        lengthFieldBasedFrameDecoder5.settooLongFrameLength((long) (byte) -1);
        int int20 = lengthFieldBasedFrameDecoder5.lengthFieldLength;
        lengthFieldBasedFrameDecoder5.bytesToDiscard = '#';
        long long23 = lengthFieldBasedFrameDecoder5.getbytesToDiscard();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder26 = dynamicChannelBuffer25.order();
        java.nio.ByteOrder byteOrder27 = dynamicChannelBuffer25.endianness;
        dynamicChannelBuffer25.writeChar((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = lengthFieldBasedFrameDecoder5.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertNotNull(byteOrder26);
        org.junit.Assert.assertNotNull(byteOrder27);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 0, (byte) -16, (byte) 0, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) '\000', byteArray14, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[100, 0, -16, 0, -1, -1]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setDouble((int) (byte) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        int int4 = dynamicChannelBuffer1.getInt((int) (byte) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.copy(8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writerIndex(0);
        java.nio.ByteBuffer byteBuffer7 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int11 = dynamicChannelBuffer10.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer10.slice();
        dynamicChannelBuffer10.setDouble(0, (double) 1.0f);
        dynamicChannelBuffer10.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(97, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(channelBuffer12);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteArray13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        int int20 = dynamicChannelBuffer17.bytesBefore(channelBufferIndexFinder19);
        float float22 = dynamicChannelBuffer17.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer17.copy();
        dynamicChannelBuffer1.setBytes(2, channelBuffer23, (int) (byte) 0);
        dynamicChannelBuffer1.markReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = dynamicChannelBuffer1.getUnsignedInt((int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext17, exceptionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        dynamicChannelBuffer1.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            short short17 = dynamicChannelBuffer1.getShort((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) '\000');
        boolean boolean11 = dynamicChannelBuffer1.readable();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = dynamicChannelBuffer1.getDouble(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        boolean boolean23 = dynamicChannelBuffer9.hasArray();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dynamicChannelBuffer9.setBytes((int) (byte) -16, scatteringByteChannel25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        int int14 = dynamicChannelBuffer12.capacity();
        dynamicChannelBuffer12.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray16 = dynamicChannelBuffer12.toByteBuffers();
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer12.toString(charset17);
        java.lang.Object obj19 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelInterestChanged(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        boolean boolean7 = dynamicChannelBuffer1.equals((java.lang.Object) (byte) 0);
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        dynamicChannelBuffer12.ensureWritableBytes(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) (byte) 100, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        dynamicChannelBuffer4.writeMedium(2);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dynamicChannelBuffer4.setBytes(97, scatteringByteChannel26, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        int int7 = lengthFieldBasedFrameDecoder5.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.fail(channelHandlerContext8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean14 = dynamicChannelBuffer13.readable();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder15, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.order();
        int int21 = dynamicChannelBuffer19.capacity();
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer19.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer19.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer19.copy();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer19.setBytes((int) (short) 1, byteArray31);
        dynamicChannelBuffer17.writeBytes(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        int int7 = lengthFieldBasedFrameDecoder5.maxFrameLength;
        int int8 = lengthFieldBasedFrameDecoder5.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setFloat(100, 3.390625f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBufferFactory8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            float float5 = dynamicChannelBuffer1.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.getInt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        java.nio.channels.ScatteringByteChannel scatteringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) (byte) 10, scatteringByteChannel7, (-1048576));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int11 = dynamicChannelBuffer9.capacity();
        dynamicChannelBuffer9.resetWriterIndex();
        dynamicChannelBuffer9.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer9.duplicate();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.setChar((int) (byte) 1, (int) (short) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = lengthFieldBasedFrameDecoder3.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (short) 10, (int) (byte) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent25 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext24, childChannelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        dynamicChannelBuffer1.markWriterIndex();
        int int20 = dynamicChannelBuffer1.indexOf((int) (byte) -16, (int) (short) 10, (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int23 = dynamicChannelBuffer22.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder24 = null;
        int int25 = dynamicChannelBuffer22.bytesBefore(channelBufferIndexFinder24);
        float float27 = dynamicChannelBuffer22.getFloat(0);
        dynamicChannelBuffer22.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int7 = dynamicChannelBuffer6.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder8 = null;
        int int9 = dynamicChannelBuffer6.bytesBefore(channelBufferIndexFinder8);
        boolean boolean10 = dynamicChannelBuffer6.writable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer6.slice();
        int int12 = dynamicChannelBuffer6.arrayOffset();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        int int10 = dynamicChannelBuffer8.capacity();
        dynamicChannelBuffer8.resetWriterIndex();
        dynamicChannelBuffer8.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.duplicate();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer8.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer8.readBytes(0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.readerIndex(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (short) 10, (int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = dynamicChannelBuffer1.readUnsignedInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        int int7 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder6 = null;
        int int7 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, 0, channelBufferIndexFinder6);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) '\000');
        boolean boolean11 = dynamicChannelBuffer1.readable();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean13 = dynamicChannelBuffer12.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.buffer;
        boolean boolean15 = dynamicChannelBuffer12.isDirect();
        int int17 = dynamicChannelBuffer12.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer12.readSlice((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder22 = dynamicChannelBuffer21.order();
        dynamicChannelBuffer21.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer21.buffer;
        dynamicChannelBuffer21.resetReaderIndex();
        dynamicChannelBuffer21.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder30 = dynamicChannelBuffer29.order();
        int int31 = dynamicChannelBuffer29.capacity();
        java.nio.ByteBuffer byteBuffer32 = dynamicChannelBuffer29.toByteBuffer();
        dynamicChannelBuffer21.getBytes((int) (short) 10, byteBuffer32);
        dynamicChannelBuffer12.writeBytes(byteBuffer32);
        dynamicChannelBuffer12.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer38 = lengthFieldBasedFrameDecoder3.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder22);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(byteOrder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(byteBuffer32);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer13.endianness;
        dynamicChannelBuffer13.writeChar((int) 'a');
        boolean boolean18 = dynamicChannelBuffer13.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder21 = dynamicChannelBuffer20.order();
        int int22 = dynamicChannelBuffer20.capacity();
        dynamicChannelBuffer20.resetWriterIndex();
        dynamicChannelBuffer20.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer20.duplicate();
        dynamicChannelBuffer20.clear();
        dynamicChannelBuffer20.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer20.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer35 = dynamicChannelBuffer20.readBytes(0);
        int int36 = dynamicChannelBuffer13.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer10.getBytes(11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteOrder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(channelBuffer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        dynamicChannelBuffer1.markWriterIndex();
        int int20 = dynamicChannelBuffer1.indexOf((int) (byte) -16, (int) (short) 10, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            short short21 = dynamicChannelBuffer1.readShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        int int10 = dynamicChannelBuffer8.capacity();
        dynamicChannelBuffer8.resetWriterIndex();
        dynamicChannelBuffer8.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.duplicate();
        int int16 = dynamicChannelBuffer8.writerIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        dynamicChannelBuffer12.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.buffer;
        dynamicChannelBuffer12.resetReaderIndex();
        dynamicChannelBuffer12.writeDouble(10.0d);
        long long19 = dynamicChannelBuffer12.readLong();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory20 = dynamicChannelBuffer12.factory;
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder9, (int) (byte) -1, channelBufferFactory20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 4621819117588971520L + "'", long19 == 4621819117588971520L);
        org.junit.Assert.assertNotNull(channelBufferFactory20);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        int int31 = dynamicChannelBuffer8.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer8.setInt(11, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        java.lang.String str3 = dynamicChannelBuffer1.toString();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dynamicChannelBuffer1.bytesBefore(4, channelBufferIndexFinder5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=10)" + "'", str3, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        boolean boolean7 = dynamicChannelBuffer1.equals((java.lang.Object) (byte) 0);
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        dynamicChannelBuffer11.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.buffer;
        dynamicChannelBuffer11.resetReaderIndex();
        dynamicChannelBuffer11.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.order();
        int int21 = dynamicChannelBuffer19.capacity();
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer19.toByteBuffer();
        dynamicChannelBuffer11.getBytes((int) (short) 10, byteBuffer22);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(11, byteBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(byteBuffer22);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder5 = null;
        int int6 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder5);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int12 = dynamicChannelBuffer9.getMedium(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer14.order();
        int int16 = dynamicChannelBuffer14.capacity();
        dynamicChannelBuffer14.resetWriterIndex();
        dynamicChannelBuffer14.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer14.duplicate();
        int int22 = dynamicChannelBuffer14.writerIndex();
        byte[] byteArray23 = new byte[] {};
        dynamicChannelBuffer14.writeBytes(byteArray23);
        dynamicChannelBuffer9.readBytes(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(100, byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        int int13 = dynamicChannelBuffer1.getMedium((int) (byte) 0);
        dynamicChannelBuffer1.writeByte(10);
        java.nio.charset.Charset charset18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dynamicChannelBuffer1.toString(1, 11, charset18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1048576) + "'", int13 == (-1048576));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        dynamicChannelBuffer13.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer13.buffer;
        dynamicChannelBuffer13.resetReaderIndex();
        dynamicChannelBuffer13.writeDouble(10.0d);
        long long20 = dynamicChannelBuffer13.readLong();
        dynamicChannelBuffer1.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13);
        // The following exception was thrown during execution in test generation
        try {
            float float22 = dynamicChannelBuffer13.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 4621819117588971520L + "'", long20 == 4621819117588971520L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        dynamicChannelBuffer1.writeChar((int) (byte) 100);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int17 = dynamicChannelBuffer16.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder18 = null;
        int int19 = dynamicChannelBuffer16.bytesBefore(channelBufferIndexFinder18);
        float float21 = dynamicChannelBuffer16.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer16.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean25 = dynamicChannelBuffer24.readable();
        dynamicChannelBuffer24.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer24.getendianness();
        boolean boolean29 = dynamicChannelBuffer16.equals((java.lang.Object) byteOrder28);
        dynamicChannelBuffer16.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray33 = dynamicChannelBuffer32.array();
        dynamicChannelBuffer16.writeBytes(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray33, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.getendianness();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (int) '\000', channelBufferIndexFinder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean17 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer16.buffer;
        boolean boolean19 = dynamicChannelBuffer16.isDirect();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        dynamicChannelBuffer16.setZero((int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer16.readerIndex((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.readerIndex(0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.getBytes((int) (short) 1, gatheringByteChannel13, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        int int14 = dynamicChannelBuffer12.capacity();
        dynamicChannelBuffer12.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray16 = dynamicChannelBuffer12.toByteBuffers();
        java.nio.charset.Charset charset17 = null;
        java.lang.String str18 = dynamicChannelBuffer12.toString(charset17);
        java.lang.Object obj19 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dynamicChannelBuffer12.bytesBefore((int) (byte) 1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        long long10 = lengthFieldBasedFrameDecoder3.getbytesToDiscard();
        int int11 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        byte byte8 = dynamicChannelBuffer1.getByte((int) (short) 1);
        dynamicChannelBuffer1.setMedium(1, (-1));
        dynamicChannelBuffer1.discardReadBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer1.copy((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -16 + "'", byte8 == (byte) -16);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer10.endianness;
        dynamicChannelBuffer10.writeChar((int) 'a');
        boolean boolean15 = dynamicChannelBuffer10.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        dynamicChannelBuffer17.resetWriterIndex();
        dynamicChannelBuffer17.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer17.duplicate();
        dynamicChannelBuffer17.clear();
        dynamicChannelBuffer17.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer17.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer17.readBytes(0);
        int int33 = dynamicChannelBuffer10.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj34 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean37 = dynamicChannelBuffer36.readable();
        dynamicChannelBuffer36.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder40 = dynamicChannelBuffer36.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer42 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean43 = dynamicChannelBuffer42.readable();
        dynamicChannelBuffer42.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer42.getendianness();
        boolean boolean47 = dynamicChannelBuffer36.equals((java.lang.Object) byteOrder46);
        dynamicChannelBuffer36.writeChar((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer17.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        dynamicChannelBuffer1.writeZero(4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int12 = dynamicChannelBuffer11.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer11.slice();
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder14, 2);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 1, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(byteOrder14);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.markWriterIndex();
        dynamicChannelBuffer1.writeShort((-1048576));
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer10.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer14.order();
        int int16 = dynamicChannelBuffer14.capacity();
        java.nio.ByteBuffer byteBuffer17 = dynamicChannelBuffer14.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer14.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer14.copy();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer14.setBytes((int) (short) 1, byteArray26);
        dynamicChannelBuffer10.writeBytes(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray26, (int) '\000', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(byteBuffer17);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer7.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        int int13 = dynamicChannelBuffer11.capacity();
        java.nio.ByteBuffer byteBuffer14 = dynamicChannelBuffer11.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer11.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer11.copy();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer11.setBytes((int) (short) 1, byteArray23);
        dynamicChannelBuffer7.writeBytes(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(byteBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer7.writeLong((-1L));
        dynamicChannelBuffer5.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7);
        int int11 = dynamicChannelBuffer5.writableBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer5.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            double double5 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeDouble(10.0d);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dynamicChannelBuffer1.getUnsignedInt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) '\000');
        boolean boolean11 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        int int15 = dynamicChannelBuffer13.capacity();
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer13.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer13.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer13.copy();
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer13.setBytes((int) (short) 1, byteArray25);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer29 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int30 = dynamicChannelBuffer29.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder31 = null;
        int int32 = dynamicChannelBuffer29.bytesBefore(channelBufferIndexFinder31);
        float float34 = dynamicChannelBuffer29.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer35 = dynamicChannelBuffer29.copy();
        dynamicChannelBuffer13.setBytes(2, channelBuffer35, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer39 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder40 = dynamicChannelBuffer39.order();
        dynamicChannelBuffer39.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer42 = dynamicChannelBuffer39.buffer;
        dynamicChannelBuffer39.resetReaderIndex();
        dynamicChannelBuffer39.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer47 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder48 = dynamicChannelBuffer47.order();
        int int49 = dynamicChannelBuffer47.capacity();
        java.nio.ByteBuffer byteBuffer50 = dynamicChannelBuffer47.toByteBuffer();
        dynamicChannelBuffer39.getBytes((int) (short) 10, byteBuffer50);
        dynamicChannelBuffer13.readBytes(byteBuffer50);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer35);
        org.junit.Assert.assertNotNull(byteOrder40);
        org.junit.Assert.assertNotNull(channelBuffer42);
        org.junit.Assert.assertNotNull(byteOrder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(byteBuffer50);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int6 = dynamicChannelBuffer5.writerIndex();
        dynamicChannelBuffer5.ensureWritableBytes(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        dynamicChannelBuffer11.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.buffer;
        dynamicChannelBuffer11.resetReaderIndex();
        dynamicChannelBuffer11.writeDouble(10.0d);
        dynamicChannelBuffer5.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer5, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(channelBuffer14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.getfactory();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder14 = null;
        int int15 = dynamicChannelBuffer12.bytesBefore(channelBufferIndexFinder14);
        float float17 = dynamicChannelBuffer12.getFloat(0);
        dynamicChannelBuffer12.writeLong((long) (short) 0);
        dynamicChannelBuffer12.resetReaderIndex();
        dynamicChannelBuffer12.ensureWritableBytes(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray26 = dynamicChannelBuffer25.array();
        dynamicChannelBuffer12.getBytes((int) (short) 1, byteArray26, 2, 4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(2, byteArray26, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.setInt((int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setShort((-1048576), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1048576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        dynamicChannelBuffer1.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer1.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer1.readBytes(0);
        java.nio.channels.GatheringByteChannel gatheringByteChannel17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dynamicChannelBuffer1.readBytes(gatheringByteChannel17, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setLong((int) (byte) -1, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer6.order();
        int int8 = dynamicChannelBuffer6.capacity();
        dynamicChannelBuffer6.resetWriterIndex();
        dynamicChannelBuffer6.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer6.duplicate();
        dynamicChannelBuffer6.clear();
        dynamicChannelBuffer6.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer6.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer6.readBytes(0);
        dynamicChannelBuffer1.getBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6, 0, (int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int27 = dynamicChannelBuffer26.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer26.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(channelBuffer28);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.markWriterIndex();
        java.lang.Class<?> wildcardClass6 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeLong((long) 'a');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int8 = dynamicChannelBuffer7.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer7.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        int int14 = dynamicChannelBuffer12.capacity();
        dynamicChannelBuffer12.resetWriterIndex();
        dynamicChannelBuffer12.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer12.duplicate();
        dynamicChannelBuffer12.clear();
        dynamicChannelBuffer12.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer12.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer12.readBytes(0);
        dynamicChannelBuffer7.getBytes((int) (byte) 0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, 0, (int) (short) 1);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder33 = dynamicChannelBuffer32.order();
        dynamicChannelBuffer32.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer35 = dynamicChannelBuffer32.buffer;
        dynamicChannelBuffer32.resetReaderIndex();
        dynamicChannelBuffer32.writeDouble(10.0d);
        java.nio.ByteOrder byteOrder39 = dynamicChannelBuffer32.getendianness();
        dynamicChannelBuffer12.buffer = dynamicChannelBuffer32;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((-1048576), (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer12, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(byteOrder33);
        org.junit.Assert.assertNotNull(channelBuffer35);
        org.junit.Assert.assertNotNull(byteOrder39);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer24.order();
        int int26 = dynamicChannelBuffer24.capacity();
        java.nio.ByteBuffer byteBuffer27 = dynamicChannelBuffer24.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer24.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer24.copy();
        java.nio.charset.Charset charset30 = null;
        java.lang.String str31 = dynamicChannelBuffer24.toString(charset30);
        java.nio.ByteBuffer[] byteBufferArray32 = dynamicChannelBuffer24.toByteBuffers();
        dynamicChannelBuffer24.writeByte((int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder37 = dynamicChannelBuffer36.order();
        dynamicChannelBuffer36.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer36.buffer;
        dynamicChannelBuffer36.resetReaderIndex();
        dynamicChannelBuffer36.writeDouble(10.0d);
        long long43 = dynamicChannelBuffer36.readLong();
        dynamicChannelBuffer24.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        // The following exception was thrown during execution in test generation
        try {
            float float46 = dynamicChannelBuffer9.readFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteBufferArray32);
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNotNull(channelBuffer39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 4621819117588971520L + "'", long43 == 4621819117588971520L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        int int6 = dynamicChannelBuffer1.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        dynamicChannelBuffer10.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer10.buffer;
        dynamicChannelBuffer10.resetReaderIndex();
        dynamicChannelBuffer10.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer18 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer18.order();
        int int20 = dynamicChannelBuffer18.capacity();
        java.nio.ByteBuffer byteBuffer21 = dynamicChannelBuffer18.toByteBuffer();
        dynamicChannelBuffer10.getBytes((int) (short) 10, byteBuffer21);
        dynamicChannelBuffer1.writeBytes(byteBuffer21);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = dynamicChannelBuffer1.copy(2, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(channelBuffer13);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(byteBuffer21);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        char char7 = dynamicChannelBuffer1.getChar(0);
        dynamicChannelBuffer1.resetReaderIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.getMedium((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder10.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.writeLong((long) (short) 1);
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) 'a', inputStream7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.MessageEvent messageEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext7, messageEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.ensureWritableBytes(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray15 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer1.getBytes((int) (short) 1, byteArray15, 2, 4);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray21 = dynamicChannelBuffer20.array();
        int int23 = dynamicChannelBuffer20.getInt((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jboss.netty.channel.DefaultChannelPipeline defaultChannelPipeline0 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext1 = null;
        org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext2 = null;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        int int10 = lengthFieldBasedFrameDecoder7.getlengthFieldOffset();
        int int11 = lengthFieldBasedFrameDecoder7.getlengthFieldLength();
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.channel.DefaultChannelPipeline.DefaultChannelHandlerContext defaultChannelHandlerContext12 = defaultChannelPipeline0.new DefaultChannelHandlerContext(defaultChannelHandlerContext1, defaultChannelHandlerContext2, "", (org.jboss.netty.channel.ChannelHandler) lengthFieldBasedFrameDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.jboss.netty.channel.DefaultChannelPipeline$DefaultChannelHandlerContext with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.channels.GatheringByteChannel gatheringByteChannel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.getBytes((int) ' ', gatheringByteChannel10, (int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        dynamicChannelBuffer1.writerIndex(1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int10 = dynamicChannelBuffer9.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer9.getbuffer();
        boolean boolean12 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writerIndex(0);
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer9.toByteBuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer17.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean23 = dynamicChannelBuffer22.readable();
        java.nio.ByteOrder byteOrder24 = dynamicChannelBuffer22.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder24, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder29 = dynamicChannelBuffer28.order();
        int int30 = dynamicChannelBuffer28.capacity();
        java.nio.ByteBuffer byteBuffer31 = dynamicChannelBuffer28.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer28.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer33 = dynamicChannelBuffer28.copy();
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer28.setBytes((int) (short) 1, byteArray40);
        dynamicChannelBuffer26.writeBytes(byteArray40);
        dynamicChannelBuffer17.getBytes(0, byteArray40);
        dynamicChannelBuffer9.writeBytes(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray40, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteOrder24);
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertNotNull(channelBuffer33);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.ensureWritableBytes(0);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.setBytes((int) (short) 10, scatteringByteChannel13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder16 = dynamicChannelBuffer15.order();
        java.nio.ByteOrder byteOrder17 = dynamicChannelBuffer15.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.order();
        int int21 = dynamicChannelBuffer19.capacity();
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer19.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer19.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer19.copy();
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer19.setBytes((int) (short) 1, byteArray31);
        dynamicChannelBuffer15.writeBytes(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(97, byteArray31, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteOrder16);
        org.junit.Assert.assertNotNull(byteOrder17);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.setIndex((int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.getMedium((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteOrder3);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer2 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setInt(8, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(channelBuffer2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        lengthFieldBasedFrameDecoder5.settooLongFrameLength((long) (byte) -1);
        int int20 = lengthFieldBasedFrameDecoder5.lengthFieldLength;
        lengthFieldBasedFrameDecoder5.bytesToDiscard = '#';
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent24 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext23, exceptionEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.getlengthAdjustment();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dynamicChannelBuffer9.bytesBefore((int) ' ', channelBufferIndexFinder24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer24.order();
        dynamicChannelBuffer24.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer24.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer24.readBytes((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertNotNull(channelBuffer29);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeZero((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: length must be 0 or greater than 0.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer9.buffer;
        boolean boolean12 = dynamicChannelBuffer9.isDirect();
        dynamicChannelBuffer9.setInt((int) (byte) 0, (int) '#');
        java.lang.String str16 = dynamicChannelBuffer9.toString();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(10, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=10)" + "'", str16, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        dynamicChannelBuffer7.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer7.buffer;
        dynamicChannelBuffer7.resetReaderIndex();
        dynamicChannelBuffer7.writeDouble(10.0d);
        dynamicChannelBuffer1.setBytes(0, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dynamicChannelBuffer7.getUnsignedMedium((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        boolean boolean8 = lengthFieldBasedFrameDecoder3.discardingTooLongFrame;
        int int9 = lengthFieldBasedFrameDecoder3.getinitialBytesToStrip();
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        int int9 = dynamicChannelBuffer7.capacity();
        dynamicChannelBuffer7.resetWriterIndex();
        dynamicChannelBuffer7.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer7.duplicate();
        dynamicChannelBuffer7.writeMedium((int) '\000');
        boolean boolean17 = dynamicChannelBuffer7.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int20 = dynamicChannelBuffer19.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder21 = null;
        int int22 = dynamicChannelBuffer19.bytesBefore(channelBufferIndexFinder21);
        float float24 = dynamicChannelBuffer19.getFloat(0);
        dynamicChannelBuffer19.writeLong((long) (short) 0);
        dynamicChannelBuffer19.resetReaderIndex();
        dynamicChannelBuffer19.ensureWritableBytes(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer32 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray33 = dynamicChannelBuffer32.array();
        dynamicChannelBuffer19.getBytes((int) (short) 1, byteArray33, 2, 4);
        dynamicChannelBuffer7.writeBytes(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = lengthFieldBasedFrameDecoder5.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer7, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int14 = dynamicChannelBuffer13.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer13.copy();
        dynamicChannelBuffer13.writeChar((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(channelBuffer15);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer6.order();
        int int8 = dynamicChannelBuffer6.capacity();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer6.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer6.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer6.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        dynamicChannelBuffer13.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer13.buffer;
        dynamicChannelBuffer13.writeChar((int) (short) 1);
        dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 0);
        dynamicChannelBuffer6.markWriterIndex();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer25 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean26 = dynamicChannelBuffer25.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = dynamicChannelBuffer25.buffer;
        boolean boolean28 = dynamicChannelBuffer25.isDirect();
        dynamicChannelBuffer25.setInt((int) (byte) 0, (int) '#');
        java.lang.String str32 = dynamicChannelBuffer25.toString();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(channelBuffer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DynamicChannelBuffer(ridx=0, widx=0, cap=10)" + "'", str32, "DynamicChannelBuffer(ridx=0, widx=0, cap=10)");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        dynamicChannelBuffer1.writeZero(4);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer1.bytesBefore(1, (int) '\000', channelBufferIndexFinder11);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.settooLongFrameLength((long) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.failIfNecessary(channelHandlerContext10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer byteBuffer5 = dynamicChannelBuffer1.toByteBuffer(97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        dynamicChannelBuffer1.writeChar((int) (byte) 100);
        java.nio.channels.ScatteringByteChannel scatteringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.setBytes((int) (byte) -1, scatteringByteChannel7, (-1048576));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.writeInt(0);
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.setBytes((int) (short) 1, inputStream8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (int) '\000', channelBufferIndexFinder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean17 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer16.buffer;
        boolean boolean19 = dynamicChannelBuffer16.isDirect();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        int int21 = dynamicChannelBuffer16.readableBytes();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer23 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int24 = dynamicChannelBuffer23.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder25 = null;
        int int26 = dynamicChannelBuffer23.bytesBefore(channelBufferIndexFinder25);
        float float28 = dynamicChannelBuffer23.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer23.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer16.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer23, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer29);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        boolean boolean5 = dynamicChannelBuffer1.writable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.slice();
        int int7 = dynamicChannelBuffer1.arrayOffset();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(outputStream8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) '\000');
        boolean boolean11 = dynamicChannelBuffer1.hasArray();
        java.nio.channels.ScatteringByteChannel scatteringByteChannel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.writeBytes(scatteringByteChannel12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        int int7 = dynamicChannelBuffer1.readerIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        int int12 = dynamicChannelBuffer10.capacity();
        java.nio.ByteBuffer byteBuffer13 = dynamicChannelBuffer10.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer10.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer10.copy();
        java.nio.charset.Charset charset16 = null;
        java.lang.String str17 = dynamicChannelBuffer10.toString(charset16);
        java.nio.ByteBuffer[] byteBufferArray18 = dynamicChannelBuffer10.toByteBuffers();
        dynamicChannelBuffer10.writeByte((int) (byte) -16);
        int int22 = dynamicChannelBuffer10.getMedium((int) (byte) 0);
        dynamicChannelBuffer10.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer10.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(11, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer10, 11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(byteBuffer13);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(byteBufferArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1048576) + "'", int22 == (-1048576));
        org.junit.Assert.assertNotNull(channelBuffer24);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        boolean boolean7 = dynamicChannelBuffer1.equals((java.lang.Object) (byte) 0);
        java.nio.ByteBuffer byteBuffer10 = dynamicChannelBuffer1.toByteBuffer(0, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        int int15 = dynamicChannelBuffer13.capacity();
        java.nio.ByteBuffer byteBuffer16 = dynamicChannelBuffer13.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer13.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer13.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder21 = dynamicChannelBuffer20.order();
        dynamicChannelBuffer20.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer20.buffer;
        dynamicChannelBuffer20.writeChar((int) (short) 1);
        dynamicChannelBuffer13.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer20, 0);
        dynamicChannelBuffer13.markWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuffer10);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(byteBuffer16);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertNotNull(byteOrder21);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.writeInt(0);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) '\000', outputStream8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        int int6 = dynamicChannelBuffer1.bytesBefore(1, (-1), (byte) 1);
        java.nio.channels.GatheringByteChannel gatheringByteChannel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = dynamicChannelBuffer1.getBytes(0, gatheringByteChannel8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.readBytes((int) '\000');
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(97, outputStream8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        long long11 = lengthFieldBasedFrameDecoder10.tooLongFrameLength;
        int int12 = lengthFieldBasedFrameDecoder10.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder10.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int7 = dynamicChannelBuffer6.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer6.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean12 = dynamicChannelBuffer11.readable();
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder13, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        dynamicChannelBuffer15.writeBytes(byteArray29);
        dynamicChannelBuffer6.getBytes(0, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (byte) 10, byteArray29, (int) (byte) 100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer5.order();
        int int7 = dynamicChannelBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer5.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer5.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.copy();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer5.setBytes((int) (short) 1, byteArray17);
        dynamicChannelBuffer1.writeBytes(byteArray17);
        int int20 = dynamicChannelBuffer1.arrayOffset();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer22 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer22.copy();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(channelBuffer23, (int) (byte) 100, (-1048576));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(channelBuffer23);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.markWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray7 = dynamicChannelBuffer1.toByteBuffers();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int11 = dynamicChannelBuffer9.capacity();
        dynamicChannelBuffer9.resetWriterIndex();
        dynamicChannelBuffer9.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer9.duplicate();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.setChar((int) (byte) 1, (int) (short) 1);
        int int22 = dynamicChannelBuffer9.bytesBefore((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dynamicChannelBuffer1.bytesBefore(11, channelBufferIndexFinder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(channelBuffer10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.ensureWritableBytes(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray15 = dynamicChannelBuffer14.array();
        dynamicChannelBuffer1.getBytes((int) (short) 1, byteArray15, 2, 4);
        dynamicChannelBuffer1.clear();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer21 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray22 = dynamicChannelBuffer21.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray22, (int) 'a', 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 0;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.settooLongFrameLength((long) 1);
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (int) '\000', channelBufferIndexFinder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean17 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer16.buffer;
        boolean boolean19 = dynamicChannelBuffer16.isDirect();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        dynamicChannelBuffer16.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer16.getUnsignedShort((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.buffer;
        boolean boolean4 = dynamicChannelBuffer1.isDirect();
        int int6 = dynamicChannelBuffer1.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.readSlice((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readUnsignedMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writerIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray6 = dynamicChannelBuffer5.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((int) (short) 1, byteArray6, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readerIndex((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.readBytes((int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int10 = dynamicChannelBuffer9.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        int int12 = dynamicChannelBuffer9.bytesBefore(channelBufferIndexFinder11);
        float float14 = dynamicChannelBuffer9.getFloat(0);
        dynamicChannelBuffer9.writeLong((long) (short) 0);
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.setInt(2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes(100, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        boolean boolean23 = dynamicChannelBuffer9.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.readerIndex((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.Channel channel8 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer10.order();
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer10.endianness;
        dynamicChannelBuffer10.writeChar((int) 'a');
        boolean boolean15 = dynamicChannelBuffer10.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        dynamicChannelBuffer17.resetWriterIndex();
        dynamicChannelBuffer17.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer17.duplicate();
        dynamicChannelBuffer17.clear();
        dynamicChannelBuffer17.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer17.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer17.readBytes(0);
        int int33 = dynamicChannelBuffer10.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        java.lang.Object obj34 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext7, channel8, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer17);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext35 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent36 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext35, childChannelStateEvent36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setIndex((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.markWriterIndex();
        int int4 = dynamicChannelBuffer1.writableBytes();
        dynamicChannelBuffer1.setByte(4, 100);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteArray13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        int int20 = dynamicChannelBuffer17.bytesBefore(channelBufferIndexFinder19);
        float float22 = dynamicChannelBuffer17.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer17.copy();
        dynamicChannelBuffer1.setBytes(2, channelBuffer23, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer27.order();
        dynamicChannelBuffer27.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.buffer;
        dynamicChannelBuffer27.resetReaderIndex();
        dynamicChannelBuffer27.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder36 = dynamicChannelBuffer35.order();
        int int37 = dynamicChannelBuffer35.capacity();
        java.nio.ByteBuffer byteBuffer38 = dynamicChannelBuffer35.toByteBuffer();
        dynamicChannelBuffer27.getBytes((int) (short) 10, byteBuffer38);
        dynamicChannelBuffer1.readBytes(byteBuffer38);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = dynamicChannelBuffer1.indexOf(10, (-1048576), channelBufferIndexFinder44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(channelBuffer41);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        boolean boolean5 = dynamicChannelBuffer1.writable();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer7.order();
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer7.endianness;
        dynamicChannelBuffer7.writeChar((int) 'a');
        boolean boolean12 = dynamicChannelBuffer7.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder15 = dynamicChannelBuffer14.order();
        int int16 = dynamicChannelBuffer14.capacity();
        dynamicChannelBuffer14.resetWriterIndex();
        dynamicChannelBuffer14.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer14.duplicate();
        dynamicChannelBuffer14.clear();
        dynamicChannelBuffer14.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer14.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer14.readBytes(0);
        int int30 = dynamicChannelBuffer7.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer33 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder34 = dynamicChannelBuffer33.order();
        int int35 = dynamicChannelBuffer33.capacity();
        java.nio.ByteBuffer byteBuffer36 = dynamicChannelBuffer33.toByteBuffer();
        dynamicChannelBuffer14.getBytes((int) (byte) 10, byteBuffer36);
        dynamicChannelBuffer1.readBytes(byteBuffer36);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory39 = dynamicChannelBuffer1.factory();
        java.nio.charset.Charset charset40 = null;
        java.lang.String str41 = dynamicChannelBuffer1.toString(charset40);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer44 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder45 = dynamicChannelBuffer44.order();
        java.nio.ByteOrder byteOrder46 = dynamicChannelBuffer44.endianness;
        dynamicChannelBuffer44.writeChar((int) 'a');
        boolean boolean49 = dynamicChannelBuffer44.hasArray();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder52 = null;
        int int53 = dynamicChannelBuffer44.indexOf((int) (byte) 100, (int) '4', channelBufferIndexFinder52);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(97, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer44, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteOrder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(byteOrder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(byteBuffer36);
        org.junit.Assert.assertNotNull(channelBufferFactory39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(byteOrder45);
        org.junit.Assert.assertNotNull(byteOrder46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        lengthFieldBasedFrameDecoder5.settooLongFrameLength((long) (byte) -1);
        int int20 = lengthFieldBasedFrameDecoder5.lengthFieldLength;
        int int21 = lengthFieldBasedFrameDecoder5.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        boolean boolean7 = dynamicChannelBuffer1.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short short8 = dynamicChannelBuffer1.readUnsignedByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        dynamicChannelBuffer1.writerIndex((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            double double16 = dynamicChannelBuffer1.getDouble((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer1.endianness;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) 0, outputStream12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        boolean boolean15 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer17.slice();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer17.order();
        dynamicChannelBuffer17.discardReadBytes();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer17;
        java.nio.channels.ScatteringByteChannel scatteringByteChannel24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dynamicChannelBuffer1.setBytes((int) (short) 0, scatteringByteChannel24, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        java.nio.ByteOrder byteOrder4 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.writeLong((long) '4');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray10 = dynamicChannelBuffer9.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes((-1), byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(byteOrder4);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        byte byte8 = dynamicChannelBuffer1.getByte((int) (short) 1);
        dynamicChannelBuffer1.setMedium(1, (-1));
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -16 + "'", byte8 == (byte) -16);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        byte[] byteArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.readBytes(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setMedium((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        java.nio.charset.Charset charset7 = null;
        java.lang.String str8 = dynamicChannelBuffer1.toString(charset7);
        java.nio.ByteBuffer[] byteBufferArray9 = dynamicChannelBuffer1.toByteBuffers();
        dynamicChannelBuffer1.writeByte((int) (byte) -16);
        int int13 = dynamicChannelBuffer1.getMedium((int) (byte) 0);
        int int14 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteBufferArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1048576) + "'", int13 == (-1048576));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        dynamicChannelBuffer1.writeChar((int) 'a');
        boolean boolean6 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        int int10 = dynamicChannelBuffer8.capacity();
        dynamicChannelBuffer8.resetWriterIndex();
        dynamicChannelBuffer8.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer8.duplicate();
        dynamicChannelBuffer8.clear();
        dynamicChannelBuffer8.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer8.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer8.readBytes(0);
        int int24 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.ByteBuffer[] byteBufferArray27 = dynamicChannelBuffer1.toByteBuffers((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.writeInt(10);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dynamicChannelBuffer1.writeBytes(inputStream9, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.getInt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean8 = dynamicChannelBuffer7.readable();
        dynamicChannelBuffer7.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder11 = dynamicChannelBuffer7.getendianness();
        boolean boolean12 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder11);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int15 = dynamicChannelBuffer14.writerIndex();
        dynamicChannelBuffer14.writeLong((long) 'a');
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer14.setLong((int) ' ', (long) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteOrder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeFloat((float) (short) 10);
        dynamicChannelBuffer1.markWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.getbuffer();
        java.nio.channels.GatheringByteChannel gatheringByteChannel7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dynamicChannelBuffer1.readBytes(gatheringByteChannel7, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 97, (-1048576), (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1048576");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (int) '\000', channelBufferIndexFinder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean17 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer16.buffer;
        boolean boolean19 = dynamicChannelBuffer16.isDirect();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer16.getBytes((int) (byte) 1, outputStream22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        lengthFieldBasedFrameDecoder7.bytesToDiscard = (short) 100;
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        lengthFieldBasedFrameDecoder3.settooLongFrameLength((long) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dynamicChannelBuffer1.readUnsignedShort();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame = true;
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean10 = lengthFieldBasedFrameDecoder3.getdiscardingTooLongFrame();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray2 = dynamicChannelBuffer1.array();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean7 = dynamicChannelBuffer6.readable();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer6.order();
        boolean boolean9 = dynamicChannelBuffer6.readable();
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer6.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int14 = dynamicChannelBuffer13.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder15 = null;
        int int16 = dynamicChannelBuffer13.bytesBefore(channelBufferIndexFinder15);
        boolean boolean17 = dynamicChannelBuffer13.writable();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory18 = dynamicChannelBuffer13.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder10, (int) (short) 1, channelBufferFactory18);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder3, (-1048576), channelBufferFactory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: estimatedLength: -1048576");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(channelBufferFactory18);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.writeMedium((int) '\000');
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dynamicChannelBuffer1.readDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.writeLong((long) 'a');
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dynamicChannelBuffer1.toString(charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        long long17 = lengthFieldBasedFrameDecoder5.tooLongFrameLength;
        lengthFieldBasedFrameDecoder5.settooLongFrameLength((long) (byte) -1);
        int int20 = lengthFieldBasedFrameDecoder5.lengthFieldLength;
        lengthFieldBasedFrameDecoder5.bytesToDiscard = '#';
        long long23 = lengthFieldBasedFrameDecoder5.getbytesToDiscard();
        lengthFieldBasedFrameDecoder5.failImmediatelyOnTooLongFrame = false;
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer1.getendianness();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 100);
        dynamicChannelBuffer14.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.order();
        dynamicChannelBuffer19.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer19.buffer;
        dynamicChannelBuffer19.resetReaderIndex();
        dynamicChannelBuffer19.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer27.order();
        int int29 = dynamicChannelBuffer27.capacity();
        java.nio.ByteBuffer byteBuffer30 = dynamicChannelBuffer27.toByteBuffer();
        dynamicChannelBuffer19.getBytes((int) (short) 10, byteBuffer30);
        dynamicChannelBuffer14.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer19);
        dynamicChannelBuffer14.writeInt((int) (byte) 1);
        byte byte36 = dynamicChannelBuffer14.getByte(0);
        byte[] byteArray37 = dynamicChannelBuffer14.array();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray37, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(byteBuffer30);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 0 + "'", byte36 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        boolean boolean15 = dynamicChannelBuffer1.hasArray();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dynamicChannelBuffer1.bytesBefore((-1048576), (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        dynamicChannelBuffer1.setDouble(0, (double) 1.0f);
        byte byte8 = dynamicChannelBuffer1.getByte((int) (short) 1);
        dynamicChannelBuffer1.setMedium(1, (-1));
        dynamicChannelBuffer1.discardReadBytes();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = dynamicChannelBuffer1.slice();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -16 + "'", byte8 == (byte) -16);
        org.junit.Assert.assertNotNull(channelBuffer13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        dynamicChannelBuffer4.writeInt((int) (byte) 1);
        byte byte26 = dynamicChannelBuffer4.getByte(0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.setIndex(3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        dynamicChannelBuffer1.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dynamicChannelBuffer1.bytesBefore(8, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int13 = dynamicChannelBuffer12.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer12.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = dynamicChannelBuffer12.getbuffer();
        java.lang.Object obj16 = lengthFieldBasedFrameDecoder5.decode(channelHandlerContext9, channel10, channelBuffer15);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(channelBuffer15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer8 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder9 = dynamicChannelBuffer8.order();
        dynamicChannelBuffer8.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer8.buffer;
        dynamicChannelBuffer8.writeChar((int) (short) 1);
        dynamicChannelBuffer1.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer8, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer8.slice(0, (int) (byte) -16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteOrder9);
        org.junit.Assert.assertNotNull(channelBuffer11);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer1.writeLong((-1L));
        dynamicChannelBuffer1.readerIndex((int) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer7 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int8 = dynamicChannelBuffer7.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder9 = null;
        int int10 = dynamicChannelBuffer7.bytesBefore(channelBufferIndexFinder9);
        float float12 = dynamicChannelBuffer7.getFloat(0);
        dynamicChannelBuffer7.writeLong((long) (short) 0);
        dynamicChannelBuffer7.resetReaderIndex();
        dynamicChannelBuffer7.ensureWritableBytes(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer20 = new org.jboss.netty.buffer.DynamicChannelBuffer((int) '4');
        byte[] byteArray21 = dynamicChannelBuffer20.array();
        dynamicChannelBuffer7.getBytes((int) (short) 1, byteArray21, 2, 4);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.writeBytes(byteArray21, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        int int11 = dynamicChannelBuffer9.capacity();
        dynamicChannelBuffer9.resetWriterIndex();
        dynamicChannelBuffer9.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer9.duplicate();
        dynamicChannelBuffer9.clear();
        dynamicChannelBuffer9.setChar((int) (byte) 1, (int) (short) 1);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = lengthFieldBasedFrameDecoder3.extractFrame((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9, (int) (short) 10, (int) (byte) 0);
        dynamicChannelBuffer9.writeLong((long) '\000');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer27.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer30 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder28, (int) (byte) 100);
        dynamicChannelBuffer30.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder36 = dynamicChannelBuffer35.order();
        dynamicChannelBuffer35.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer38 = dynamicChannelBuffer35.buffer;
        dynamicChannelBuffer35.resetReaderIndex();
        dynamicChannelBuffer35.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder44 = dynamicChannelBuffer43.order();
        int int45 = dynamicChannelBuffer43.capacity();
        java.nio.ByteBuffer byteBuffer46 = dynamicChannelBuffer43.toByteBuffer();
        dynamicChannelBuffer35.getBytes((int) (short) 10, byteBuffer46);
        dynamicChannelBuffer30.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer50 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder51 = dynamicChannelBuffer50.order();
        int int52 = dynamicChannelBuffer50.capacity();
        java.nio.ByteBuffer byteBuffer53 = dynamicChannelBuffer50.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer54 = dynamicChannelBuffer50.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer55 = dynamicChannelBuffer50.copy();
        java.nio.charset.Charset charset56 = null;
        java.lang.String str57 = dynamicChannelBuffer50.toString(charset56);
        java.nio.ByteBuffer[] byteBufferArray58 = dynamicChannelBuffer50.toByteBuffers();
        dynamicChannelBuffer50.writeByte((int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder63 = dynamicChannelBuffer62.order();
        dynamicChannelBuffer62.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer65 = dynamicChannelBuffer62.buffer;
        dynamicChannelBuffer62.resetReaderIndex();
        dynamicChannelBuffer62.writeDouble(10.0d);
        long long69 = dynamicChannelBuffer62.readLong();
        dynamicChannelBuffer50.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer62);
        dynamicChannelBuffer35.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer50);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer50, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertNotNull(channelBuffer38);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(byteBuffer46);
        org.junit.Assert.assertNotNull(byteOrder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(byteBuffer53);
        org.junit.Assert.assertNotNull(channelBuffer54);
        org.junit.Assert.assertNotNull(channelBuffer55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(byteBufferArray58);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertNotNull(channelBuffer65);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 4621819117588971520L + "'", long69 == 4621819117588971520L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer5.order();
        int int7 = dynamicChannelBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer5.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer5.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.copy();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer5.setBytes((int) (short) 1, byteArray17);
        dynamicChannelBuffer1.writeBytes(byteArray17);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dynamicChannelBuffer1.compareTo(channelBuffer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        boolean boolean5 = dynamicChannelBuffer1.writable();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dynamicChannelBuffer1.bytesBefore(10, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        lengthFieldBasedFrameDecoder3.discardingTooLongFrame = true;
        int int10 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        dynamicChannelBuffer1.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer1.duplicate();
        int int9 = dynamicChannelBuffer1.writerIndex();
        byte[] byteArray10 = new byte[] {};
        dynamicChannelBuffer1.writeBytes(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dynamicChannelBuffer1.bytesBefore(97, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = dynamicChannelBuffer1.readByte();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.getbuffer();
        boolean boolean4 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writerIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.endianness;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer5 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder6 = dynamicChannelBuffer5.order();
        int int7 = dynamicChannelBuffer5.capacity();
        java.nio.ByteBuffer byteBuffer8 = dynamicChannelBuffer5.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer9 = dynamicChannelBuffer5.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer5.copy();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer5.setBytes((int) (short) 1, byteArray17);
        dynamicChannelBuffer1.writeBytes(byteArray17);
        dynamicChannelBuffer1.setInt((int) (short) 1, (int) (byte) 64);
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertNotNull(byteOrder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(byteBuffer8);
        org.junit.Assert.assertNotNull(channelBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 0, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame = false;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        dynamicChannelBuffer1.writeLong((long) (short) 0);
        dynamicChannelBuffer1.resetReaderIndex();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory10 = dynamicChannelBuffer1.factory();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder13 = null;
        int int14 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, (int) '\000', channelBufferIndexFinder13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer16 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean17 = dynamicChannelBuffer16.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = dynamicChannelBuffer16.buffer;
        boolean boolean19 = dynamicChannelBuffer16.isDirect();
        int int20 = dynamicChannelBuffer1.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer16);
        dynamicChannelBuffer16.resetWriterIndex();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer16.setIndex((int) (short) 100, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBufferFactory10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(channelBuffer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.getlengthFieldOffset();
        int int7 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        int int8 = lengthFieldBasedFrameDecoder3.getmaxFrameLength();
        int int9 = lengthFieldBasedFrameDecoder3.lengthFieldLength;
        int int10 = lengthFieldBasedFrameDecoder3.lengthFieldOffset;
        boolean boolean11 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        int int9 = lengthFieldBasedFrameDecoder5.lengthFieldOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        long long9 = lengthFieldBasedFrameDecoder5.gettooLongFrameLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.failIfNecessary(channelHandlerContext10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        lengthFieldBasedFrameDecoder3.bytesToDiscard = (short) 0;
        int int9 = lengthFieldBasedFrameDecoder3.getlengthFieldLength();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder3 = null;
        int int4 = dynamicChannelBuffer1.bytesBefore(channelBufferIndexFinder3);
        float float6 = dynamicChannelBuffer1.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer7 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean10 = dynamicChannelBuffer9.readable();
        dynamicChannelBuffer9.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer9.getendianness();
        boolean boolean14 = dynamicChannelBuffer1.equals((java.lang.Object) byteOrder13);
        boolean boolean15 = dynamicChannelBuffer1.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = dynamicChannelBuffer17.slice();
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer17.order();
        dynamicChannelBuffer17.discardReadBytes();
        dynamicChannelBuffer1.buffer = dynamicChannelBuffer17;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dynamicChannelBuffer17.getUnsignedInt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(channelBuffer19);
        org.junit.Assert.assertNotNull(byteOrder20);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        dynamicChannelBuffer4.writeInt((int) (byte) 1);
        byte byte26 = dynamicChannelBuffer4.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder29 = dynamicChannelBuffer28.order();
        int int30 = dynamicChannelBuffer28.capacity();
        java.nio.ByteBuffer byteBuffer31 = dynamicChannelBuffer28.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer28.buffer;
        boolean boolean34 = dynamicChannelBuffer28.equals((java.lang.Object) (byte) 0);
        dynamicChannelBuffer4.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer38 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean39 = dynamicChannelBuffer38.readable();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer38.buffer;
        boolean boolean41 = dynamicChannelBuffer38.isDirect();
        int int43 = dynamicChannelBuffer38.getMedium((int) (short) 0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer45 = dynamicChannelBuffer38.readSlice((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer4.setBytes((int) (byte) -16, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer38, (int) (short) -4096, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(channelBuffer45);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        dynamicChannelBuffer4.writeInt((int) (byte) 1);
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dynamicChannelBuffer4.indexOf((-1), (int) (short) 10, channelBufferIndexFinder27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        int int4 = lengthFieldBasedFrameDecoder3.maxFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder6 = null;
        int int7 = dynamicChannelBuffer1.bytesBefore((int) (byte) 100, 0, channelBufferIndexFinder6);
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory8 = dynamicChannelBuffer1.factory;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        dynamicChannelBuffer11.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = dynamicChannelBuffer11.buffer;
        dynamicChannelBuffer11.resetReaderIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        java.nio.ByteOrder byteOrder19 = dynamicChannelBuffer17.endianness;
        dynamicChannelBuffer17.writeChar((int) 'a');
        boolean boolean22 = dynamicChannelBuffer17.hasArray();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer24.order();
        int int26 = dynamicChannelBuffer24.capacity();
        dynamicChannelBuffer24.resetWriterIndex();
        dynamicChannelBuffer24.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer31 = dynamicChannelBuffer24.duplicate();
        dynamicChannelBuffer24.clear();
        dynamicChannelBuffer24.setChar((int) (byte) 1, (int) (short) 1);
        dynamicChannelBuffer24.writeLong((long) (short) 10);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer24.readBytes(0);
        int int40 = dynamicChannelBuffer17.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer43 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder44 = dynamicChannelBuffer43.order();
        int int45 = dynamicChannelBuffer43.capacity();
        java.nio.ByteBuffer byteBuffer46 = dynamicChannelBuffer43.toByteBuffer();
        dynamicChannelBuffer24.getBytes((int) (byte) 10, byteBuffer46);
        dynamicChannelBuffer11.writeBytes(byteBuffer46);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.getBytes((int) (byte) -16, byteBuffer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(channelBufferFactory8);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNotNull(channelBuffer14);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertNotNull(byteOrder19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(channelBuffer31);
        org.junit.Assert.assertNotNull(channelBuffer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(byteOrder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(byteBuffer46);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        int int7 = lengthFieldBasedFrameDecoder3.lengthFieldEndOffset;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        dynamicChannelBuffer1.ensureWritableBytes(10);
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dynamicChannelBuffer1.toString((int) 'a', (int) (byte) -16, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        int int11 = lengthFieldBasedFrameDecoder5.getinitialBytesToStrip();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dynamicChannelBuffer1.readMedium();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean7 = dynamicChannelBuffer6.readable();
        java.nio.ByteOrder byteOrder8 = dynamicChannelBuffer6.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer10 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder8, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer12 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer12.order();
        int int14 = dynamicChannelBuffer12.capacity();
        java.nio.ByteBuffer byteBuffer15 = dynamicChannelBuffer12.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer12.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = dynamicChannelBuffer12.copy();
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer12.setBytes((int) (short) 1, byteArray24);
        dynamicChannelBuffer10.writeBytes(byteArray24);
        dynamicChannelBuffer1.getBytes(0, byteArray24);
        dynamicChannelBuffer1.writeByte((int) 'a');
        java.nio.charset.Charset charset30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dynamicChannelBuffer1.toString(charset30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: charset");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteOrder8);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(byteBuffer15);
        org.junit.Assert.assertNotNull(channelBuffer16);
        org.junit.Assert.assertNotNull(channelBuffer17);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.resetReaderIndex();
        dynamicChannelBuffer1.writeDouble(10.0d);
        long long8 = dynamicChannelBuffer1.readLong();
        org.jboss.netty.buffer.ChannelBufferFactory channelBufferFactory9 = dynamicChannelBuffer1.factory;
        java.nio.charset.Charset charset10 = null;
        java.lang.String str11 = dynamicChannelBuffer1.toString(charset10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = dynamicChannelBuffer1.getDouble((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4621819117588971520L + "'", long8 == 4621819117588971520L);
        org.junit.Assert.assertNotNull(channelBufferFactory9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        dynamicChannelBuffer1.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.buffer;
        dynamicChannelBuffer1.writeChar((int) (short) 1);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer1.order();
        java.lang.Class<?> wildcardClass8 = dynamicChannelBuffer1.getClass();
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        dynamicChannelBuffer4.writeInt((int) (byte) 1);
        byte byte26 = dynamicChannelBuffer4.getByte(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer28 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder29 = dynamicChannelBuffer28.order();
        int int30 = dynamicChannelBuffer28.capacity();
        java.nio.ByteBuffer byteBuffer31 = dynamicChannelBuffer28.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer32 = dynamicChannelBuffer28.buffer;
        boolean boolean34 = dynamicChannelBuffer28.equals((java.lang.Object) (byte) 0);
        dynamicChannelBuffer4.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer28);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer37 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder38 = dynamicChannelBuffer37.order();
        int int39 = dynamicChannelBuffer37.capacity();
        java.nio.ByteBuffer byteBuffer40 = dynamicChannelBuffer37.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer41 = dynamicChannelBuffer37.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer42 = dynamicChannelBuffer37.copy();
        java.nio.charset.Charset charset43 = null;
        java.lang.String str44 = dynamicChannelBuffer37.toString(charset43);
        java.nio.ByteBuffer[] byteBufferArray45 = dynamicChannelBuffer37.toByteBuffers();
        dynamicChannelBuffer37.setInt((int) (byte) 1, (int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer51 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean52 = dynamicChannelBuffer51.readable();
        java.nio.ByteOrder byteOrder53 = dynamicChannelBuffer51.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer55 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder53, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer57 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        dynamicChannelBuffer57.writeLong((-1L));
        dynamicChannelBuffer55.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer57);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder63 = dynamicChannelBuffer62.order();
        int int64 = dynamicChannelBuffer62.capacity();
        java.nio.ByteBuffer byteBuffer65 = dynamicChannelBuffer62.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer66 = dynamicChannelBuffer62.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer67 = dynamicChannelBuffer62.copy();
        byte[] byteArray74 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer62.setBytes((int) (short) 1, byteArray74);
        dynamicChannelBuffer55.writeBytes(byteArray74);
        dynamicChannelBuffer37.setBytes((int) (byte) 0, byteArray74);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer28.readBytes(byteArray74, 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
        org.junit.Assert.assertNotNull(byteOrder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(byteBuffer31);
        org.junit.Assert.assertNotNull(channelBuffer32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteOrder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(byteBuffer40);
        org.junit.Assert.assertNotNull(channelBuffer41);
        org.junit.Assert.assertNotNull(channelBuffer42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(byteBufferArray45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteOrder53);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(byteBuffer65);
        org.junit.Assert.assertNotNull(channelBuffer66);
        org.junit.Assert.assertNotNull(channelBuffer67);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[10, 1, 10, 0, 10]");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        java.nio.ByteOrder byteOrder3 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int7 = dynamicChannelBuffer6.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = dynamicChannelBuffer6.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean12 = dynamicChannelBuffer11.readable();
        java.nio.ByteOrder byteOrder13 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer15 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder13, (int) '#');
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = dynamicChannelBuffer17.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = dynamicChannelBuffer17.copy();
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer17.setBytes((int) (short) 1, byteArray29);
        dynamicChannelBuffer15.writeBytes(byteArray29);
        dynamicChannelBuffer6.getBytes(0, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setBytes(97, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(channelBuffer8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteOrder13);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(channelBuffer21);
        org.junit.Assert.assertNotNull(channelBuffer22);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int2 = dynamicChannelBuffer1.writerIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer3 = dynamicChannelBuffer1.slice();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer4 = dynamicChannelBuffer1.getbuffer();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer6 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder7 = dynamicChannelBuffer6.order();
        int int8 = dynamicChannelBuffer6.capacity();
        java.nio.ByteBuffer byteBuffer9 = dynamicChannelBuffer6.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = dynamicChannelBuffer6.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = dynamicChannelBuffer6.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer13 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder14 = dynamicChannelBuffer13.order();
        dynamicChannelBuffer13.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = dynamicChannelBuffer13.buffer;
        dynamicChannelBuffer13.writeChar((int) (short) 1);
        dynamicChannelBuffer6.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer13, 0);
        dynamicChannelBuffer6.markWriterIndex();
        dynamicChannelBuffer1.setbuffer((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer6);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dynamicChannelBuffer1.readInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(channelBuffer3);
        org.junit.Assert.assertNotNull(channelBuffer4);
        org.junit.Assert.assertNotNull(byteOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(byteBuffer9);
        org.junit.Assert.assertNotNull(channelBuffer10);
        org.junit.Assert.assertNotNull(channelBuffer11);
        org.junit.Assert.assertNotNull(byteOrder14);
        org.junit.Assert.assertNotNull(channelBuffer16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        java.nio.ByteBuffer byteBuffer4 = dynamicChannelBuffer1.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer5 = dynamicChannelBuffer1.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = dynamicChannelBuffer1.copy();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer1.setBytes((int) (short) 1, byteArray13);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        int int18 = dynamicChannelBuffer17.writerIndex();
        org.jboss.netty.buffer.ChannelBufferIndexFinder channelBufferIndexFinder19 = null;
        int int20 = dynamicChannelBuffer17.bytesBefore(channelBufferIndexFinder19);
        float float22 = dynamicChannelBuffer17.getFloat(0);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer17.copy();
        dynamicChannelBuffer1.setBytes(2, channelBuffer23, (int) (byte) 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer27 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder28 = dynamicChannelBuffer27.order();
        dynamicChannelBuffer27.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = dynamicChannelBuffer27.buffer;
        dynamicChannelBuffer27.resetReaderIndex();
        dynamicChannelBuffer27.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder36 = dynamicChannelBuffer35.order();
        int int37 = dynamicChannelBuffer35.capacity();
        java.nio.ByteBuffer byteBuffer38 = dynamicChannelBuffer35.toByteBuffer();
        dynamicChannelBuffer27.getBytes((int) (short) 10, byteBuffer38);
        dynamicChannelBuffer1.readBytes(byteBuffer38);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = dynamicChannelBuffer1.bytesBefore((int) (byte) 10, (int) '4', (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBuffer4);
        org.junit.Assert.assertNotNull(channelBuffer5);
        org.junit.Assert.assertNotNull(channelBuffer6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(byteOrder28);
        org.junit.Assert.assertNotNull(channelBuffer30);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(byteBuffer38);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer4 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder2, (int) (byte) 100);
        dynamicChannelBuffer4.readerIndex(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer9 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder10 = dynamicChannelBuffer9.order();
        dynamicChannelBuffer9.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = dynamicChannelBuffer9.buffer;
        dynamicChannelBuffer9.resetReaderIndex();
        dynamicChannelBuffer9.markWriterIndex();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer17 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder18 = dynamicChannelBuffer17.order();
        int int19 = dynamicChannelBuffer17.capacity();
        java.nio.ByteBuffer byteBuffer20 = dynamicChannelBuffer17.toByteBuffer();
        dynamicChannelBuffer9.getBytes((int) (short) 10, byteBuffer20);
        dynamicChannelBuffer4.setBytes((int) 'a', (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer9);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer24 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder25 = dynamicChannelBuffer24.order();
        int int26 = dynamicChannelBuffer24.capacity();
        java.nio.ByteBuffer byteBuffer27 = dynamicChannelBuffer24.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer28 = dynamicChannelBuffer24.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer24.copy();
        java.nio.charset.Charset charset30 = null;
        java.lang.String str31 = dynamicChannelBuffer24.toString(charset30);
        java.nio.ByteBuffer[] byteBufferArray32 = dynamicChannelBuffer24.toByteBuffers();
        dynamicChannelBuffer24.writeByte((int) (byte) -16);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer36 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder37 = dynamicChannelBuffer36.order();
        dynamicChannelBuffer36.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer36.buffer;
        dynamicChannelBuffer36.resetReaderIndex();
        dynamicChannelBuffer36.writeDouble(10.0d);
        long long43 = dynamicChannelBuffer36.readLong();
        dynamicChannelBuffer24.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer36);
        dynamicChannelBuffer9.writeBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer24);
        short short47 = dynamicChannelBuffer24.getShort(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer49 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder50 = dynamicChannelBuffer49.order();
        int int51 = dynamicChannelBuffer49.capacity();
        java.nio.ByteBuffer byteBuffer52 = dynamicChannelBuffer49.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer53 = dynamicChannelBuffer49.buffer;
        boolean boolean55 = dynamicChannelBuffer49.equals((java.lang.Object) (byte) 0);
        java.nio.ByteBuffer byteBuffer58 = dynamicChannelBuffer49.toByteBuffer(0, 0);
        dynamicChannelBuffer24.readBytes(byteBuffer58);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer62 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder63 = dynamicChannelBuffer62.order();
        int int65 = dynamicChannelBuffer62.getMedium(0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer67 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder68 = dynamicChannelBuffer67.order();
        int int69 = dynamicChannelBuffer67.capacity();
        dynamicChannelBuffer67.resetWriterIndex();
        dynamicChannelBuffer67.setDouble(1, (double) 100L);
        org.jboss.netty.buffer.ChannelBuffer channelBuffer74 = dynamicChannelBuffer67.duplicate();
        int int75 = dynamicChannelBuffer67.writerIndex();
        byte[] byteArray76 = new byte[] {};
        dynamicChannelBuffer67.writeBytes(byteArray76);
        dynamicChannelBuffer62.readBytes(byteArray76);
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer24.getBytes((int) (byte) 10, byteArray76, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertNotNull(byteOrder10);
        org.junit.Assert.assertNotNull(channelBuffer12);
        org.junit.Assert.assertNotNull(byteOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuffer20);
        org.junit.Assert.assertNotNull(byteOrder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(byteBuffer27);
        org.junit.Assert.assertNotNull(channelBuffer28);
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteBufferArray32);
        org.junit.Assert.assertNotNull(byteOrder37);
        org.junit.Assert.assertNotNull(channelBuffer39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 4621819117588971520L + "'", long43 == 4621819117588971520L);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) -4096 + "'", short47 == (short) -4096);
        org.junit.Assert.assertNotNull(byteOrder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(byteBuffer52);
        org.junit.Assert.assertNotNull(channelBuffer53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteBuffer58);
        org.junit.Assert.assertNotNull(byteOrder63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(byteOrder68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(channelBuffer74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray76), "[]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder2 = dynamicChannelBuffer1.order();
        int int3 = dynamicChannelBuffer1.capacity();
        dynamicChannelBuffer1.resetWriterIndex();
        java.nio.ByteBuffer[] byteBufferArray5 = dynamicChannelBuffer1.toByteBuffers();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dynamicChannelBuffer1.getInt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteOrder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(byteBufferArray5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer1 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        boolean boolean2 = dynamicChannelBuffer1.readable();
        dynamicChannelBuffer1.writeMedium((int) (short) 10);
        java.nio.ByteOrder byteOrder5 = dynamicChannelBuffer1.getendianness();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer1.setChar((int) (short) -4096, (int) (short) -4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -4096");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteOrder5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        boolean boolean6 = lengthFieldBasedFrameDecoder3.failImmediatelyOnTooLongFrame;
        int int7 = lengthFieldBasedFrameDecoder3.lengthAdjustment;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer11 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder12 = dynamicChannelBuffer11.order();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer14 = new org.jboss.netty.buffer.DynamicChannelBuffer(byteOrder12, (int) (byte) 100);
        dynamicChannelBuffer14.readerIndex(0);
        java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decode(channelHandlerContext8, channel9, (org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer14);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer19 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder20 = dynamicChannelBuffer19.order();
        int int21 = dynamicChannelBuffer19.capacity();
        java.nio.ByteBuffer byteBuffer22 = dynamicChannelBuffer19.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer23 = dynamicChannelBuffer19.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = dynamicChannelBuffer19.copy();
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer26 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder27 = dynamicChannelBuffer26.order();
        dynamicChannelBuffer26.resetWriterIndex();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer29 = dynamicChannelBuffer26.buffer;
        dynamicChannelBuffer26.writeChar((int) (short) 1);
        dynamicChannelBuffer19.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, 0);
        org.jboss.netty.buffer.DynamicChannelBuffer dynamicChannelBuffer35 = new org.jboss.netty.buffer.DynamicChannelBuffer(10);
        java.nio.ByteOrder byteOrder36 = dynamicChannelBuffer35.order();
        int int37 = dynamicChannelBuffer35.capacity();
        java.nio.ByteBuffer byteBuffer38 = dynamicChannelBuffer35.toByteBuffer();
        org.jboss.netty.buffer.ChannelBuffer channelBuffer39 = dynamicChannelBuffer35.buffer;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer40 = dynamicChannelBuffer35.copy();
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 10 };
        dynamicChannelBuffer35.setBytes((int) (short) 1, byteArray47);
        int int49 = dynamicChannelBuffer26.compareTo((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer35);
        int int50 = dynamicChannelBuffer26.writableBytes();
        dynamicChannelBuffer26.clear();
        // The following exception was thrown during execution in test generation
        try {
            dynamicChannelBuffer14.readBytes((org.jboss.netty.buffer.ChannelBuffer) dynamicChannelBuffer26, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteOrder12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(byteOrder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(byteBuffer22);
        org.junit.Assert.assertNotNull(channelBuffer23);
        org.junit.Assert.assertNotNull(channelBuffer24);
        org.junit.Assert.assertNotNull(byteOrder27);
        org.junit.Assert.assertNotNull(channelBuffer29);
        org.junit.Assert.assertNotNull(byteOrder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(byteBuffer38);
        org.junit.Assert.assertNotNull(channelBuffer39);
        org.junit.Assert.assertNotNull(channelBuffer40);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 1, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        int int6 = lengthFieldBasedFrameDecoder5.getlengthAdjustment();
        lengthFieldBasedFrameDecoder5.discardingTooLongFrame = false;
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        long long11 = lengthFieldBasedFrameDecoder10.tooLongFrameLength;
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lengthFieldBasedFrameDecoder10.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }
}

